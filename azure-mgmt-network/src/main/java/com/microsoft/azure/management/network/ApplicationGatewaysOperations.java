/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ApplicationGateway;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplicationGatewaysOperations.
 */
public interface ApplicationGatewaysOperations {
    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete applicationgateway operation deletes the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ApplicationGateway> get(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get applicationgateway operation retreives information about the specified applicationgateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the applicationgateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ApplicationGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ApplicationGateway> createOrUpdate(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters, final ServiceCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ApplicationGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ApplicationGateway> beginCreateOrUpdate(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put ApplicationGateway operation creates/updates a ApplicationGateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the ApplicationGateway.
     * @param parameters Parameters supplied to the create/delete ApplicationGateway operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String applicationGatewayName, ApplicationGateway parameters, final ServiceCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ApplicationGateway>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ApplicationGateway>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> start(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall startAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginStart(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Start ApplicationGateway operation starts application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginStartAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> stop(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall stopAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginStop(String resourceGroupName, String applicationGatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The STOP ApplicationGateway operation stops application gatewayin the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginStopAsync(String resourceGroupName, String applicationGatewayName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ApplicationGateway>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List ApplicationGateway opertion retrieves all the applicationgateways in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ApplicationGateway&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ApplicationGateway>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List applicationgateway opertion retrieves all the applicationgateways in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ApplicationGateway> serviceCallback) throws IllegalArgumentException;

}
