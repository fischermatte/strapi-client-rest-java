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
import dev.fischermatte.strapi.client.rest.model.UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleDataAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData
 */
@JsonPropertyOrder({
  UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData.JSON_PROPERTY_ID,
  UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData.JSON_PROPERTY_ATTRIBUTES
})
@JsonTypeName("UsersPermissionsRoleListResponseDataItem_attributes_permissions_data_inner_attributes_role_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData {
  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleDataAttributes attributes;

  public UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData() {
  }

  public UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData id(BigDecimal id) {
    
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


  public UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData attributes(UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleDataAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleDataAttributes getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleDataAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData usersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData = (UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData) o;
    return Objects.equals(this.id, usersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData.id) &&
        Objects.equals(this.attributes, usersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInnerAttributesRoleData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

