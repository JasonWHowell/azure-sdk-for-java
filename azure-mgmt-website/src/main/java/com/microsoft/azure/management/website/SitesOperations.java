/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.BackupItem;
import com.microsoft.azure.management.website.models.BackupItemCollection;
import com.microsoft.azure.management.website.models.BackupRequest;
import com.microsoft.azure.management.website.models.ConnectionStringDictionary;
import com.microsoft.azure.management.website.models.CsmSiteRecoveryEntity;
import com.microsoft.azure.management.website.models.CsmSlotEntity;
import com.microsoft.azure.management.website.models.CsmUsageQuotaCollection;
import com.microsoft.azure.management.website.models.DeletedSiteCollection;
import com.microsoft.azure.management.website.models.Deployment;
import com.microsoft.azure.management.website.models.DeploymentCollection;
import com.microsoft.azure.management.website.models.HostNameBinding;
import com.microsoft.azure.management.website.models.HostNameBindingCollection;
import com.microsoft.azure.management.website.models.MetricDefinitionCollection;
import com.microsoft.azure.management.website.models.NetworkFeatures;
import com.microsoft.azure.management.website.models.PremierAddOnRequest;
import com.microsoft.azure.management.website.models.RelayServiceConnectionEntity;
import com.microsoft.azure.management.website.models.ResourceMetricCollection;
import com.microsoft.azure.management.website.models.RestoreRequest;
import com.microsoft.azure.management.website.models.RestoreResponse;
import com.microsoft.azure.management.website.models.Site;
import com.microsoft.azure.management.website.models.SiteAuthSettings;
import com.microsoft.azure.management.website.models.SiteCloneability;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.azure.management.website.models.SiteConfig;
import com.microsoft.azure.management.website.models.SiteInstanceCollection;
import com.microsoft.azure.management.website.models.SiteLogsConfig;
import com.microsoft.azure.management.website.models.SiteSourceControl;
import com.microsoft.azure.management.website.models.SlotConfigNamesResource;
import com.microsoft.azure.management.website.models.SlotDifferenceCollection;
import com.microsoft.azure.management.website.models.StringDictionary;
import com.microsoft.azure.management.website.models.User;
import com.microsoft.azure.management.website.models.VnetGateway;
import com.microsoft.azure.management.website.models.VnetInfo;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in SitesOperations.
 */
