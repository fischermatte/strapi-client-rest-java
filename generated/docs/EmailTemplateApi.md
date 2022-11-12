# EmailTemplateApi

All URIs are relative to *http://localhost:1338/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteEmailTemplatesId**](EmailTemplateApi.md#deleteEmailTemplatesId) | **DELETE** /email-templates/{id} |  |
| [**getEmailTemplates**](EmailTemplateApi.md#getEmailTemplates) | **GET** /email-templates |  |
| [**getEmailTemplatesId**](EmailTemplateApi.md#getEmailTemplatesId) | **GET** /email-templates/{id} |  |
| [**postEmailTemplates**](EmailTemplateApi.md#postEmailTemplates) | **POST** /email-templates |  |
| [**postEmailTemplatesIdLocalizations**](EmailTemplateApi.md#postEmailTemplatesIdLocalizations) | **POST** /email-templates/{id}/localizations |  |
| [**putEmailTemplatesId**](EmailTemplateApi.md#putEmailTemplatesId) | **PUT** /email-templates/{id} |  |



## deleteEmailTemplatesId

> Long deleteEmailTemplatesId(id)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            Long result = apiInstance.deleteEmailTemplatesId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#deleteEmailTemplatesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**|  | |

### Return type

**Long**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getEmailTemplates

> EmailTemplateListResponse getEmailTemplates(sort, paginationWithCount, paginationPage, paginationPageSize, paginationStart, paginationLimit, fields, populate, filters)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        String sort = "sort_example"; // String | Sort by attributes ascending (asc) or descending (desc)
        Boolean paginationWithCount = true; // Boolean | Retun page/pageSize (default: true)
        Integer paginationPage = 56; // Integer | Page number (default: 0)
        Integer paginationPageSize = 56; // Integer | Page size (default: 25)
        Integer paginationStart = 56; // Integer | Offset value (default: 0)
        Integer paginationLimit = 56; // Integer | Number of entities to return (default: 25)
        String fields = "fields_example"; // String | Fields to return (ex: title,author)
        String populate = "populate_example"; // String | Relations to return
        Object filters = null; // Object | Filters to apply
        try {
            EmailTemplateListResponse result = apiInstance.getEmailTemplates(sort, paginationWithCount, paginationPage, paginationPageSize, paginationStart, paginationLimit, fields, populate, filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#getEmailTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sort** | **String**| Sort by attributes ascending (asc) or descending (desc) | [optional] |
| **paginationWithCount** | **Boolean**| Retun page/pageSize (default: true) | [optional] |
| **paginationPage** | **Integer**| Page number (default: 0) | [optional] |
| **paginationPageSize** | **Integer**| Page size (default: 25) | [optional] |
| **paginationStart** | **Integer**| Offset value (default: 0) | [optional] |
| **paginationLimit** | **Integer**| Number of entities to return (default: 25) | [optional] |
| **fields** | **String**| Fields to return (ex: title,author) | [optional] |
| **populate** | **String**| Relations to return | [optional] |
| **filters** | [**Object**](.md)| Filters to apply | [optional] |

### Return type

[**EmailTemplateListResponse**](EmailTemplateListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getEmailTemplatesId

> EmailTemplateResponse getEmailTemplatesId(id)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            EmailTemplateResponse result = apiInstance.getEmailTemplatesId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#getEmailTemplatesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**|  | |

### Return type

[**EmailTemplateResponse**](EmailTemplateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## postEmailTemplates

> EmailTemplateResponse postEmailTemplates(emailTemplateRequest)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        EmailTemplateRequest emailTemplateRequest = new EmailTemplateRequest(); // EmailTemplateRequest | 
        try {
            EmailTemplateResponse result = apiInstance.postEmailTemplates(emailTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#postEmailTemplates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailTemplateRequest** | [**EmailTemplateRequest**](EmailTemplateRequest.md)|  | |

### Return type

[**EmailTemplateResponse**](EmailTemplateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## postEmailTemplatesIdLocalizations

> EmailTemplateLocalizationResponse postEmailTemplatesIdLocalizations(id, emailTemplateLocalizationRequest)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        EmailTemplateLocalizationRequest emailTemplateLocalizationRequest = new EmailTemplateLocalizationRequest(); // EmailTemplateLocalizationRequest | 
        try {
            EmailTemplateLocalizationResponse result = apiInstance.postEmailTemplatesIdLocalizations(id, emailTemplateLocalizationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#postEmailTemplatesIdLocalizations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**|  | |
| **emailTemplateLocalizationRequest** | [**EmailTemplateLocalizationRequest**](EmailTemplateLocalizationRequest.md)|  | |

### Return type

[**EmailTemplateLocalizationResponse**](EmailTemplateLocalizationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## putEmailTemplatesId

> EmailTemplateResponse putEmailTemplatesId(id, emailTemplateRequest)



### Example

```java
// Import classes:
import dev.fischermatte.strapi.client.rest.ApiClient;
import dev.fischermatte.strapi.client.rest.ApiException;
import dev.fischermatte.strapi.client.rest.Configuration;
import dev.fischermatte.strapi.client.rest.auth.*;
import dev.fischermatte.strapi.client.rest.models.*;
import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:1338/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        EmailTemplateApi apiInstance = new EmailTemplateApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        EmailTemplateRequest emailTemplateRequest = new EmailTemplateRequest(); // EmailTemplateRequest | 
        try {
            EmailTemplateResponse result = apiInstance.putEmailTemplatesId(id, emailTemplateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmailTemplateApi#putEmailTemplatesId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **BigDecimal**|  | |
| **emailTemplateRequest** | [**EmailTemplateRequest**](EmailTemplateRequest.md)|  | |

### Return type

[**EmailTemplateResponse**](EmailTemplateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

