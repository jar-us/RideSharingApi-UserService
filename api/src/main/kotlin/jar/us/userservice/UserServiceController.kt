package jar.us.userservice

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import view.model.UserRegistrationViewModel
import view.model.UserResponseViewModel
import java.time.ZoneOffset


@RestController
class UserServiceController(
    val userService: UserService,
) {

    @PostMapping("/users/register")
    fun register(@RequestBody request: UserRegistrationViewModel): UserResponseViewModel {
        val registrationDto = UserRegistrationDto(
            name = request.name!!,
            email = request.email!!,
            password = request.password!!,
            phoneNumber = request.phoneNumber!!
        )
        val registeredUser = userService.registerUser(registrationDto)

        return UserResponseViewModel(
            id = registeredUser.id,
            name = registeredUser.name,
            phoneNumber = registeredUser.phoneNumber,
            email = registeredUser.email,
            createdAt = registeredUser.createdAt.atOffset(ZoneOffset.UTC)
        )

    }

}
