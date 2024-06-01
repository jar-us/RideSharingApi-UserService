package jar.us.userservice

import jar.us.printHello
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RideSharingApiUserServiceApplication

fun main() {
    runApplication<RideSharingApiUserServiceApplication>()
    println("Hello, World!!!")
    printHello()
}