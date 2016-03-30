/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetwork;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworksOperations.
 */
public interface VirtualNetworksOperations {
    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String virtualNetworkName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String virtualNetworkName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Delete VirtualNetwork operation deletes the specifed virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String virtualNetworkName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetwork object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetwork> get(String resourceGroupName, String virtualNetworkName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkName, final ServiceCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;
    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetwork object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetwork> get(String resourceGroupName, String virtualNetworkName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetwork operation retrieves information about the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkName, String expand, final ServiceCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetwork object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetwork> createOrUpdate(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, final ServiceCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetwork object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetwork> beginCreateOrUpdate(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put VirtualNetwork operation creates/updates a virtual network in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param parameters Parameters supplied to the create/update Virtual Network operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String virtualNetworkName, VirtualNetwork parameters, final ServiceCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetwork&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualNetwork>> listAll() throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllAsync(final ListOperationCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetwork&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualNetwork>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetwork&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> listAllNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAllNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetwork&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualNetwork>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The list VirtualNetwork returns all Virtual Networks in a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualNetwork> serviceCallback) throws IllegalArgumentException;

}
