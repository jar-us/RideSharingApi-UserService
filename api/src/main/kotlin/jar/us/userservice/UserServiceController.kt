package jar.us.userservice

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import view.model.UserRegistrationViewModel
import view.model.UserResponseViewModel
import java.time.ZoneOffset

@RestController
class UserServiceController(private val userService: UserService) {

    @PostMapping("/users/register")
    fun register(@RequestBody request: UserRegistrationViewModel) =
        userService.registerUser(request.toUserRegistration())
            .toUserResponseViewModel()
}

fun UserRegistrationViewModel.toUserRegistration() = UserRegistration(
    name = this.name!!,
    email = this.email!!,
    password = this.password!!,
    phoneNumber = this.phoneNumber!!
)

fun RegisteredUser.toUserResponseViewModel() = UserResponseViewModel(
    id = this.id,
    name = this.name,
    phoneNumber = this.phoneNumber,
    email = this.email,
    createdAt = this.createdAt.atOffset(ZoneOffset.UTC)
)
