

# EmailTemplateListResponseDataItemAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**emailType** | [**EmailTypeEnum**](#EmailTypeEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**publishedAt** | **OffsetDateTime** |  |  [optional] |
|**createdBy** | [**EmailTemplateLocalizationResponseCreatedBy**](EmailTemplateLocalizationResponseCreatedBy.md) |  |  [optional] |
|**updatedBy** | [**EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole**](EmailTemplateLocalizationResponseCreatedByDataAttributesRolesDataInnerAttributesPermissionsDataInnerAttributesRole.md) |  |  [optional] |
|**localizations** | [**EmailTemplateListResponseDataItemAttributesLocalizations**](EmailTemplateListResponseDataItemAttributesLocalizations.md) |  |  [optional] |
|**locale** | **String** |  |  [optional] |



## Enum: EmailTypeEnum

| Name | Value |
|---- | -----|
| PARA_BUCHUNG | &quot;SCREENING_PARA_BUCHUNG&quot; |
| PILOT_BUCHUNG | &quot;SCREENING_PILOT_BUCHUNG&quot; |



