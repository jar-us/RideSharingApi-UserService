package jar.us.userservice

import org.springframework.stereotype.Component
import java.time.LocalDateTime

@Component
class UserService(
    private val userRepository: UserRepository,
) {
    fun registerUser(userRegistrationDto: UserRegistrationDto): User {
        val userEntity = UserEntity()
        userEntity.name = userRegistrationDto.name
        userEntity.email = userRegistrationDto.email
        userEntity.password = userRegistrationDto.password
        userEntity.phoneNumber = userRegistrationDto.phoneNumber

        val saveUserEntity = userRepository.save(userEntity)

        return User(
            id = saveUserEntity.id!!,
            name = saveUserEntity.name,
            email = saveUserEntity.email,
            password = saveUserEntity.password,
            phoneNumber = saveUserEntity.phoneNumber,
            createdAt = saveUserEntity.createdAt
        )
    }
}


data class UserRegistrationDto(
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
)

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val password: String,
    val phoneNumber: String,
    val createdAt: LocalDateTime,
)