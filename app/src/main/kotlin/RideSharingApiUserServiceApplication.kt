package jar.us.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RideSharingApiUserServiceApplication

fun main(args: Array<String>) {
    runApplication<RideSharingApiUserServiceApplication>(*args)
    println("Hello, RideSharingApiUserServiceApplication!")
}