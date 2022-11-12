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
import dev.fischermatte.strapi.client.rest.model.Datetime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UsersPermissionsRolesGet200ResponseRolesInner
 */
@JsonPropertyOrder({
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_ID,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_NAME,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_DESCRIPTION,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_TYPE,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_CREATED_AT,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_UPDATED_AT,
  UsersPermissionsRolesGet200ResponseRolesInner.JSON_PROPERTY_NB_USERS
})
@JsonTypeName("_users_permissions_roles_get_200_response_roles_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UsersPermissionsRolesGet200ResponseRolesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Datetime createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Datetime updatedAt = null;

  public static final String JSON_PROPERTY_NB_USERS = "nb_users";
  private BigDecimal nbUsers;

  public UsersPermissionsRolesGet200ResponseRolesInner() {
  }

  public UsersPermissionsRolesGet200ResponseRolesInner id(BigDecimal id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner createdAt(Datetime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Datetime createdAt) {
    this.createdAt = createdAt;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner updatedAt(Datetime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Datetime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(Datetime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UsersPermissionsRolesGet200ResponseRolesInner nbUsers(BigDecimal nbUsers) {
    
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
    UsersPermissionsRolesGet200ResponseRolesInner usersPermissionsRolesGet200ResponseRolesInner = (UsersPermissionsRolesGet200ResponseRolesInner) o;
    return Objects.equals(this.id, usersPermissionsRolesGet200ResponseRolesInner.id) &&
        Objects.equals(this.name, usersPermissionsRolesGet200ResponseRolesInner.name) &&
        Objects.equals(this.description, usersPermissionsRolesGet200ResponseRolesInner.description) &&
        Objects.equals(this.type, usersPermissionsRolesGet200ResponseRolesInner.type) &&
        Objects.equals(this.createdAt, usersPermissionsRolesGet200ResponseRolesInner.createdAt) &&
        Objects.equals(this.updatedAt, usersPermissionsRolesGet200ResponseRolesInner.updatedAt) &&
        Objects.equals(this.nbUsers, usersPermissionsRolesGet200ResponseRolesInner.nbUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, type, createdAt, updatedAt, nbUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRolesGet200ResponseRolesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
