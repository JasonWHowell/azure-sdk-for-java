/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.GenericResource;
import com.microsoft.azure.management.resources.models.GenericResourceFilter;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.ResourceGroup;
import com.microsoft.azure.management.resources.models.ResourceGroupFilter;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceGroupsOperations.
 */
public interface ResourceGroupsOperations {
    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;GenericResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<GenericResource>> listResources(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listResourcesAsync(final String resourceGroupName, final ListOperationCallback<GenericResource> serviceCallback) throws IllegalArgumentException;
    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;GenericResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<GenericResource>> listResources(final String resourceGroupName, final GenericResourceFilter filter, final Integer top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listResourcesAsync(final String resourceGroupName, final GenericResourceFilter filter, final Integer top, final ListOperationCallback<GenericResource> serviceCallback) throws IllegalArgumentException;

    /**
     * Checks whether resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> checkExistence(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Checks whether resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall checkExistenceAsync(String resourceGroupName, final ServiceCallback<Boolean> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a resource group.
     *
     * @param resourceGroupName The name of the resource group to be created or updated.
     * @param parameters Parameters supplied to the create or update resource group service operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceGroup> createOrUpdate(String resourceGroupName, ResourceGroup parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a resource group.
     *
     * @param resourceGroupName The name of the resource group to be created or updated.
     * @param parameters Parameters supplied to the create or update resource group service operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, ResourceGroup parameters, final ServiceCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceGroup> get(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, final ServiceCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource groups, though if a field is unspecified current value will be carried over.
     *
     * @param resourceGroupName The name of the resource group to be created or updated. The name is case insensitive.
     * @param parameters Parameters supplied to the update state resource group service operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceGroup> patch(String resourceGroupName, ResourceGroup parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource groups, though if a field is unspecified current value will be carried over.
     *
     * @param resourceGroupName The name of the resource group to be created or updated. The name is case insensitive.
     * @param parameters Parameters supplied to the update state resource group service operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall patchAsync(String resourceGroupName, ResourceGroup parameters, final ServiceCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ResourceGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ResourceGroup>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a collection of resource groups.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ResourceGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<ResourceGroup>> list(final ResourceGroupFilter filter, final Integer top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ResourceGroupFilter filter, final Integer top, final ListOperationCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;GenericResource&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<GenericResource>> listResourcesNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listResourcesNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<GenericResource> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;ResourceGroup&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<ResourceGroup>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<ResourceGroup> serviceCallback) throws IllegalArgumentException;

}
