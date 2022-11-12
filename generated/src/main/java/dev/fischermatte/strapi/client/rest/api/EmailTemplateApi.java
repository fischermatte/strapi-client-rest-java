package dev.fischermatte.strapi.client.rest.api;

import dev.fischermatte.strapi.client.rest.ApiClient;

import java.math.BigDecimal;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateListResponse;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateLocalizationRequest;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateLocalizationResponse;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateRequest;
import dev.fischermatte.strapi.client.rest.model.EmailTemplateResponse;
import dev.fischermatte.strapi.client.rest.model.Error;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-12T14:53:45.709103541+01:00[Europe/Zurich]")
public class EmailTemplateApi {
    private ApiClient apiClient;

    public EmailTemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmailTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return Long
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteEmailTemplatesIdRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteEmailTemplatesId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return apiClient.invokeAPI("/email-templates/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return Long
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Long> deleteEmailTemplatesId(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return deleteEmailTemplatesIdRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return ResponseEntity&lt;Long&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Long>> deleteEmailTemplatesIdWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<Long> localVarReturnType = new ParameterizedTypeReference<Long>() {};
        return deleteEmailTemplatesIdRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteEmailTemplatesIdWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return deleteEmailTemplatesIdRequestCreation(id);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param sort Sort by attributes ascending (asc) or descending (desc)
     * @param paginationWithCount Retun page/pageSize (default: true)
     * @param paginationPage Page number (default: 0)
     * @param paginationPageSize Page size (default: 25)
     * @param paginationStart Offset value (default: 0)
     * @param paginationLimit Number of entities to return (default: 25)
     * @param fields Fields to return (ex: title,author)
     * @param populate Relations to return
     * @param filters Filters to apply
     * @return EmailTemplateListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEmailTemplatesRequestCreation(String sort, Boolean paginationWithCount, Integer paginationPage, Integer paginationPageSize, Integer paginationStart, Integer paginationLimit, String fields, String populate, Object filters) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagination[withCount]", paginationWithCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagination[page]", paginationPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagination[pageSize]", paginationPageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagination[start]", paginationStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pagination[limit]", paginationLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "populate", populate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<EmailTemplateListResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateListResponse>() {};
        return apiClient.invokeAPI("/email-templates", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param sort Sort by attributes ascending (asc) or descending (desc)
     * @param paginationWithCount Retun page/pageSize (default: true)
     * @param paginationPage Page number (default: 0)
     * @param paginationPageSize Page size (default: 25)
     * @param paginationStart Offset value (default: 0)
     * @param paginationLimit Number of entities to return (default: 25)
     * @param fields Fields to return (ex: title,author)
     * @param populate Relations to return
     * @param filters Filters to apply
     * @return EmailTemplateListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmailTemplateListResponse> getEmailTemplates(String sort, Boolean paginationWithCount, Integer paginationPage, Integer paginationPageSize, Integer paginationStart, Integer paginationLimit, String fields, String populate, Object filters) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateListResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateListResponse>() {};
        return getEmailTemplatesRequestCreation(sort, paginationWithCount, paginationPage, paginationPageSize, paginationStart, paginationLimit, fields, populate, filters).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param sort Sort by attributes ascending (asc) or descending (desc)
     * @param paginationWithCount Retun page/pageSize (default: true)
     * @param paginationPage Page number (default: 0)
     * @param paginationPageSize Page size (default: 25)
     * @param paginationStart Offset value (default: 0)
     * @param paginationLimit Number of entities to return (default: 25)
     * @param fields Fields to return (ex: title,author)
     * @param populate Relations to return
     * @param filters Filters to apply
     * @return ResponseEntity&lt;EmailTemplateListResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<EmailTemplateListResponse>> getEmailTemplatesWithHttpInfo(String sort, Boolean paginationWithCount, Integer paginationPage, Integer paginationPageSize, Integer paginationStart, Integer paginationLimit, String fields, String populate, Object filters) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateListResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateListResponse>() {};
        return getEmailTemplatesRequestCreation(sort, paginationWithCount, paginationPage, paginationPageSize, paginationStart, paginationLimit, fields, populate, filters).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param sort Sort by attributes ascending (asc) or descending (desc)
     * @param paginationWithCount Retun page/pageSize (default: true)
     * @param paginationPage Page number (default: 0)
     * @param paginationPageSize Page size (default: 25)
     * @param paginationStart Offset value (default: 0)
     * @param paginationLimit Number of entities to return (default: 25)
     * @param fields Fields to return (ex: title,author)
     * @param populate Relations to return
     * @param filters Filters to apply
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEmailTemplatesWithResponseSpec(String sort, Boolean paginationWithCount, Integer paginationPage, Integer paginationPageSize, Integer paginationStart, Integer paginationLimit, String fields, String populate, Object filters) throws WebClientResponseException {
        return getEmailTemplatesRequestCreation(sort, paginationWithCount, paginationPage, paginationPageSize, paginationStart, paginationLimit, fields, populate, filters);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEmailTemplatesIdRequestCreation(BigDecimal id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getEmailTemplatesId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return apiClient.invokeAPI("/email-templates/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmailTemplateResponse> getEmailTemplatesId(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return getEmailTemplatesIdRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return ResponseEntity&lt;EmailTemplateResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<EmailTemplateResponse>> getEmailTemplatesIdWithHttpInfo(BigDecimal id) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return getEmailTemplatesIdRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEmailTemplatesIdWithResponseSpec(BigDecimal id) throws WebClientResponseException {
        return getEmailTemplatesIdRequestCreation(id);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postEmailTemplatesRequestCreation(EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        Object postBody = emailTemplateRequest;
        // verify the required parameter 'emailTemplateRequest' is set
        if (emailTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'emailTemplateRequest' when calling postEmailTemplates", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return apiClient.invokeAPI("/email-templates", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmailTemplateResponse> postEmailTemplates(EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return postEmailTemplatesRequestCreation(emailTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return ResponseEntity&lt;EmailTemplateResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<EmailTemplateResponse>> postEmailTemplatesWithHttpInfo(EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return postEmailTemplatesRequestCreation(emailTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postEmailTemplatesWithResponseSpec(EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        return postEmailTemplatesRequestCreation(emailTemplateRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateLocalizationRequest The emailTemplateLocalizationRequest parameter
     * @return EmailTemplateLocalizationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postEmailTemplatesIdLocalizationsRequestCreation(BigDecimal id, EmailTemplateLocalizationRequest emailTemplateLocalizationRequest) throws WebClientResponseException {
        Object postBody = emailTemplateLocalizationRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling postEmailTemplatesIdLocalizations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'emailTemplateLocalizationRequest' is set
        if (emailTemplateLocalizationRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'emailTemplateLocalizationRequest' when calling postEmailTemplatesIdLocalizations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<EmailTemplateLocalizationResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateLocalizationResponse>() {};
        return apiClient.invokeAPI("/email-templates/{id}/localizations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateLocalizationRequest The emailTemplateLocalizationRequest parameter
     * @return EmailTemplateLocalizationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmailTemplateLocalizationResponse> postEmailTemplatesIdLocalizations(BigDecimal id, EmailTemplateLocalizationRequest emailTemplateLocalizationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateLocalizationResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateLocalizationResponse>() {};
        return postEmailTemplatesIdLocalizationsRequestCreation(id, emailTemplateLocalizationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateLocalizationRequest The emailTemplateLocalizationRequest parameter
     * @return ResponseEntity&lt;EmailTemplateLocalizationResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<EmailTemplateLocalizationResponse>> postEmailTemplatesIdLocalizationsWithHttpInfo(BigDecimal id, EmailTemplateLocalizationRequest emailTemplateLocalizationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateLocalizationResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateLocalizationResponse>() {};
        return postEmailTemplatesIdLocalizationsRequestCreation(id, emailTemplateLocalizationRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateLocalizationRequest The emailTemplateLocalizationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postEmailTemplatesIdLocalizationsWithResponseSpec(BigDecimal id, EmailTemplateLocalizationRequest emailTemplateLocalizationRequest) throws WebClientResponseException {
        return postEmailTemplatesIdLocalizationsRequestCreation(id, emailTemplateLocalizationRequest);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putEmailTemplatesIdRequestCreation(BigDecimal id, EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        Object postBody = emailTemplateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putEmailTemplatesId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'emailTemplateRequest' is set
        if (emailTemplateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'emailTemplateRequest' when calling putEmailTemplatesId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return apiClient.invokeAPI("/email-templates/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return EmailTemplateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmailTemplateResponse> putEmailTemplatesId(BigDecimal id, EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return putEmailTemplatesIdRequestCreation(id, emailTemplateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return ResponseEntity&lt;EmailTemplateResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<EmailTemplateResponse>> putEmailTemplatesIdWithHttpInfo(BigDecimal id, EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<EmailTemplateResponse> localVarReturnType = new ParameterizedTypeReference<EmailTemplateResponse>() {};
        return putEmailTemplatesIdRequestCreation(id, emailTemplateRequest).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server Error
     * @param id 
     * @param emailTemplateRequest The emailTemplateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putEmailTemplatesIdWithResponseSpec(BigDecimal id, EmailTemplateRequest emailTemplateRequest) throws WebClientResponseException {
        return putEmailTemplatesIdRequestCreation(id, emailTemplateRequest);
    }
}
