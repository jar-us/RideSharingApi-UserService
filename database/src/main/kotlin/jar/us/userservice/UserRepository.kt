package jar.us.userservice

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface UserRepository : JpaRepository<UserEntity, Long>


@MappedSuperclass
abstract class Auditable {

    @CreatedDate
    @Column(name = "created_date")
    var createdDate: LocalDateTime? = null

    @LastModifiedDate
    @Column(name = "last_modified_date")
    var lastModifiedDate: LocalDateTime? = null

}


@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "users", schema = "user_service")
data class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false)
    var email: String = "",

    @Column(nullable = false)
    var password: String = "",

    @Column(name = "phone_number", nullable = false)
    var phoneNumber: String = "",
) : Auditable()