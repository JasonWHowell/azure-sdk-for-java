/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.website.models.MetricDefinitionCollection;
import com.microsoft.azure.management.website.models.PageImpl;
import com.microsoft.azure.management.website.models.ResourceMetricCollection;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.ServerFarmWithRichSku;
import com.microsoft.azure.management.website.models.Site;
import com.microsoft.azure.management.website.models.VnetGateway;
import com.microsoft.azure.management.website.models.VnetInfo;
import com.microsoft.azure.management.website.models.VnetRoute;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in ServerFarmsOperations.
 */
public interface ServerFarmsOperations {
    /**
     * Gets collection of App Service Plans in a resource group for a given subscription.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getServerFarms(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets collection of App Service Plans in a resource group for a given subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmsAsync(String resourceGroupName, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets specified App Service Plan in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> getServerFarm(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets specified App Service Plan in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> createOrUpdateServerFarm(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateServerFarmAsync(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param allowPendingState OBSOLETE: If true, allow pending state for App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> createOrUpdateServerFarm(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, Boolean allowPendingState) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param allowPendingState OBSOLETE: If true, allow pending state for App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateServerFarmAsync(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, Boolean allowPendingState, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> beginCreateOrUpdateServerFarm(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateServerFarmAsync(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param allowPendingState OBSOLETE: If true, allow pending state for App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> beginCreateOrUpdateServerFarm(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, Boolean allowPendingState) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates or updates an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serverFarmEnvelope Details of App Service Plan
     * @param allowPendingState OBSOLETE: If true, allow pending state for App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateServerFarmAsync(String resourceGroupName, String name, ServerFarmWithRichSku serverFarmEnvelope, Boolean allowPendingState, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteServerFarm(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteServerFarmAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Queries for App Serice Plan metrics.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getServerFarmMetrics(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Queries for App Serice Plan metrics.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmMetricsAsync(String resourceGroupName, String name, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Queries for App Serice Plan metrics.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param details If true, metrics are broken down per App Service Plan instance
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getServerFarmMetrics(String resourceGroupName, String name, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Queries for App Serice Plan metrics.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param details If true, metrics are broken down per App Service Plan instance
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmMetricsAsync(String resourceGroupName, String name, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List of metrics that can be queried for an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinitionCollection> getServerFarmMetricDefintions(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List of metrics that can be queried for an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmMetricDefintionsAsync(String resourceGroupName, String name, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets list of vnets associated with App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetInfo&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VnetInfo>> getVnetsForServerFarm(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of vnets associated with App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getVnetsForServerFarmAsync(String resourceGroupName, String name, final ServiceCallback<List<VnetInfo>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a vnet associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> getVnetFromServerFarm(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a vnet associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getVnetFromServerFarmAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of all routes associated with a vnet, in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetRoute&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VnetRoute>> getRoutesForVnet(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of all routes associated with a vnet, in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRoutesForVnetAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<List<VnetRoute>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a specific route associated with a vnet, in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetRoute&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VnetRoute>> getRouteForVnet(String resourceGroupName, String name, String vnetName, String routeName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a specific route associated with a vnet, in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRouteForVnetAsync(String resourceGroupName, String name, String vnetName, String routeName, final ServiceCallback<List<VnetRoute>> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new route or updates an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param route The route object
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetRoute object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetRoute> createOrUpdateVnetRoute(String resourceGroupName, String name, String vnetName, String routeName, VnetRoute route) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new route or updates an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param route The route object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateVnetRouteAsync(String resourceGroupName, String name, String vnetName, String routeName, VnetRoute route, final ServiceCallback<VnetRoute> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteVnetRoute(String resourceGroupName, String name, String vnetName, String routeName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteVnetRouteAsync(String resourceGroupName, String name, String vnetName, String routeName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new route or updates an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param route The route object
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetRoute object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetRoute> updateVnetRoute(String resourceGroupName, String name, String vnetName, String routeName, VnetRoute route) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new route or updates an existing route for a vnet in an app service plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param vnetName Name of virtual network
     * @param routeName Name of the virtual network route
     * @param route The route object
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateVnetRouteAsync(String resourceGroupName, String name, String vnetName, String routeName, VnetRoute route, final ServiceCallback<VnetRoute> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the vnet gateway.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of the App Service Plan
     * @param vnetName Name of the virtual network
     * @param gatewayName Name of the gateway. Only the 'primary' gateway is supported.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> getServerFarmVnetGateway(String resourceGroupName, String name, String vnetName, String gatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the vnet gateway.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of the App Service Plan
     * @param vnetName Name of the virtual network
     * @param gatewayName Name of the gateway. Only the 'primary' gateway is supported.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the vnet gateway.
     *
     * @param resourceGroupName The resource group
     * @param name The name of the App Service Plan
     * @param vnetName The name of the virtual network
     * @param gatewayName The name of the gateway. Only 'primary' is supported.
     * @param connectionEnvelope The gateway entity.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> updateServerFarmVnetGateway(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the vnet gateway.
     *
     * @param resourceGroupName The resource group
     * @param name The name of the App Service Plan
     * @param vnetName The name of the virtual network
     * @param gatewayName The name of the gateway. Only 'primary' is supported.
     * @param connectionEnvelope The gateway entity.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateServerFarmVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Site&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Site>> getServerFarmSites(final String resourceGroupName, final String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmSitesAsync(final String resourceGroupName, final String name, final ListOperationCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param skipToken Skip to of web apps in a list. If specified, the resulting list will contain web apps starting from (including) the skipToken. Else, the resulting list contains web apps from the start of the list
     * @param filter Supported filter: $filter=state eq running. Returns only web apps that are currently running
     * @param top List page size. If specified, results are paged.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Site&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Site>> getServerFarmSites(final String resourceGroupName, final String name, final String skipToken, final String filter, final String top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param skipToken Skip to of web apps in a list. If specified, the resulting list will contain web apps starting from (including) the skipToken. Else, the resulting list contains web apps from the start of the list
     * @param filter Supported filter: $filter=state eq running. Returns only web apps that are currently running
     * @param top List page size. If specified, results are paged.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmSitesAsync(final String resourceGroupName, final String name, final String skipToken, final String filter, final String top, final ListOperationCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Submit a reboot request for a worker machine in the specified server farm.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of server farm
     * @param workerName Name of worker machine, typically IP address
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> rebootWorkerForServerFarm(String resourceGroupName, String name, String workerName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Submit a reboot request for a worker machine in the specified server farm.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of server farm
     * @param workerName Name of worker machine, typically IP address
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall rebootWorkerForServerFarmAsync(String resourceGroupName, String name, String workerName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Restarts web apps in a specified App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSitesForServerFarm(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web apps in a specified App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSitesForServerFarmAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Restarts web apps in a specified App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param softRestart Soft restart applies the configuration settings and restarts the apps if necessary. Hard restart always restarts and reprovisions the apps
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSitesForServerFarm(String resourceGroupName, String name, Boolean softRestart) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web apps in a specified App Service Plan.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of App Service Plan
     * @param softRestart Soft restart applies the configuration settings and restarts the apps if necessary. Hard restart always restarts and reprovisions the apps
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSitesForServerFarmAsync(String resourceGroupName, String name, Boolean softRestart, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a server farm operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of server farm
     * @param operationId Id of Server farm operation"&amp;gt;
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmWithRichSku object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmWithRichSku> getServerFarmOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a server farm operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of server farm
     * @param operationId Id of Server farm operation"&amp;gt;
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<ServerFarmWithRichSku> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Site&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Site>> getServerFarmSitesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets list of Apps associated with an App Service Plan.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getServerFarmSitesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Site> serviceCallback) throws IllegalArgumentException;

}