public interface SitesOperations {
    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> getSiteVNETConnection(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnection(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteVNETConnection(String resourceGroupName, String name, String vnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> updateSiteVNETConnection(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteVNETConnectionAsync(String resourceGroupName, String name, String vnetName, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> getSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a specific Virtual Network Connection associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> createOrUpdateSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes the specified Virtual Network Connection association from this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetInfo object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetInfo> updateSiteVNETConnectionSlot(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Adds a Virtual Network Connection or updates it's properties.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties of this Virtual Network Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteVNETConnectionSlotAsync(String resourceGroupName, String name, String vnetName, String slot, VnetInfo connectionEnvelope, final ServiceCallback<VnetInfo> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkFeatures object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkFeatures> getSiteNetworkFeatures(String resourceGroupName, String name, String view) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteNetworkFeaturesAsync(String resourceGroupName, String name, String view, final ServiceCallback<NetworkFeatures> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the NetworkFeatures object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<NetworkFeatures> getSiteNetworkFeaturesSlot(String resourceGroupName, String name, String view, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a view of all network features in use on this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param view The type of view. This can either be "summary" or "detailed".
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteNetworkFeaturesSlotAsync(String resourceGroupName, String name, String view, String slot, final ServiceCallback<NetworkFeatures> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteOperationSlot(String resourceGroupName, String name, String operationId, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteOperationSlotAsync(String resourceGroupName, String name, String operationId, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the operation for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param operationId Id of an operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> swapSlotWithProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall swapSlotWithProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of source slot for the swap
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> swapSlotsSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Swaps web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of source slot for the swap
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall swapSlotsSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotDifferenceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesFromProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSlotsDifferencesFromProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<SlotDifferenceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot
     * @param slotSwapEntity Request body that contains the target slot name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotDifferenceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SlotDifferenceCollection> getSlotsDifferencesSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the difference in configuration settings between two web app slots.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot
     * @param slotSwapEntity Request body that contains the target slot name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSlotsDifferencesSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<SlotDifferenceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot. Settings from the target slot will be applied onto this slot
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> applySlotConfigSlot(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of the source slot. Settings from the target slot will be applied onto this slot
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall applySlotConfigSlotAsync(String resourceGroupName, String name, String slot, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> applySlotConfigToProduction(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Applies the configuration settings from the target slot onto the current slot.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotSwapEntity Request body that contains the target slot name. Settings from that slot will be applied on the source slot
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall applySlotConfigToProductionAsync(String resourceGroupName, String name, CsmSlotEntity slotSwapEntity, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> resetSlotConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resetSlotConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> resetProductionSlotConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Resets the configuration settings of the current slot if they were previously modified by calling ApplySlotConfig API.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resetProductionSlotConfigAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotConfigNamesResource object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SlotConfigNamesResource> getSlotConfigNames(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSlotConfigNamesAsync(String resourceGroupName, String name, final ServiceCallback<SlotConfigNamesResource> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotConfigNames Request body containing the names of application settings and connection strings
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SlotConfigNamesResource object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SlotConfigNamesResource> updateSlotConfigNames(String resourceGroupName, String name, SlotConfigNamesResource slotConfigNames) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the names of application settings and connection string that remain with the slot during swap operation.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slotConfigNames Request body containing the names of application settings and connection strings
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSlotConfigNamesAsync(String resourceGroupName, String name, SlotConfigNamesResource slotConfigNames, final ServiceCallback<SlotConfigNamesResource> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getSiteSlots(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSlotsAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude List of app properties to include in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getSiteSlots(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all the slots for a web apps.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude List of app properties to include in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSlotsAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getSites(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSitesAsync(String resourceGroupName, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param includeSlots Whether or not to include deployments slots in results
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getSites(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, Boolean includeSlots) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web apps for a subscription in the specified resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param includeSlots Whether or not to include deployments slots in results
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSitesAsync(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, Boolean includeSlots, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> getSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteAsync(String resourceGroupName, String name, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude Additional web app properties included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> getSite(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param propertiesToInclude Additional web app properties included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> createOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> createOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> beginCreateOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> beginCreateOrUpdateSite(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateSiteAsync(String resourceGroupName, String name, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSite(String resourceGroupName, String name, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteAsync(String resourceGroupName, String name, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> getSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param propertiesToInclude Additional web app properties included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> getSiteSlot(String resourceGroupName, String name, String slot, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get details of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param propertiesToInclude Additional web app properties included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSlotAsync(String resourceGroupName, String name, String slot, String propertiesToInclude, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> createOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> createOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> beginCreateOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;
    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Site object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Site> beginCreateOrUpdateSiteSlot(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteEnvelope Details of web app if it exists already
     * @param skipDnsRegistration If true web app hostname is not registered with DNS on creation. This parameter is
                 only used for app creation
     * @param skipCustomDomainVerification If true, custom (non *.azurewebsites.net) domains associated with web app are not verified.
     * @param forceDnsRegistration If true, web app hostname is force registered with DNS
     * @param ttlInSeconds Time to live in seconds for web app's default domain name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateSiteSlotAsync(String resourceGroupName, String name, String slot, Site siteEnvelope, String skipDnsRegistration, String skipCustomDomainVerification, String forceDnsRegistration, String ttlInSeconds, final ServiceCallback<Site> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteSlot(String resourceGroupName, String name, String slot, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deleteMetrics If true, web app metrics are also deleted
     * @param deleteEmptyServerFarm If true and App Service Plan is empty after web app deletion, App Service Plan is also deleted
     * @param skipDnsRegistration If true, DNS registration is skipped
     * @param deleteAllSlots If true, all slots associated with web app are also deleted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteSlotAsync(String resourceGroupName, String name, String slot, String deleteMetrics, String deleteEmptyServerFarm, String skipDnsRegistration, String deleteAllSlots, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCloneability object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCloneability> isSiteCloneable(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall isSiteCloneableAsync(String resourceGroupName, String name, final ServiceCallback<SiteCloneability> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCloneability object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCloneability> isSiteCloneableSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new web app or modifies an existing web app.
     *
     * @param resourceGroupName Name of the resource group
     * @param name Name of the web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall isSiteCloneableSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteCloneability> serviceCallback) throws IllegalArgumentException;

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> recoverSite(String resourceGroupName, String name, CsmSiteRecoveryEntity snapshot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall recoverSiteAsync(String resourceGroupName, String name, CsmSiteRecoveryEntity snapshot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> recoverSiteSlot(String resourceGroupName, String name, String slot, CsmSiteRecoveryEntity snapshot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Recovers a deleted web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param snapshot Snapshot data used for web app recovery. Snapshot information can be obtained by call GetDeletedSites API.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall recoverSiteSlotAsync(String resourceGroupName, String name, String slot, CsmSiteRecoveryEntity snapshot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteSnapshotsOnSku(String name, String resourceGroupName, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSnapshotsOnSkuAsync(String name, String resourceGroupName, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteSnapshotsOnSkuSlot(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Returns Snapshots to the user based on their SKU.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSnapshotsOnSkuSlotAsync(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteSnapshots(String name, String resourceGroupName, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSnapshotsAsync(String name, String resourceGroupName, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteSnapshotsSlot(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Returns all Snapshots to the user.
     *
     * @param name Website Name
     * @param resourceGroupName the String value
     * @param slot the String value
     * @param subscriptionName Azure subscription
     * @param webspaceName Webspace
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSnapshotsSlotAsync(String name, String resourceGroupName, String slot, String subscriptionName, String webspaceName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeletedSiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeletedSiteCollection> getDeletedSites(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeletedSitesAsync(String resourceGroupName, final ServiceCallback<DeletedSiteCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeletedSiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeletedSiteCollection> getDeletedSites(String resourceGroupName, String propertiesToInclude, String includeSiteTypes) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets deleted web apps in subscription.
     *
     * @param resourceGroupName Name of resource group
     * @param propertiesToInclude Additional web app properties included in the response
     * @param includeSiteTypes Types of apps included in the response
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeletedSitesAsync(String resourceGroupName, String propertiesToInclude, String includeSiteTypes, final ServiceCallback<DeletedSiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeploymentCollection> getDeployments(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeploymentsAsync(String resourceGroupName, String name, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeploymentCollection> getDeploymentsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeploymentsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeploymentCollection> getInstanceDeployments(String resourceGroupName, String name, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInstanceDeploymentsAsync(String resourceGroupName, String name, String instanceId, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DeploymentCollection> getInstanceDeploymentsSlot(String resourceGroupName, String name, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List deployments.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInstanceDeploymentsSlotAsync(String resourceGroupName, String name, String slot, String instanceId, final ServiceCallback<DeploymentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> getDeploymentSlot(String resourceGroupName, String name, String id, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> createDeploymentSlot(String resourceGroupName, String name, String id, String slot, Deployment deployment) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteDeploymentSlot(String resourceGroupName, String name, String id, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> getDeployment(String resourceGroupName, String name, String id) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getDeploymentAsync(String resourceGroupName, String name, String id, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> createDeployment(String resourceGroupName, String name, String id, Deployment deployment) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createDeploymentAsync(String resourceGroupName, String name, String id, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteDeployment(String resourceGroupName, String name, String id) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteDeploymentAsync(String resourceGroupName, String name, String id, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> getInstanceDeployment(String resourceGroupName, String name, String id, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> createInstanceDeployment(String resourceGroupName, String name, String id, String instanceId, Deployment deployment) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteInstanceDeployment(String resourceGroupName, String name, String id, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteInstanceDeploymentAsync(String resourceGroupName, String name, String id, String instanceId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> getInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Deployment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Deployment> createInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId, Deployment deployment) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param deployment Details of deployment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, Deployment deployment, final ServiceCallback<Deployment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteInstanceDeploymentSlot(String resourceGroupName, String name, String id, String slot, String instanceId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete the deployment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param id Id of the deployment
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param instanceId Id of web app instance
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteInstanceDeploymentSlotAsync(String resourceGroupName, String name, String id, String slot, String instanceId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteInstanceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiers(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteInstanceIdentifiersAsync(String resourceGroupName, String name, final ServiceCallback<SiteInstanceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteInstanceCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteInstanceCollection> getSiteInstanceIdentifiersSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets all instance of a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteInstanceIdentifiersSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteInstanceCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBindingCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBindingCollection> getSiteHostNameBindingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteHostNameBindingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<HostNameBindingCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBindingCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBindingCollection> getSiteHostNameBindings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get web app hostname bindings.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteHostNameBindingsAsync(String resourceGroupName, String name, final ServiceCallback<HostNameBindingCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBinding> getSiteHostNameBinding(String resourceGroupName, String name, String hostName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param hostNameBinding Host name binding information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBinding(String resourceGroupName, String name, String hostName, HostNameBinding hostNameBinding) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param hostNameBinding Host name binding information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, HostNameBinding hostNameBinding, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteHostNameBinding(String resourceGroupName, String name, String hostName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteHostNameBindingAsync(String resourceGroupName, String name, String hostName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBinding> getSiteHostNameBindingSlot(String resourceGroupName, String name, String slot, String hostName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get web app binding for a hostname.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String slot, String hostName, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostNameBinding Host name binding information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostNameBinding object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostNameBinding> createOrUpdateSiteHostNameBindingSlot(String resourceGroupName, String name, String hostName, String slot, HostNameBinding hostNameBinding) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a web app hostname binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param hostName Name of host
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostNameBinding Host name binding information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String hostName, String slot, HostNameBinding hostNameBinding, final ServiceCallback<HostNameBinding> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteHostNameBindingSlot(String resourceGroupName, String name, String slot, String hostName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a host name binding.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param hostName Name of host
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteHostNameBindingSlotAsync(String resourceGroupName, String name, String slot, String hostName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> getSiteConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteConfigAsync(String resourceGroupName, String name, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> createOrUpdateSiteConfig(String resourceGroupName, String name, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteConfigAsync(String resourceGroupName, String name, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> updateSiteConfig(String resourceGroupName, String name, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteConfigAsync(String resourceGroupName, String name, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> getSiteConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the configuration of the web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> createOrUpdateSiteConfigSlot(String resourceGroupName, String name, String slot, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteConfigSlotAsync(String resourceGroupName, String name, String slot, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteConfig> updateSiteConfigSlot(String resourceGroupName, String name, String slot, SiteConfig siteConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteConfig Request body that contains the configuraiton setting for the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteConfigSlotAsync(String resourceGroupName, String name, String slot, SiteConfig siteConfig, final ServiceCallback<SiteConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> getSiteSourceControl(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSourceControlAsync(String resourceGroupName, String name, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControl(String resourceGroupName, String name, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteSourceControlAsync(String resourceGroupName, String name, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteSourceControl(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteSourceControlAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> updateSiteSourceControl(String resourceGroupName, String name, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteSourceControlAsync(String resourceGroupName, String name, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> getSiteSourceControlSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> createOrUpdateSiteSourceControlSlot(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteSourceControlSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteSourceControl object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteSourceControl> updateSiteSourceControlSlot(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Update the source control configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteSourceControl Request body that contains the source control parameters
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteSourceControlSlotAsync(String resourceGroupName, String name, String slot, SiteSourceControl siteSourceControl, final ServiceCallback<SiteSourceControl> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> listSiteAppSettings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteAppSettingsAsync(String resourceGroupName, String name, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> listSiteAppSettingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteAppSettingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param appSettings Application settings of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> updateSiteAppSettings(String resourceGroupName, String name, StringDictionary appSettings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param appSettings Application settings of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteAppSettingsAsync(String resourceGroupName, String name, StringDictionary appSettings, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param appSettings Application settings of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> updateSiteAppSettingsSlot(String resourceGroupName, String name, String slot, StringDictionary appSettings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the application settings of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param appSettings Application settings of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteAppSettingsSlotAsync(String resourceGroupName, String name, String slot, StringDictionary appSettings, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionStringDictionary> listSiteConnectionStrings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteConnectionStringsAsync(String resourceGroupName, String name, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionStringDictionary> listSiteConnectionStringsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteConnectionStringsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param connectionStrings Connection strings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStrings(String resourceGroupName, String name, ConnectionStringDictionary connectionStrings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param connectionStrings Connection strings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteConnectionStringsAsync(String resourceGroupName, String name, ConnectionStringDictionary connectionStrings, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param connectionStrings Connection strings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ConnectionStringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ConnectionStringDictionary> updateSiteConnectionStringsSlot(String resourceGroupName, String name, String slot, ConnectionStringDictionary connectionStrings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the connection strings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param connectionStrings Connection strings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteConnectionStringsSlotAsync(String resourceGroupName, String name, String slot, ConnectionStringDictionary connectionStrings, final ServiceCallback<ConnectionStringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteAuthSettings> listSiteAuthSettings(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteAuthSettingsAsync(String resourceGroupName, String name, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteAuthSettings> listSiteAuthSettingsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteAuthSettingsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteAuthSettings Auth settings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteAuthSettings> updateSiteAuthSettings(String resourceGroupName, String name, SiteAuthSettings siteAuthSettings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteAuthSettings Auth settings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteAuthSettingsAsync(String resourceGroupName, String name, SiteAuthSettings siteAuthSettings, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteAuthSettings Auth settings associated with web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteAuthSettings object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteAuthSettings> updateSiteAuthSettingsSlot(String resourceGroupName, String name, String slot, SiteAuthSettings siteAuthSettings) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Authentication / Authorization settings associated with web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteAuthSettings Auth settings associated with web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteAuthSettingsSlotAsync(String resourceGroupName, String name, String slot, SiteAuthSettings siteAuthSettings, final ServiceCallback<SiteAuthSettings> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> listSitePublishingCredentials(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingCredentialsAsync(String resourceGroupName, String name, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> beginListSitePublishingCredentials(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginListSitePublishingCredentialsAsync(String resourceGroupName, String name, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> listSitePublishingCredentialsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingCredentialsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the User object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<User> beginListSitePublishingCredentialsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app publishing credentials.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginListSitePublishingCredentialsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<User> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> listSiteMetadata(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteMetadataAsync(String resourceGroupName, String name, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> listSiteMetadataSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app meta data.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteMetadataSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param metadata Meta data of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> updateSiteMetadata(String resourceGroupName, String name, StringDictionary metadata) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param metadata Meta data of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteMetadataAsync(String resourceGroupName, String name, StringDictionary metadata, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param metadata Meta data of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StringDictionary object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StringDictionary> updateSiteMetadataSlot(String resourceGroupName, String name, String slot, StringDictionary metadata) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param metadata Meta data of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteMetadataSlotAsync(String resourceGroupName, String name, String slot, StringDictionary metadata, final ServiceCallback<StringDictionary> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteLogsConfig> getSiteLogsConfig(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteLogsConfigAsync(String resourceGroupName, String name, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteLogsConfig Site logs configuration
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteLogsConfig> updateSiteLogsConfig(String resourceGroupName, String name, SiteLogsConfig siteLogsConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param siteLogsConfig Site logs configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteLogsConfigAsync(String resourceGroupName, String name, SiteLogsConfig siteLogsConfig, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteLogsConfig> getSiteLogsConfigSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the web app logs configuration.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteLogsConfigSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteLogsConfig Site logs configuration
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteLogsConfig object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteLogsConfig> updateSiteLogsConfigSlot(String resourceGroupName, String name, String slot, SiteLogsConfig siteLogsConfig) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the meta data for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param siteLogsConfig Site logs configuration
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteLogsConfigSlotAsync(String resourceGroupName, String name, String slot, SiteLogsConfig siteLogsConfig, final ServiceCallback<SiteLogsConfig> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> listSitePremierAddOnsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePremierAddOnsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> listSitePremierAddOns(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePremierAddOnsAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> addSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot, PremierAddOnRequest premierAddOn) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall addSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, PremierAddOnRequest premierAddOn, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSitePremierAddOnSlot(String resourceGroupName, String name, String premierAddOnName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSitePremierAddOnSlotAsync(String resourceGroupName, String name, String premierAddOnName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> addSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName, PremierAddOnRequest premierAddOn) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param premierAddOn the PremierAddOnRequest value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall addSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, PremierAddOnRequest premierAddOn, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSitePremierAddOn(String resourceGroupName, String name, String premierAddOnName) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param premierAddOnName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSitePremierAddOnAsync(String resourceGroupName, String name, String premierAddOnName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupRequest> getSiteBackupConfiguration(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupConfigurationAsync(String resourceGroupName, String name, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupRequest> getSiteBackupConfigurationSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the backup configuration for a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupConfigurationSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupRequest> updateSiteBackupConfiguration(String resourceGroupName, String name, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteBackupConfigurationAsync(String resourceGroupName, String name, BackupRequest request, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupRequest> updateSiteBackupConfigurationSlot(String resourceGroupName, String name, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates backup configuration of web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteBackupConfigurationSlotAsync(String resourceGroupName, String name, String slot, BackupRequest request, final ServiceCallback<BackupRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> backupSite(String resourceGroupName, String name, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall backupSiteAsync(String resourceGroupName, String name, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> backupSiteSlot(String resourceGroupName, String name, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates web app backup.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall backupSiteSlotAsync(String resourceGroupName, String name, String slot, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RestoreRequest> discoverSiteRestore(String resourceGroupName, String name, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall discoverSiteRestoreAsync(String resourceGroupName, String name, RestoreRequest request, final ServiceCallback<RestoreRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreRequest object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RestoreRequest> discoverSiteRestoreSlot(String resourceGroupName, String name, String slot, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Discovers existing web app backups that can be restored.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall discoverSiteRestoreSlotAsync(String resourceGroupName, String name, String slot, RestoreRequest request, final ServiceCallback<RestoreRequest> serviceCallback) throws IllegalArgumentException;

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItemCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItemCollection> listSiteBackupsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteBackupsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<BackupItemCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItemCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItemCollection> listSiteBackups(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists all available backups for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteBackupsAsync(String resourceGroupName, String name, final ServiceCallback<BackupItemCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> getSiteBackupStatus(String resourceGroupName, String name, String backupId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupStatusAsync(String resourceGroupName, String name, String backupId, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> deleteBackup(String resourceGroupName, String name, String backupId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteBackupAsync(String resourceGroupName, String name, String backupId, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> getSiteBackupStatusSlot(String resourceGroupName, String name, String backupId, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupStatusSlotAsync(String resourceGroupName, String name, String backupId, String slot, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> deleteBackupSlot(String resourceGroupName, String name, String backupId, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Deletes a backup from Azure Storage.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteBackupSlotAsync(String resourceGroupName, String name, String backupId, String slot, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> getSiteBackupStatusSecrets(String resourceGroupName, String name, String backupId, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupStatusSecretsAsync(String resourceGroupName, String name, String backupId, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the BackupItem object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<BackupItem> getSiteBackupStatusSecretsSlot(String resourceGroupName, String name, String backupId, String slot, BackupRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets status of a web app backup that may be in progress, including secrets associated with the backup, such as the Azure Storage SAS URL. Also can be used to update the SAS URL for the backup if a new URL is passed in the request body.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on backup request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteBackupStatusSecretsSlotAsync(String resourceGroupName, String name, String backupId, String slot, BackupRequest request, final ServiceCallback<BackupItem> serviceCallback) throws IllegalArgumentException;

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RestoreResponse> restoreSite(String resourceGroupName, String name, String backupId, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restoreSiteAsync(String resourceGroupName, String name, String backupId, RestoreRequest request, final ServiceCallback<RestoreResponse> serviceCallback) throws IllegalArgumentException;

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RestoreResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RestoreResponse> restoreSiteSlot(String resourceGroupName, String name, String backupId, String slot, RestoreRequest request) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restores a web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param backupId Id of backup to restore
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param request Information on restore request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restoreSiteSlotAsync(String resourceGroupName, String name, String backupId, String slot, RestoreRequest request, final ServiceCallback<RestoreResponse> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getSiteUsagesSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteUsagesSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getSiteUsagesSlot(String resourceGroupName, String name, String slot, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteUsagesSlotAsync(String resourceGroupName, String name, String slot, String filter, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getSiteUsages(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteUsagesAsync(String resourceGroupName, String name, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getSiteUsages(String resourceGroupName, String name, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the quota usage numbers for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param filter Return only usages specified in the filter. Filter is specified by using OData syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteUsagesAsync(String resourceGroupName, String name, String filter, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getSiteMetricsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getSiteMetricsSlot(String resourceGroupName, String name, String slot, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricsSlotAsync(String resourceGroupName, String name, String slot, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getSiteMetrics(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricsAsync(String resourceGroupName, String name, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getSiteMetrics(String resourceGroupName, String name, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metrics for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param details If true, metric details are included in response
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricsAsync(String resourceGroupName, String name, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitions(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricDefinitionsAsync(String resourceGroupName, String name, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinitionCollection> getSiteMetricDefinitionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets metric definitions for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteMetricDefinitionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> listSitePublishingProfileXml(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingProfileXmlAsync(String resourceGroupName, String name, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param format Name of the format. Valid values are: 
                 FileZilla3
                 WebDeploy -- default
                 Ftp
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> listSitePublishingProfileXml(String resourceGroupName, String name, String format) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param format Name of the format. Valid values are: 
                 FileZilla3
                 WebDeploy -- default
                 Ftp
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingProfileXmlAsync(String resourceGroupName, String name, String format, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> listSitePublishingProfileXmlSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingProfileXmlSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param format Name of the format. Valid values are: 
                 FileZilla3
                 WebDeploy -- default
                 Ftp
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> listSitePublishingProfileXmlSlot(String resourceGroupName, String name, String slot, String format) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the publishing profile for web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param format Name of the format. Valid values are: 
                 FileZilla3
                 WebDeploy -- default
                 Ftp
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSitePublishingProfileXmlSlotAsync(String resourceGroupName, String name, String slot, String format, final ServiceCallback<InputStream> serviceCallback) throws IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSite(String resourceGroupName, String name, Boolean softRestart, Boolean synchronous) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSiteAsync(String resourceGroupName, String name, Boolean softRestart, Boolean synchronous, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> restartSiteSlot(String resourceGroupName, String name, String slot, Boolean softRestart, Boolean synchronous) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Restarts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param softRestart Soft restart applies the configuration settings and restarts the app if necessary. Hard restart always restarts and reprovisions the app
     * @param synchronous If true then the API will block until the app has been restarted
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall restartSiteSlotAsync(String resourceGroupName, String name, String slot, Boolean softRestart, Boolean synchronous, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> startSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall startSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> startSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Starts web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall startSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> stopSite(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall stopSiteAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> stopSiteSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Stops web app.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall stopSiteSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> syncSiteRepositorySlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param slot the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall syncSiteRepositorySlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> syncSiteRepository(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     *
     * @param resourceGroupName the String value
     * @param name the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall syncSiteRepositoryAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> generateNewSitePublishingPasswordSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param slot Name of web app slot. If not specified then will default to production slot.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall generateNewSitePublishingPasswordSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> generateNewSitePublishingPassword(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Generates new random app publishing password.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall generateNewSitePublishingPasswordAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnection(String resourceGroupName, String name, String entityName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnection(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteRelayServiceConnection(String resourceGroupName, String name, String entityName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnection(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteRelayServiceConnectionAsync(String resourceGroupName, String name, String entityName, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> getSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a Biztalk Hybrid Connection identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> createOrUpdateSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Removes the association to a Biztalk Hybrid Connection, identified by its entity name.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> updateSiteRelayServiceConnectionSlot(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Creates a new association to a Biztalk Hybrid Connection, or updates an existing one.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param entityName The name by which the Hybrid Connection is identified
     * @param slot The name of the slot for the web app.
     * @param connectionEnvelope The details of the Hybrid Connection
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteRelayServiceConnectionSlotAsync(String resourceGroupName, String name, String entityName, String slot, RelayServiceConnectionEntity connectionEnvelope, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for the web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnectionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for the web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteRelayServiceConnectionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RelayServiceConnectionEntity object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RelayServiceConnectionEntity> listSiteRelayServiceConnections(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves all Biztalk Hybrid Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listSiteRelayServiceConnectionsAsync(String resourceGroupName, String name, final ServiceCallback<RelayServiceConnectionEntity> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteVnetGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVnetGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteVNETConnectionGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> updateSiteVNETConnectionGatewaySlot(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param slot The name of the slot for this web app.
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteVNETConnectionGatewaySlotAsync(String resourceGroupName, String name, String vnetName, String gatewayName, String slot, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getSiteVnetGateway(String resourceGroupName, String name, String vnetName, String gatewayName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a Virtual Network connection gateway associated with this web app and virtual network.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> createOrUpdateSiteVNETConnectionGateway(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateSiteVNETConnectionGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VnetGateway object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<VnetGateway> updateSiteVNETConnectionGateway(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Updates the Virtual Network Gateway.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param vnetName The name of the Virtual Network
     * @param gatewayName The name of the gateway. The only gateway that exists presently is "primary"
     * @param connectionEnvelope The properties to update this gateway with.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall updateSiteVNETConnectionGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName, VnetGateway connectionEnvelope, final ServiceCallback<VnetGateway> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetInfo&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VnetInfo>> getSiteVNETConnections(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVNETConnectionsAsync(String resourceGroupName, String name, final ServiceCallback<List<VnetInfo>> serviceCallback) throws IllegalArgumentException;

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for this web app.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VnetInfo&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<VnetInfo>> getSiteVNETConnectionsSlot(String resourceGroupName, String name, String slot) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Retrieves a list of all Virtual Network Connections associated with this web app.
     *
     * @param resourceGroupName The resource group name
     * @param name The name of the web app
     * @param slot The name of the slot for this web app.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSiteVNETConnectionsSlotAsync(String resourceGroupName, String name, String slot, final ServiceCallback<List<VnetInfo>> serviceCallback) throws IllegalArgumentException;

}
