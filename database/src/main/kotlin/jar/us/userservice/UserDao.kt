package jar.us.userservice

import org.springframework.stereotype.Component
import java.time.LocalDateTime

interface UserDao {
    fun getAllUsers(): List<UserAt>
    fun getUser(id: Long): UserAt
    fun saveUser(user: UserAt): UserAt
    fun deleteUser(id: Long): Boolean
}


@Component
class UserDaoImpl(
    private val userRepository: UserRepository
) : UserDao {
    override fun getAllUsers(): List<UserAt> {
        return userRepository.findAll().map { it.toUser() }
    }

    override fun getUser(id: Long): UserAt {
        val userEntity = userRepository.findById(id).orElseThrow { RuntimeException("User not found") }
        return userEntity.toUser()
    }

    override fun saveUser(user: UserAt): UserAt {
        val userEntity = UserEntity().apply {
            name = user.name
            email = user.email
            password = user.password
            phoneNumber = user.phoneNumber
        }
        val savedUserEntity = userRepository.save(userEntity)
        return savedUserEntity.toUser()
    }

    override fun deleteUser(id: Long): Boolean {
        return try {
            userRepository.deleteById(id)
            true
        } catch (ex: Exception) {
            false
        }
    }
}

data class UserAt(
    val id: Long? = null,
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
    val createdAt: LocalDateTime? = null,
)

private fun UserEntity.toUser() = UserAt(
    id = this.id!!,
    name = this.name,
    email = this.email,
    password = this.password,
    phoneNumber = this.phoneNumber,
    createdAt = this.createdDate
)

