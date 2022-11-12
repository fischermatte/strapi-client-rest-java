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
import dev.fischermatte.strapi.client.rest.model.UploadFileRequestDataRelatedInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UploadFileRequestData
 */
@JsonPropertyOrder({
  UploadFileRequestData.JSON_PROPERTY_NAME,
  UploadFileRequestData.JSON_PROPERTY_ALTERNATIVE_TEXT,
  UploadFileRequestData.JSON_PROPERTY_CAPTION,
  UploadFileRequestData.JSON_PROPERTY_WIDTH,
  UploadFileRequestData.JSON_PROPERTY_HEIGHT,
  UploadFileRequestData.JSON_PROPERTY_FORMATS,
  UploadFileRequestData.JSON_PROPERTY_HASH,
  UploadFileRequestData.JSON_PROPERTY_EXT,
  UploadFileRequestData.JSON_PROPERTY_MIME,
  UploadFileRequestData.JSON_PROPERTY_SIZE,
  UploadFileRequestData.JSON_PROPERTY_URL,
  UploadFileRequestData.JSON_PROPERTY_PREVIEW_URL,
  UploadFileRequestData.JSON_PROPERTY_PROVIDER,
  UploadFileRequestData.JSON_PROPERTY_PROVIDER_METADATA,
  UploadFileRequestData.JSON_PROPERTY_RELATED,
  UploadFileRequestData.JSON_PROPERTY_FOLDER,
  UploadFileRequestData.JSON_PROPERTY_FOLDER_PATH
})
@JsonTypeName("UploadFileRequest_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class UploadFileRequestData {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ALTERNATIVE_TEXT = "alternativeText";
  private String alternativeText;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private JsonNullable<Object> formats = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_HASH = "hash";
  private String hash;

  public static final String JSON_PROPERTY_EXT = "ext";
  private String ext;

  public static final String JSON_PROPERTY_MIME = "mime";
  private String mime;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Float size;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_PREVIEW_URL = "previewUrl";
  private String previewUrl;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_PROVIDER_METADATA = "provider_metadata";
  private JsonNullable<Object> providerMetadata = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RELATED = "related";
  private List<UploadFileRequestDataRelatedInner> related = null;

  public static final String JSON_PROPERTY_FOLDER = "folder";
  private UploadFileRequestDataRelatedInner folder;

  public static final String JSON_PROPERTY_FOLDER_PATH = "folderPath";
  private String folderPath;

  public UploadFileRequestData() {
  }

  public UploadFileRequestData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public UploadFileRequestData alternativeText(String alternativeText) {
    
    this.alternativeText = alternativeText;
    return this;
  }

   /**
   * Get alternativeText
   * @return alternativeText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlternativeText() {
    return alternativeText;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }


  public UploadFileRequestData caption(String caption) {
    
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaption() {
    return caption;
  }


  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaption(String caption) {
    this.caption = caption;
  }


  public UploadFileRequestData width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public UploadFileRequestData height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public UploadFileRequestData formats(Object formats) {
    this.formats = JsonNullable.<Object>of(formats);
    
    return this;
  }

   /**
   * Get formats
   * @return formats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getFormats() {
        return formats.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFormats_JsonNullable() {
    return formats;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMATS)
  public void setFormats_JsonNullable(JsonNullable<Object> formats) {
    this.formats = formats;
  }

  public void setFormats(Object formats) {
    this.formats = JsonNullable.<Object>of(formats);
  }


  public UploadFileRequestData hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHash() {
    return hash;
  }


  @JsonProperty(JSON_PROPERTY_HASH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHash(String hash) {
    this.hash = hash;
  }


  public UploadFileRequestData ext(String ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Get ext
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExt() {
    return ext;
  }


  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExt(String ext) {
    this.ext = ext;
  }


  public UploadFileRequestData mime(String mime) {
    
    this.mime = mime;
    return this;
  }

   /**
   * Get mime
   * @return mime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMime() {
    return mime;
  }


  @JsonProperty(JSON_PROPERTY_MIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMime(String mime) {
    this.mime = mime;
  }


  public UploadFileRequestData size(Float size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(Float size) {
    this.size = size;
  }


  public UploadFileRequestData url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public UploadFileRequestData previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Get previewUrl
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviewUrl() {
    return previewUrl;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public UploadFileRequestData provider(String provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  public UploadFileRequestData providerMetadata(Object providerMetadata) {
    this.providerMetadata = JsonNullable.<Object>of(providerMetadata);
    
    return this;
  }

   /**
   * Get providerMetadata
   * @return providerMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Object getProviderMetadata() {
        return providerMetadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getProviderMetadata_JsonNullable() {
    return providerMetadata;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_METADATA)
  public void setProviderMetadata_JsonNullable(JsonNullable<Object> providerMetadata) {
    this.providerMetadata = providerMetadata;
  }

  public void setProviderMetadata(Object providerMetadata) {
    this.providerMetadata = JsonNullable.<Object>of(providerMetadata);
  }


  public UploadFileRequestData related(List<UploadFileRequestDataRelatedInner> related) {
    
    this.related = related;
    return this;
  }

  public UploadFileRequestData addRelatedItem(UploadFileRequestDataRelatedInner relatedItem) {
    if (this.related == null) {
      this.related = new ArrayList<>();
    }
    this.related.add(relatedItem);
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UploadFileRequestDataRelatedInner> getRelated() {
    return related;
  }


  @JsonProperty(JSON_PROPERTY_RELATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelated(List<UploadFileRequestDataRelatedInner> related) {
    this.related = related;
  }


  public UploadFileRequestData folder(UploadFileRequestDataRelatedInner folder) {
    
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UploadFileRequestDataRelatedInner getFolder() {
    return folder;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolder(UploadFileRequestDataRelatedInner folder) {
    this.folder = folder;
  }


  public UploadFileRequestData folderPath(String folderPath) {
    
    this.folderPath = folderPath;
    return this;
  }

   /**
   * Get folderPath
   * @return folderPath
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFolderPath() {
    return folderPath;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFolderPath(String folderPath) {
    this.folderPath = folderPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadFileRequestData uploadFileRequestData = (UploadFileRequestData) o;
    return Objects.equals(this.name, uploadFileRequestData.name) &&
        Objects.equals(this.alternativeText, uploadFileRequestData.alternativeText) &&
        Objects.equals(this.caption, uploadFileRequestData.caption) &&
        Objects.equals(this.width, uploadFileRequestData.width) &&
        Objects.equals(this.height, uploadFileRequestData.height) &&
        equalsNullable(this.formats, uploadFileRequestData.formats) &&
        Objects.equals(this.hash, uploadFileRequestData.hash) &&
        Objects.equals(this.ext, uploadFileRequestData.ext) &&
        Objects.equals(this.mime, uploadFileRequestData.mime) &&
        Objects.equals(this.size, uploadFileRequestData.size) &&
        Objects.equals(this.url, uploadFileRequestData.url) &&
        Objects.equals(this.previewUrl, uploadFileRequestData.previewUrl) &&
        Objects.equals(this.provider, uploadFileRequestData.provider) &&
        equalsNullable(this.providerMetadata, uploadFileRequestData.providerMetadata) &&
        Objects.equals(this.related, uploadFileRequestData.related) &&
        Objects.equals(this.folder, uploadFileRequestData.folder) &&
        Objects.equals(this.folderPath, uploadFileRequestData.folderPath);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, alternativeText, caption, width, height, hashCodeNullable(formats), hash, ext, mime, size, url, previewUrl, provider, hashCodeNullable(providerMetadata), related, folder, folderPath);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadFileRequestData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    providerMetadata: ").append(toIndentedString(providerMetadata)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    folderPath: ").append(toIndentedString(folderPath)).append("\n");
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
