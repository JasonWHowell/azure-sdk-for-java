/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.Route;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in RoutesOperations.
 */
public final class RoutesOperationsImpl implements RoutesOperations {
    /** The Retrofit service to perform REST calls. */
    private RoutesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClient client;

    /**
     * Initializes an instance of RoutesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RoutesOperationsImpl(Retrofit retrofit, NetworkManagementClient client) {
        this.service = retrofit.create(RoutesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RoutesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RoutesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> beginDelete(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Body Route routeParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes/{routeName}")
        Call<ResponseBody> beginCreateOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("routeName") String routeName, @Path("subscriptionId") String subscriptionId, @Body Route routeParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/routeTables/{routeTableName}/routes")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("routeTableName") String routeTableName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Response<ResponseBody> result = service.delete(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall deleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
        }
        if (routeName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Call<ResponseBody> call = service.delete(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> beginDelete(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginDeleteDelegate(call.execute());
    }

    /**
     * The delete route operation deletes the specified route from a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginDeleteAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
            return null;
        }
        if (routeName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeName is required and cannot be null."));
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
        Call<ResponseBody> call = service.beginDelete(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginDeleteDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> beginDeleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, CloudException>(this.client.getMapperAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Route object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Route> get(String resourceGroupName, String routeTableName, String routeName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.get(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getDelegate(call.execute());
    }

    /**
     * The Get route operation retreives information about the specified route from the route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getAsync(String resourceGroupName, String routeTableName, String routeName, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
            return null;
        }
        if (routeName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeName is required and cannot be null."));
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
        Call<ResponseBody> call = service.get(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Route>(serviceCallback) {
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

    private ServiceResponse<Route> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Route, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Route>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Route object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Route> createOrUpdate(String resourceGroupName, String routeTableName, String routeName, Route routeParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (routeParameters == null) {
            throw new IllegalArgumentException("Parameter routeParameters is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(routeParameters);
        Response<ResponseBody> result = service.createOrUpdate(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), routeParameters, this.client.getApiVersion(), this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Route>() { }.getType());
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    public ServiceCall createOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, Route routeParameters, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
        }
        if (routeName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (routeParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeParameters is required and cannot be null."));
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
        }
        Validator.validate(routeParameters, serviceCallback);
        Call<ResponseBody> call = service.createOrUpdate(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), routeParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<Route>() { }.getType(), serviceCall, serviceCallback);
            }
        });
        return serviceCall;
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Route object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Route> beginCreateOrUpdate(String resourceGroupName, String routeTableName, String routeName, Route routeParameters) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (routeName == null) {
            throw new IllegalArgumentException("Parameter routeName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (routeParameters == null) {
            throw new IllegalArgumentException("Parameter routeParameters is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(routeParameters);
        Call<ResponseBody> call = service.beginCreateOrUpdate(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), routeParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return beginCreateOrUpdateDelegate(call.execute());
    }

    /**
     * The Put route operation creates/updates a route in the specified route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param routeName The name of the route.
     * @param routeParameters Parameters supplied to the create/update routeoperation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String routeTableName, String routeName, Route routeParameters, final ServiceCallback<Route> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
            return null;
        }
        if (routeName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeName is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (routeParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeParameters is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(routeParameters, serviceCallback);
        Call<ResponseBody> call = service.beginCreateOrUpdate(resourceGroupName, routeTableName, routeName, this.client.getSubscriptionId(), routeParameters, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Route>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(beginCreateOrUpdateDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Route> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Route, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<Route>() { }.getType())
                .register(201, new TypeToken<Route>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Route&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<Route>> list(final String resourceGroupName, final String routeTableName) throws CloudException, IOException, IllegalArgumentException {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (routeTableName == null) {
            throw new IllegalArgumentException("Parameter routeTableName is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(resourceGroupName, routeTableName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        ServiceResponse<PageImpl<Route>> response = listDelegate(call.execute());
        PagedList<Route> result = new PagedList<Route>(response.getBody()) {
            @Override
            public Page<Route> nextPage(String nextPageLink) throws CloudException, IOException {
                return listNext(nextPageLink).getBody();
            }
        };
        return new ServiceResponse<>(result, response.getResponse());
    }

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param resourceGroupName The name of the resource group.
     * @param routeTableName The name of the route table.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listAsync(final String resourceGroupName, final String routeTableName, final ListOperationCallback<Route> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (resourceGroupName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
            return null;
        }
        if (routeTableName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter routeTableName is required and cannot be null."));
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
        Call<ResponseBody> call = service.list(resourceGroupName, routeTableName, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<List<Route>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl<Route>> result = listDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl<Route>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Route>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<Route>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Route&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PageImpl<Route>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute());
    }

    /**
     * The List network security rule opertion retrieves all the routes in a route table.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Route> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        serviceCall.newCall(call);
        call.enqueue(new ServiceResponseCallback<List<Route>>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    ServiceResponse<PageImpl<Route>> result = listNextDelegate(response);
                    serviceCallback.load(result.getBody().getItems());
                    if (result.getBody().getNextPageLink() != null
                            && serviceCallback.progress(result.getBody().getItems()) == ListOperationCallback.PagingBahavior.CONTINUE) {
                        listNextAsync(result.getBody().getNextPageLink(), serviceCall, serviceCallback);
                    } else {
                        serviceCallback.success(new ServiceResponse<>(serviceCallback.get(), result.getResponse()));
                    }
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<PageImpl<Route>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<Route>, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<PageImpl<Route>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
