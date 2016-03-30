/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.PolicyAssignment;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyAssignmentsOperations.
 */
public interface PolicyAssignmentsOperations {
    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForResource(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForResource(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName, final String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceProviderNamespace The name of the resource provider.
     * @param parentResourcePath The parent resource path.
     * @param resourceType The resource type.
     * @param resourceName The resource name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName, final String filter, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForResourceGroup(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceGroupAsync(final String resourceGroupName, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForResourceGroup(final String resourceGroupName, final String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param resourceGroupName Resource group name.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceGroupAsync(final String resourceGroupName, final String filter, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> delete(String scope, String policyAssignmentName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String scope, String policyAssignmentName, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param parameters Policy assignment.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> create(String scope, String policyAssignmentName, PolicyAssignment parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param parameters Policy assignment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createAsync(String scope, String policyAssignmentName, PolicyAssignment parameters, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Get single policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> get(String scope, String policyAssignmentName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get single policy assignment.
     *
     * @param scope Scope.
     * @param policyAssignmentName Policy assignment name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String scope, String policyAssignmentName, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> deleteById(String policyAssignmentId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteByIdAsync(String policyAssignmentId, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create policy assignment by Id.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param parameters Policy assignment.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> createById(String policyAssignmentId, PolicyAssignment parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create policy assignment by Id.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param parameters Policy assignment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createByIdAsync(String policyAssignmentId, PolicyAssignment parameters, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Get single policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PolicyAssignment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PolicyAssignment> getById(String policyAssignmentId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get single policy assignment.
     *
     * @param policyAssignmentId Policy assignment Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getByIdAsync(String policyAssignmentId, final ServiceCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets policy assignments of the subscription.
     *
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> list(final String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String filter, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForScope(final String scope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForScopeAsync(final String scope, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @param filter The filter to apply on the operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<PolicyAssignment>> listForScope(final String scope, final String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param scope Scope.
     * @param filter The filter to apply on the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForScopeAsync(final String scope, final String filter, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResourceNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForResourceGroupNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForResourceGroupNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;PolicyAssignment&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<PolicyAssignment>> listForScopeNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets policy assignments of the scope.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listForScopeNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<PolicyAssignment> serviceCallback) throws IllegalArgumentException;

}
