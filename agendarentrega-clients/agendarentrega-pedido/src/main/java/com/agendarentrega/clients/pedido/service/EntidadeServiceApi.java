/*
 * gitlab.com/agendarentrega/servicos/pedido/proto/config.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.agendarentrega.clients.pedido.service;

import com.agendarentrega.core.invoker.ApiCallback;
import com.agendarentrega.core.invoker.ApiClient;
import com.agendarentrega.core.invoker.ApiException;
import com.agendarentrega.core.invoker.ApiResponse;
import com.agendarentrega.core.invoker.Configuration;
import com.agendarentrega.core.invoker.Pair;
import com.agendarentrega.core.invoker.ProgressRequestBody;
import com.agendarentrega.core.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.agendarentrega.clients.pedido.models.PedidoStatusEntidadeResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntidadeServiceApi {
    private ApiClient apiClient;

    public EntidadeServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EntidadeServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for statusEntidade
     * @param entidadeUUID  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call statusEntidadeCall(String entidadeUUID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/entidades/{entidadeUUID}/status"
            .replaceAll("\\{" + "entidadeUUID" + "\\}", apiClient.escapeString(entidadeUUID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call statusEntidadeValidateBeforeCall(String entidadeUUID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'entidadeUUID' is set
        if (entidadeUUID == null) {
            throw new ApiException("Missing the required parameter 'entidadeUUID' when calling statusEntidade(Async)");
        }
        

        com.squareup.okhttp.Call call = statusEntidadeCall(entidadeUUID, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * 
     * @param entidadeUUID  (required)
     * @return PedidoStatusEntidadeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PedidoStatusEntidadeResponse statusEntidade(String entidadeUUID) throws ApiException {
        ApiResponse<PedidoStatusEntidadeResponse> resp = statusEntidadeWithHttpInfo(entidadeUUID);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param entidadeUUID  (required)
     * @return ApiResponse&lt;PedidoStatusEntidadeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PedidoStatusEntidadeResponse> statusEntidadeWithHttpInfo(String entidadeUUID) throws ApiException {
        com.squareup.okhttp.Call call = statusEntidadeValidateBeforeCall(entidadeUUID, null, null);
        Type localVarReturnType = new TypeToken<PedidoStatusEntidadeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param entidadeUUID  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call statusEntidadeAsync(String entidadeUUID, final ApiCallback<PedidoStatusEntidadeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = statusEntidadeValidateBeforeCall(entidadeUUID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PedidoStatusEntidadeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
