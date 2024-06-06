package jar.us.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class RideSharingApiUserServiceApplication

fun main(args: Array<String>) {
    runApplication<RideSharingApiUserServiceApplication>(*args)
}