package jar.us.userservice

import jakarta.persistence.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface UserRepository : JpaRepository<UserEntity, Long>

@Entity
@Table(name = "users", schema = "user_service")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    lateinit var name: String

    @Column(nullable = false)
    lateinit var password: String

    @Column(nullable = false)
    lateinit var email: String

    @Column(name = "phone_number", nullable = false)
    lateinit var phoneNumber: String

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now()

    @Column(name = "updated_at", nullable = true)
    var updatedAt: LocalDateTime? = null
}