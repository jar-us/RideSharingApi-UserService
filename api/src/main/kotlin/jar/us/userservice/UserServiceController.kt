package jar.us.userservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserServiceController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World"
    }
}
