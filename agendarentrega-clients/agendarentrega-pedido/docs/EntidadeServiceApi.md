# EntidadeServiceApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statusEntidade**](EntidadeServiceApi.md#statusEntidade) | **GET** /entidades/{entidadeUUID}/status | 


<a name="statusEntidade"></a>
# **statusEntidade**
> PedidoStatusEntidadeResponse statusEntidade(entidadeUUID)



### Example
```java
// Import classes:
//import com.agendarentrega.clients.pedido.invoker.ApiClient;
//import com.agendarentrega.clients.pedido.invoker.ApiException;
//import com.agendarentrega.clients.pedido.invoker.Configuration;
//import com.agendarentrega.clients.pedido.invoker.auth.*;
//import com.agendarentrega.clients.pedido.service.EntidadeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

EntidadeServiceApi apiInstance = new EntidadeServiceApi();
String entidadeUUID = "entidadeUUID_example"; // String | 
try {
    PedidoStatusEntidadeResponse result = apiInstance.statusEntidade(entidadeUUID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntidadeServiceApi#statusEntidade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entidadeUUID** | **String**|  |

### Return type

[**PedidoStatusEntidadeResponse**](PedidoStatusEntidadeResponse.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

