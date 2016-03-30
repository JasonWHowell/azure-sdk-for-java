/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.resources.models.PolicyDefinition;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyDefinitionsOperations.
 */
public final class PolicyDefinitionsOperationsImpl implements PolicyDefinitionsOperations {
    /** The Retrofit service to perform REST calls. */
    private PolicyDefinitionsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClient client;

    /**
     * Initializes an instance of PolicyDefinitionsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolicyDefinitionsOperationsImpl(Retrofit retrofit, ResourceManagementClient client) {
        this.service = retrofit.create(PolicyDefinitionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyDefinitionsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolicyDefinitionsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policydefinitions/{policyDefinitionName}")
        Call<ResponseBody> createOrUpdate(@Path("policyDefinitionName") String policyDefinitionName, @Path("subscriptionId") String subscriptionId, @Body PolicyDefinition parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policydefinitions/{policyDefinitionName}")
        Call<ResponseBody> get(@Path("policyDefinitionName") String policyDefinitionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policydefinitions/{policyDefinitionName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("policyDefinitionName") String policyDefinitionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Create or update policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param parameters The policy definition properties
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyDefinition object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PolicyDefinition> createOrUpdate(String policyDefinitionName, PolicyDefinition parameters) throws CloudException, IOException, IllegalArgumentException {
        if (policyDefinitionName == null) {
            throw new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Call<ResponseBody> call = service.createOrUpdate(policyDefinitionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return createOrUpdateDelegate(call.execute());
    }

    /**
     * Create or update policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param parameters The policy definition properties
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall createOrUpdateAsync(String policyDefinitionName, PolicyDefinition parameters, final ServiceCallback<PolicyDefinition> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (policyDefinitionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (parameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(parameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(policyDefinitionName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PolicyDefinition>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(createOrUpdateDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PolicyDefinition> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PolicyDefinition, CloudException>(this.client.getMapperAdapter())
                .register(201, new TypeToken<PolicyDefinition>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyDefinition object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PolicyDefinition> get(String policyDefinitionName) throws CloudException, IOException, IllegalArgumentException {
        if (policyDefinitionName == null) {
            throw new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(policyDefinitionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * Gets policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String policyDefinitionName, final ServiceCallback<PolicyDefinition> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (policyDefinitionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.get(policyDefinitionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<PolicyDefinition>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PolicyDefinition> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PolicyDefinition, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PolicyDefinition>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete(String policyDefinitionName) throws CloudException, IOException, IllegalArgumentException {
        if (policyDefinitionName == null) {
            throw new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.delete(policyDefinitionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return deleteDelegate(call.execute());
    }

    /**
     * Deletes policy definition.
     *
     * @param policyDefinitionName The policy definition name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall deleteAsync(String policyDefinitionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (policyDefinitionName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter policyDefinitionName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.delete(policyDefinitionName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(deleteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .build(response);
    }

}
