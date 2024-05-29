package jar.us.userservice.entity

import jakarta.persistence.*

@Entity
@Table(name = "users", schema = "user_service")
data class User(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false, unique = true)
    var email: String = "",

    @Column(nullable = false)
    var password: String = "",

    @Column(name = "phone_number", nullable = false)
    var phoneNumber: String = "",

    @Column(name = "created_at", nullable = false)
    var createdAt: java.sql.Timestamp = java.sql.Timestamp(System.currentTimeMillis()),

    @Column(name = "updated_at", nullable = false)
    var updatedAt: java.sql.Timestamp = java.sql.Timestamp(System.currentTimeMillis()),
)