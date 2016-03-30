/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in UsageOperations.
 */
public final class UsageOperationsImpl implements UsageOperations {
    /** The Retrofit service to perform REST calls. */
    private UsageService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClient client;

    /**
     * Initializes an instance of UsageOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public UsageOperationsImpl(Retrofit retrofit, WebSiteManagementClient client) {
        this.service = retrofit.create(UsageService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for UsageOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsageService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web.Admin/environments/{environmentName}/usage")
        Call<ResponseBody> getUsage(@Path("resourceGroupName") String resourceGroupName, @Path("environmentName") String environmentName, @Path("subscriptionId") String subscriptionId, @Query("lastId") String lastId, @Query("batchSize") int batchSize, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group
     * @param environmentName Environment name
     * @param lastId Last marker that was returned from the batch
     * @param batchSize size of the batch to be returned.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> getUsage(String resourceGroupName, String environmentName, String lastId, int batchSize) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (environmentName == null) {
            throw new IllegalArgumentException("Parameter environmentName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (lastId == null) {
            throw new IllegalArgumentException("Parameter lastId is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getUsage(resourceGroupName, environmentName, this.client.getSubscriptionId(), lastId, batchSize, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getUsageDelegate(call.execute());
    }

    /**
     * Returns usage records for specified subscription and resource groups.
     *
     * @param resourceGroupName Name of resource group
     * @param environmentName Environment name
     * @param lastId Last marker that was returned from the batch
     * @param batchSize size of the batch to be returned.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getUsageAsync(String resourceGroupName, String environmentName, String lastId, int batchSize, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (environmentName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter environmentName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (lastId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter lastId is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getUsage(resourceGroupName, environmentName, this.client.getSubscriptionId(), lastId, batchSize, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Object>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUsageDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Object> getUsageDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
