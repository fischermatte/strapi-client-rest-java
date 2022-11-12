/*
 * DOCUMENTATION
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact-email@something.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.fischermatte.strapi.client.rest.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UsersPermissionsRolesGet200ResponseRolesInnerAllOf
 */
@JsonPropertyOrder({
  UsersPermissionsRolesGet200ResponseRolesInnerAllOf.JSON_PROPERTY_NB_USERS
})
@JsonTypeName("_users_permissions_roles_get_200_response_roles_inner_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UsersPermissionsRolesGet200ResponseRolesInnerAllOf {
  public static final String JSON_PROPERTY_NB_USERS = "nb_users";
  private BigDecimal nbUsers;

  public UsersPermissionsRolesGet200ResponseRolesInnerAllOf() {
  }

  public UsersPermissionsRolesGet200ResponseRolesInnerAllOf nbUsers(BigDecimal nbUsers) {
    
    this.nbUsers = nbUsers;
    return this;
  }

   /**
   * Get nbUsers
   * @return nbUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NB_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNbUsers() {
    return nbUsers;
  }


  @JsonProperty(JSON_PROPERTY_NB_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNbUsers(BigDecimal nbUsers) {
    this.nbUsers = nbUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPermissionsRolesGet200ResponseRolesInnerAllOf usersPermissionsRolesGet200ResponseRolesInnerAllOf = (UsersPermissionsRolesGet200ResponseRolesInnerAllOf) o;
    return Objects.equals(this.nbUsers, usersPermissionsRolesGet200ResponseRolesInnerAllOf.nbUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRolesGet200ResponseRolesInnerAllOf {\n");
    sb.append("    nbUsers: ").append(toIndentedString(nbUsers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

