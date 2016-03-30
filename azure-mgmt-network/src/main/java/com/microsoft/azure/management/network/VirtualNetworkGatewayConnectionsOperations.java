/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.ConnectionResetSharedKey;
import com.microsoft.azure.management.network.models.ConnectionSharedKey;
import com.microsoft.azure.management.network.models.ConnectionSharedKeyResult;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.VirtualNetworkGatewayConnection;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualNetworkGatewayConnectionsOperations.
 */
public interface VirtualNetworkGatewayConnectionsOperations {
    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the VirtualNetworkGatewayConnection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGatewayConnection> createOrUpdate(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters, final ServiceCallback<VirtualNetworkGatewayConnection> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGatewayConnection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGatewayConnection> beginCreateOrUpdate(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnection operation creates/updates a virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway conenction.
     * @param parameters Parameters supplied to the Begin Create or update Virtual Network Gateway connection operation through Network resource provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, VirtualNetworkGatewayConnection parameters, final ServiceCallback<VirtualNetworkGatewayConnection> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get VirtualNetworkGatewayConnection operation retrieves information about the specified virtual network gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualNetworkGatewayConnection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VirtualNetworkGatewayConnection> get(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetworkGatewayConnection operation retrieves information about the specified virtual network gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<VirtualNetworkGatewayConnection> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Delete VirtualNetworkGatewayConnection operation deletes the specifed virtual network Gateway connection through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param connectionSharedKeyName The virtual network gateway connection shared key name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionSharedKeyResult object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionSharedKeyResult> getSharedKey(String resourceGroupName, String connectionSharedKeyName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get VirtualNetworkGatewayConnectionSharedKey operation retrieves information about the specified virtual network gateway connection shared key through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param connectionSharedKeyName The virtual network gateway connection shared key name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSharedKeyAsync(String resourceGroupName, String connectionSharedKeyName, final ServiceCallback<ConnectionSharedKeyResult> serviceCallback) throws IllegalArgumentException;

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetworkGatewayConnection&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<VirtualNetworkGatewayConnection>> list(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final ListOperationCallback<VirtualNetworkGatewayConnection> serviceCallback) throws IllegalArgumentException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionResetSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionResetSharedKey> resetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<ConnectionResetSharedKey> serviceCallback) throws IllegalArgumentException;
    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param keyLength The virtual network connection reset shared key length
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionResetSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionResetSharedKey> resetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, Long keyLength) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param keyLength The virtual network connection reset shared key length
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, Long keyLength, final ServiceCallback<ConnectionResetSharedKey> serviceCallback) throws IllegalArgumentException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionResetSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionResetSharedKey> beginResetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginResetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<ConnectionResetSharedKey> serviceCallback) throws IllegalArgumentException;
    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param keyLength The virtual network connection reset shared key length
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionResetSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionResetSharedKey> beginResetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, Long keyLength) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The VirtualNetworkGatewayConnectionResetSharedKey operation resets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection reset shared key Name.
     * @param keyLength The virtual network connection reset shared key length
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginResetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, Long keyLength, final ServiceCallback<ConnectionResetSharedKey> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionSharedKey> setSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<ConnectionSharedKey> serviceCallback) throws IllegalArgumentException;
    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param value The virtual network connection shared key value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ConnectionSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionSharedKey> setSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, String value) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param value The virtual network connection shared key value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall setSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, String value, final ServiceCallback<ConnectionSharedKey> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionSharedKey> beginSetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginSetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, final ServiceCallback<ConnectionSharedKey> serviceCallback) throws IllegalArgumentException;
    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param value The virtual network connection shared key value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionSharedKey object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionSharedKey> beginSetSharedKey(String resourceGroupName, String virtualNetworkGatewayConnectionName, String value) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put VirtualNetworkGatewayConnectionSharedKey operation sets the virtual network gateway connection shared key for passed virtual network gateway connection in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The virtual network gateway connection name.
     * @param value The virtual network connection shared key value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginSetSharedKeyAsync(String resourceGroupName, String virtualNetworkGatewayConnectionName, String value, final ServiceCallback<ConnectionSharedKey> serviceCallback) throws IllegalArgumentException;

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualNetworkGatewayConnection&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<VirtualNetworkGatewayConnection>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List VirtualNetworkGatewayConnections operation retrieves all the virtual network gateways connections created.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<VirtualNetworkGatewayConnection> serviceCallback) throws IllegalArgumentException;

}
