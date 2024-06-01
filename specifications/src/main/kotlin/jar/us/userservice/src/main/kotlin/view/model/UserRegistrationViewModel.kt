/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package view.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param name 
 * @param email 
 * @param password 
 * @param phoneNumber 
 */


data class UserRegistrationViewModel (

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "phone_number")
    val phoneNumber: kotlin.String? = null

)

