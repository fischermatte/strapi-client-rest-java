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
import dev.fischermatte.strapi.client.rest.model.UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UsersPermissionsRoleListResponseDataItemAttributesPermissions
 */
@JsonPropertyOrder({
  UsersPermissionsRoleListResponseDataItemAttributesPermissions.JSON_PROPERTY_DATA
})
@JsonTypeName("UsersPermissionsRoleListResponseDataItem_attributes_permissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UsersPermissionsRoleListResponseDataItemAttributesPermissions {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner> data = null;

  public UsersPermissionsRoleListResponseDataItemAttributesPermissions() {
  }

  public UsersPermissionsRoleListResponseDataItemAttributesPermissions data(List<UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner> data) {
    
    this.data = data;
    return this;
  }

  public UsersPermissionsRoleListResponseDataItemAttributesPermissions addDataItem(UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<UsersPermissionsRoleListResponseDataItemAttributesPermissionsDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersPermissionsRoleListResponseDataItemAttributesPermissions usersPermissionsRoleListResponseDataItemAttributesPermissions = (UsersPermissionsRoleListResponseDataItemAttributesPermissions) o;
    return Objects.equals(this.data, usersPermissionsRoleListResponseDataItemAttributesPermissions.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersPermissionsRoleListResponseDataItemAttributesPermissions {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

