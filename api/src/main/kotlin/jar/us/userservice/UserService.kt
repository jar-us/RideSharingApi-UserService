package jar.us.userservice

import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class UserService(private val userDao: UserDao) {
    fun registerUser(userRegistration: UserRegistration) =
        userDao.saveUser(userRegistration.toUserAt()).toRegisteredUser()
}

data class UserRegistration(
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
)

data class RegisteredUser(
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
    val createdAt: LocalDateTime,
)

fun UserRegistration.toUserAt() = UserAt(
    phoneNumber = this.phoneNumber,
    name = this.name,
    email = this.email,
    password = this.password
)

fun UserAt.toRegisteredUser() = RegisteredUser(
    id = this.id!!,
    name = this.name,
    email = this.email,
    password = this.password,
    phoneNumber = this.phoneNumber,
    createdAt = this.createdAt!!
)
