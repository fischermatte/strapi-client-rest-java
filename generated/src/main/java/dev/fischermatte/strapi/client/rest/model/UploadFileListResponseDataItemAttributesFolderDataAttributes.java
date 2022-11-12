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
import dev.fischermatte.strapi.client.rest.model.EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesUsers;
import dev.fischermatte.strapi.client.rest.model.UploadFileListResponseDataItemAttributesFolderDataAttributesFiles;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UploadFileListResponseDataItemAttributesFolderDataAttributes
 */
@JsonPropertyOrder({
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_NAME,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_PATH_ID,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_PARENT,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_CHILDREN,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_FILES,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_PATH,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_CREATED_AT,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_UPDATED_AT,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_CREATED_BY,
  UploadFileListResponseDataItemAttributesFolderDataAttributes.JSON_PROPERTY_UPDATED_BY
})
@JsonTypeName("UploadFileListResponseDataItem_attributes_folder_data_attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UploadFileListResponseDataItemAttributesFolderDataAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATH_ID = "pathId";
  private Integer pathId;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole parent;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesUsers children;

  public static final String JSON_PROPERTY_FILES = "files";
  private UploadFileListResponseDataItemAttributesFolderDataAttributesFiles files;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole createdBy;

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  private EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole updatedBy;

  public UploadFileListResponseDataItemAttributesFolderDataAttributes() {
  }

  public UploadFileListResponseDataItemAttributesFolderDataAttributes name(String name) {
    
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


  public UploadFileListResponseDataItemAttributesFolderDataAttributes pathId(Integer pathId) {
    
    this.pathId = pathId;
    return this;
  }

   /**
   * Get pathId
   * @return pathId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPathId() {
    return pathId;
  }


  @JsonProperty(JSON_PROPERTY_PATH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathId(Integer pathId) {
    this.pathId = pathId;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes parent(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole parent) {
    this.parent = parent;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes children(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesUsers children) {
    
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesUsers getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesUsers children) {
    this.children = children;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes files(UploadFileListResponseDataItemAttributesFolderDataAttributesFiles files) {
    
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UploadFileListResponseDataItemAttributesFolderDataAttributesFiles getFiles() {
    return files;
  }


  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(UploadFileListResponseDataItemAttributesFolderDataAttributesFiles files) {
    this.files = files;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes createdAt(OffsetDateTime createdAt) {
    
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

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes updatedAt(OffsetDateTime updatedAt) {
    
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

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes createdBy(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole createdBy) {
    this.createdBy = createdBy;
  }


  public UploadFileListResponseDataItemAttributesFolderDataAttributes updatedBy(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole getUpdatedBy() {
    return updatedBy;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedBy(EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole updatedBy) {
    this.updatedBy = updatedBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileListResponseDataItemAttributesFolderDataAttributes uploadFileListResponseDataItemAttributesFolderDataAttributes = (UploadFileListResponseDataItemAttributesFolderDataAttributes) o;
    return Objects.equals(this.name, uploadFileListResponseDataItemAttributesFolderDataAttributes.name) &&
        Objects.equals(this.pathId, uploadFileListResponseDataItemAttributesFolderDataAttributes.pathId) &&
        Objects.equals(this.parent, uploadFileListResponseDataItemAttributesFolderDataAttributes.parent) &&
        Objects.equals(this.children, uploadFileListResponseDataItemAttributesFolderDataAttributes.children) &&
        Objects.equals(this.files, uploadFileListResponseDataItemAttributesFolderDataAttributes.files) &&
        Objects.equals(this.path, uploadFileListResponseDataItemAttributesFolderDataAttributes.path) &&
        Objects.equals(this.createdAt, uploadFileListResponseDataItemAttributesFolderDataAttributes.createdAt) &&
        Objects.equals(this.updatedAt, uploadFileListResponseDataItemAttributesFolderDataAttributes.updatedAt) &&
        Objects.equals(this.createdBy, uploadFileListResponseDataItemAttributesFolderDataAttributes.createdBy) &&
        Objects.equals(this.updatedBy, uploadFileListResponseDataItemAttributesFolderDataAttributes.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pathId, parent, children, files, path, createdAt, updatedAt, createdBy, updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileListResponseDataItemAttributesFolderDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pathId: ").append(toIndentedString(pathId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
