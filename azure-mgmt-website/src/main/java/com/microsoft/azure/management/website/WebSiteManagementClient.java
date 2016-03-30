/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.AutoRestBaseUrl;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.serializer.JacksonMapperAdapter;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

/**
 * The interface for WebSiteManagementClient class.
 */
public interface WebSiteManagementClient {
    /**
     * Gets the URL used as the base for all cloud service requests.
     *
     * @return the BaseUrl object.
     */
    AutoRestBaseUrl getBaseUrl();

    /**
     * Gets the list of interceptors the OkHttp client will execute.
     * @return the list of interceptors.
     */
    List<Interceptor> getClientInterceptors();

    /**
     * Sets the logging level for OkHttp client.
     *
     * @param logLevel the logging level enum.
     */
    void setLogLevel(Level logLevel);

    /**
     * Gets the adapter for {@link com.fasterxml.jackson.databind.ObjectMapper} for serialization
     * and deserialization operations..
     *
     * @return the adapter.
     */
    JacksonMapperAdapter getMapperAdapter();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets Gets Azure subscription credentials..
     *
     * @return the credentials value.
     */
    ServiceClientCredentials getCredentials();

    /**
     * Gets Subscription Id.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Sets Subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     */
    void setSubscriptionId(String subscriptionId);

    /**
     * Gets API Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    void setAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int getLongRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean getGenerateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    void setGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the CertificatesOperations object to access its operations.
     * @return the CertificatesOperations object.
     */
    CertificatesOperations getCertificatesOperations();

    /**
     * Gets the ClassicMobileServicesOperations object to access its operations.
     * @return the ClassicMobileServicesOperations object.
     */
    ClassicMobileServicesOperations getClassicMobileServicesOperations();

    /**
     * Gets the DomainsOperations object to access its operations.
     * @return the DomainsOperations object.
     */
    DomainsOperations getDomainsOperations();

    /**
     * Gets the GlobalOperations object to access its operations.
     * @return the GlobalOperations object.
     */
    GlobalOperations getGlobalOperations();

    /**
     * Gets the GlobalDomainRegistrationOperations object to access its operations.
     * @return the GlobalDomainRegistrationOperations object.
     */
    GlobalDomainRegistrationOperations getGlobalDomainRegistrationOperations();

    /**
     * Gets the GlobalResourceGroupsOperations object to access its operations.
     * @return the GlobalResourceGroupsOperations object.
     */
    GlobalResourceGroupsOperations getGlobalResourceGroupsOperations();

    /**
     * Gets the HostingEnvironmentsOperations object to access its operations.
     * @return the HostingEnvironmentsOperations object.
     */
    HostingEnvironmentsOperations getHostingEnvironmentsOperations();

    /**
     * Gets the ManagedHostingEnvironmentsOperations object to access its operations.
     * @return the ManagedHostingEnvironmentsOperations object.
     */
    ManagedHostingEnvironmentsOperations getManagedHostingEnvironmentsOperations();

    /**
     * Gets the ProviderOperations object to access its operations.
     * @return the ProviderOperations object.
     */
    ProviderOperations getProviderOperations();

    /**
     * Gets the RecommendationsOperations object to access its operations.
     * @return the RecommendationsOperations object.
     */
    RecommendationsOperations getRecommendationsOperations();

    /**
     * Gets the ServerFarmsOperations object to access its operations.
     * @return the ServerFarmsOperations object.
     */
    ServerFarmsOperations getServerFarmsOperations();

    /**
     * Gets the SitesOperations object to access its operations.
     * @return the SitesOperations object.
     */
    SitesOperations getSitesOperations();

    /**
     * Gets the TopLevelDomainsOperations object to access its operations.
     * @return the TopLevelDomainsOperations object.
     */
    TopLevelDomainsOperations getTopLevelDomainsOperations();

    /**
     * Gets the UsageOperations object to access its operations.
     * @return the UsageOperations object.
     */
    UsageOperations getUsageOperations();

}
