/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.TldLegalAgreementCollection;
import com.microsoft.azure.management.website.models.TopLevelDomain;
import com.microsoft.azure.management.website.models.TopLevelDomainAgreementOption;
import com.microsoft.azure.management.website.models.TopLevelDomainCollection;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in TopLevelDomainsOperations.
 */
public final class TopLevelDomainsOperationsImpl implements TopLevelDomainsOperations {
    /** The Retrofit service to perform REST calls. */
    private TopLevelDomainsService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClient client;

    /**
     * Initializes an instance of TopLevelDomainsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TopLevelDomainsOperationsImpl(Retrofit retrofit, WebSiteManagementClient client) {
        this.service = retrofit.create(TopLevelDomainsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TopLevelDomainsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TopLevelDomainsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains")
        Call<ResponseBody> getGetTopLevelDomains(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}")
        Call<ResponseBody> getTopLevelDomain(@Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}/listAgreements")
        Call<ResponseBody> listTopLevelDomainAgreements(@Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body TopLevelDomainAgreementOption agreementOption);

    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TopLevelDomainCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<TopLevelDomainCollection> getGetTopLevelDomains() throws CloudException, IOException, IllegalArgumentException {
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getGetTopLevelDomains(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getGetTopLevelDomainsDelegate(call.execute());
    }

    /**
     * Lists all top level domains supported for registration.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getGetTopLevelDomainsAsync(final ServiceCallback<TopLevelDomainCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (this.client.getApiVersion() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getGetTopLevelDomains(this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<TopLevelDomainCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getGetTopLevelDomainsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<TopLevelDomainCollection> getGetTopLevelDomainsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<TopLevelDomainCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<TopLevelDomainCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TopLevelDomain object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<TopLevelDomain> getTopLevelDomain(String name) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getTopLevelDomain(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        return getTopLevelDomainDelegate(call.execute());
    }

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getTopLevelDomainAsync(String name, final ServiceCallback<TopLevelDomain> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
        Call<ResponseBody> call = service.getTopLevelDomain(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<TopLevelDomain>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getTopLevelDomainDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<TopLevelDomain> getTopLevelDomainDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<TopLevelDomain, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<TopLevelDomain>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TldLegalAgreementCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<TldLegalAgreementCollection> listTopLevelDomainAgreements(String name) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        final Boolean includePrivacy = null;
        TopLevelDomainAgreementOption agreementOption = new TopLevelDomainAgreementOption();
        agreementOption.setIncludePrivacy(includePrivacy);
        Call<ResponseBody> call = service.listTopLevelDomainAgreements(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage(), agreementOption);
        return listTopLevelDomainAgreementsDelegate(call.execute());
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listTopLevelDomainAgreementsAsync(String name, final ServiceCallback<TldLegalAgreementCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
        final Boolean includePrivacy = null;
        TopLevelDomainAgreementOption agreementOption = new TopLevelDomainAgreementOption();
        agreementOption.setIncludePrivacy(includePrivacy);
        Call<ResponseBody> call = service.listTopLevelDomainAgreements(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage(), agreementOption);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<TldLegalAgreementCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listTopLevelDomainAgreementsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @param includePrivacy If true then the list of agreements will inclue agreements for domain privacy as well.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TldLegalAgreementCollection object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<TldLegalAgreementCollection> listTopLevelDomainAgreements(String name, Boolean includePrivacy) throws CloudException, IOException, IllegalArgumentException {
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (this.client.getApiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.getApiVersion() is required and cannot be null.");
        }
        TopLevelDomainAgreementOption agreementOption = new TopLevelDomainAgreementOption();
        agreementOption.setIncludePrivacy(includePrivacy);
        Call<ResponseBody> call = service.listTopLevelDomainAgreements(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage(), agreementOption);
        return listTopLevelDomainAgreementsDelegate(call.execute());
    }

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @param includePrivacy If true then the list of agreements will inclue agreements for domain privacy as well.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall listTopLevelDomainAgreementsAsync(String name, Boolean includePrivacy, final ServiceCallback<TldLegalAgreementCollection> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (name == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter name is required and cannot be null."));
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
        TopLevelDomainAgreementOption agreementOption = new TopLevelDomainAgreementOption();
        agreementOption.setIncludePrivacy(includePrivacy);
        Call<ResponseBody> call = service.listTopLevelDomainAgreements(name, this.client.getSubscriptionId(), this.client.getApiVersion(), this.client.getAcceptLanguage(), agreementOption);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<TldLegalAgreementCollection>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(listTopLevelDomainAgreementsDelegate(response));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<TldLegalAgreementCollection> listTopLevelDomainAgreementsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<TldLegalAgreementCollection, CloudException>(this.client.getMapperAdapter())
                .register(200, new TypeToken<TldLegalAgreementCollection>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
