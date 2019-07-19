# PedidoServiceApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**alterarStatusPedido**](PedidoServiceApi.md#alterarStatusPedido) | **POST** /pedidos/importados/by-emitente/{cnpjEmitente}/{codigo}/set-status | 
[**importarPedido**](PedidoServiceApi.md#importarPedido) | **POST** /pedidos/importar | 


<a name="alterarStatusPedido"></a>
# **alterarStatusPedido**
> PedidoAlterarStatusPedidoResponse alterarStatusPedido(cnpjEmitente, codigo, body)



### Example
```java
// Import classes:
//import com.agendarentrega.core.invoker.ApiClient;
//import com.agendarentrega.core.invoker.ApiException;
//import com.agendarentrega.core.invoker.Configuration;
//import com.agendarentrega.core.invoker.auth.*;
//import com.agendarentrega.clients.pedido.service.PedidoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

PedidoServiceApi apiInstance = new PedidoServiceApi();
String cnpjEmitente = "cnpjEmitente_example"; // String | 
String codigo = "codigo_example"; // String | 
PedidoAlterarStatusPedidoRequest body = new PedidoAlterarStatusPedidoRequest(); // PedidoAlterarStatusPedidoRequest | 
try {
    PedidoAlterarStatusPedidoResponse result = apiInstance.alterarStatusPedido(cnpjEmitente, codigo, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PedidoServiceApi#alterarStatusPedido");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cnpjEmitente** | **String**|  |
 **codigo** | **String**|  |
 **body** | [**PedidoAlterarStatusPedidoRequest**](PedidoAlterarStatusPedidoRequest.md)|  |

### Return type

[**PedidoAlterarStatusPedidoResponse**](PedidoAlterarStatusPedidoResponse.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importarPedido"></a>
# **importarPedido**
> PedidoImportarPedidoResponse importarPedido(body)



### Example
```java
// Import classes:
//import com.agendarentrega.core.invoker.ApiClient;
//import com.agendarentrega.core.invoker.ApiException;
//import com.agendarentrega.core.invoker.Configuration;
//import com.agendarentrega.core.invoker.auth.*;
//import com.agendarentrega.clients.pedido.service.PedidoServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

PedidoServiceApi apiInstance = new PedidoServiceApi();
PedidoImportarPedidoRequest body = new PedidoImportarPedidoRequest(); // PedidoImportarPedidoRequest | 
try {
    PedidoImportarPedidoResponse result = apiInstance.importarPedido(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PedidoServiceApi#importarPedido");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PedidoImportarPedidoRequest**](PedidoImportarPedidoRequest.md)|  |

### Return type

[**PedidoImportarPedidoResponse**](PedidoImportarPedidoResponse.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

