/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.SourceControl;
import com.microsoft.azure.management.website.models.SourceControlCollection;
import com.microsoft.azure.management.website.models.User;
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
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ProviderOperations.
 */
public final class ProviderOperationsImpl implements ProviderOperations {
    /** The Retrofit service to perform REST calls. */
    private ProviderService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClient client;

    /**
     * Initializes an instance of ProviderOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProviderOperationsImpl(Retrofit retrofit, WebSiteManagementClient client) {
        this.service = retrofit.create(ProviderService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProviderOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProviderService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("providers/Microsoft.Web/sourcecontrols")
        Call<ResponseBody> getSourceControls(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("providers/Microsoft.Web/sourcecontrols/{sourceControlType}")
        Call<ResponseBody> getSourceControl(@Path("sourceControlType") String sourceControlType, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("providers/Microsoft.Web/sourcecontrols/{sourceControlType}")
        Call<ResponseBody> updateSourceControl(@Path("sourceControlType") String sourceControlType, @Body SourceControl requestMessage, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("providers/Microsoft.Web/publishingUsers/web")
        Call<ResponseBody> getPublishingUser(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("providers/Microsoft.Web/publishingUsers/web")
        Call<ResponseBody> updatePublishingUser(@Body User requestMessage, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }

    /**
     * Gets the source controls available for Azure websites.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControlCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SourceControlCollection> getSourceControls() throws CloudException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSourceControls(this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSourceControlsDelegate(call.execute());
    }

    /**
     * Gets the source controls available for Azure websites.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSourceControlsAsync(final ServiceCallback<SourceControlCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSourceControls(this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SourceControlCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSourceControlsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SourceControlCollection> getSourceControlsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SourceControlCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SourceControlCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SourceControl> getSourceControl(String sourceControlType) throws CloudException, IOException, IllegalArgumentException {
        if (sourceControlType == null) {
            throw new IllegalArgumentException("Parameter sourceControlType is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSourceControl(sourceControlType, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getSourceControlDelegate(call.execute());
    }

    /**
     * Gets source control token.
     *
     * @param sourceControlType Type of source control
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getSourceControlAsync(String sourceControlType, final ServiceCallback<SourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (sourceControlType == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter sourceControlType is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSourceControl(sourceControlType, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SourceControl> getSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<SourceControl> updateSourceControl(String sourceControlType, SourceControl requestMessage) throws CloudException, IOException, IllegalArgumentException {
        if (sourceControlType == null) {
            throw new IllegalArgumentException("Parameter sourceControlType is required and cannot be null.");
        }
        if (requestMessage == null) {
            throw new IllegalArgumentException("Parameter requestMessage is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(requestMessage);
        Call<ResponseBody> call = service.updateSourceControl(sourceControlType, requestMessage, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updateSourceControlDelegate(call.execute());
    }

    /**
     * Updates source control token.
     *
     * @param sourceControlType Type of source control
     * @param requestMessage Source control token information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updateSourceControlAsync(String sourceControlType, SourceControl requestMessage, final ServiceCallback<SourceControl> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (sourceControlType == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter sourceControlType is required and cannot be null."));
            return null;
        }
        if (requestMessage == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter requestMessage is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(requestMessage, serviceCallback);
        Call<ResponseBody> call = service.updateSourceControl(sourceControlType, requestMessage, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<SourceControl>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updateSourceControlDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<SourceControl> updateSourceControlDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<SourceControl, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<SourceControl>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets publishing user.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<User> getPublishingUser() throws CloudException, IOException, IllegalArgumentException {
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getPublishingUser(this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getPublishingUserDelegate(call.execute());
    }

    /**
     * Gets publishing user.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getPublishingUserAsync(final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getPublishingUser(this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<User>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getPublishingUserDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<User> getPublishingUserDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<User, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<User>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<User> updatePublishingUser(User requestMessage) throws CloudException, IOException, IllegalArgumentException {
        if (requestMessage == null) {
            throw new IllegalArgumentException("Parameter requestMessage is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Validator.validate(requestMessage);
        Call<ResponseBody> call = service.updatePublishingUser(requestMessage, this.client.getApiVersion(), this.client.getAcceptLanguage());
        return updatePublishingUserDelegate(call.execute());
    }

    /**
     * Updates publishing user.
     *
     * @param requestMessage Details of publishing user
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall updatePublishingUserAsync(User requestMessage, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (requestMessage == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter requestMessage is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Validator.validate(requestMessage, serviceCallback);
        Call<ResponseBody> call = service.updatePublishingUser(requestMessage, this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<User>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(updatePublishingUserDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<User> updatePublishingUserDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<User, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<User>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
