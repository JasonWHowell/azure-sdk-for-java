/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.AddressResponse;
import com.microsoft.azure.management.website.models.CsmUsageQuotaCollection;
import com.microsoft.azure.management.website.models.HostingEnvironment;
import com.microsoft.azure.management.website.models.HostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.HostingEnvironmentDiagnostics;
import com.microsoft.azure.management.website.models.MetricDefinition;
import com.microsoft.azure.management.website.models.MetricDefinitionCollection;
import com.microsoft.azure.management.website.models.ResourceMetricCollection;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.azure.management.website.models.SkuInfoCollection;
import com.microsoft.azure.management.website.models.StampCapacityCollection;
import com.microsoft.azure.management.website.models.UsageCollection;
import com.microsoft.azure.management.website.models.WorkerPool;
import com.microsoft.azure.management.website.models.WorkerPoolCollection;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in HostingEnvironmentsOperations.
 */
public interface HostingEnvironmentsOperations {
    /**
     * Get properties of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironment> getHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get properties of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<HostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param hostingEnvironmentEnvelope Properties of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the HostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironment> createOrUpdateHostingEnvironment(String resourceGroupName, String name, HostingEnvironment hostingEnvironmentEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create or update a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param hostingEnvironmentEnvelope Properties of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateHostingEnvironmentAsync(String resourceGroupName, String name, HostingEnvironment hostingEnvironmentEnvelope, final ServiceCallback<HostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param hostingEnvironmentEnvelope Properties of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironment object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironment> beginCreateOrUpdateHostingEnvironment(String resourceGroupName, String name, HostingEnvironment hostingEnvironmentEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param hostingEnvironmentEnvelope Properties of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateHostingEnvironmentAsync(String resourceGroupName, String name, HostingEnvironment hostingEnvironmentEnvelope, final ServiceCallback<HostingEnvironment> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param forceDelete Delete even if the hostingEnvironment (App Service Environment) contains resources
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> deleteHostingEnvironment(String resourceGroupName, String name, Boolean forceDelete) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param forceDelete Delete even if the hostingEnvironment (App Service Environment) contains resources
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteHostingEnvironmentAsync(String resourceGroupName, String name, Boolean forceDelete, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> beginDeleteHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param forceDelete Delete even if the hostingEnvironment (App Service Environment) contains resources
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> beginDeleteHostingEnvironment(String resourceGroupName, String name, Boolean forceDelete) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param forceDelete Delete even if the hostingEnvironment (App Service Environment) contains resources
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteHostingEnvironmentAsync(String resourceGroupName, String name, Boolean forceDelete, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get diagnostic information for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;HostingEnvironmentDiagnostics&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<HostingEnvironmentDiagnostics>> getHostingEnvironmentDiagnostics(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get diagnostic information for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentDiagnosticsAsync(String resourceGroupName, String name, final ServiceCallback<List<HostingEnvironmentDiagnostics>> serviceCallback) throws IllegalArgumentException;

    /**
     * Get diagnostic information for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param diagnosticsName Name of the diagnostics
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentDiagnostics object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironmentDiagnostics> getHostingEnvironmentDiagnosticsItem(String resourceGroupName, String name, String diagnosticsName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get diagnostic information for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param diagnosticsName Name of the diagnostics
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentDiagnosticsItemAsync(String resourceGroupName, String name, String diagnosticsName, final ServiceCallback<HostingEnvironmentDiagnostics> serviceCallback) throws IllegalArgumentException;

    /**
     * Get used, available, and total worker capacity for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the StampCapacityCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<StampCapacityCollection> getHostingEnvironmentCapacities(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get used, available, and total worker capacity for hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentCapacitiesAsync(String resourceGroupName, String name, final ServiceCallback<StampCapacityCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get IP addresses assigned to the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the AddressResponse object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<AddressResponse> getHostingEnvironmentVips(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get IP addresses assigned to the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentVipsAsync(String resourceGroupName, String name, final ServiceCallback<AddressResponse> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all hostingEnvironments (App Service Environments) in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<HostingEnvironmentCollection> getHostingEnvironments(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all hostingEnvironments (App Service Environments) in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentsAsync(String resourceGroupName, final ServiceCallback<HostingEnvironmentCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Reboots all machines in a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> rebootHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Reboots all machines in a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall rebootHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * List all currently running operations on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getHostingEnvironmentOperations(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * List all currently running operations on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentOperationsAsync(String resourceGroupName, String name, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get status of an operation on a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param operationId operation identifier GUID
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getHostingEnvironmentOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get status of an operation on a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param operationId operation identifier GUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get global metrics of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentMetrics(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get global metrics of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMetricsAsync(String resourceGroupName, String name, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Get global metrics of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentMetrics(String resourceGroupName, String name, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get global metrics of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMetricsAsync(String resourceGroupName, String name, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get global metric definitions of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinition object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinition> getHostingEnvironmentMetricDefinitions(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get global metric definitions of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMetricDefinitionsAsync(String resourceGroupName, String name, final ServiceCallback<MetricDefinition> serviceCallback) throws IllegalArgumentException;

    /**
     * Get global usages of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getHostingEnvironmentUsages(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get global usages of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentUsagesAsync(String resourceGroupName, String name, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Get global usages of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the CsmUsageQuotaCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<CsmUsageQuotaCollection> getHostingEnvironmentUsages(String resourceGroupName, String name, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get global usages of hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentUsagesAsync(String resourceGroupName, String name, String filter, final ServiceCallback<CsmUsageQuotaCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metrics for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentMultiRoleMetrics(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMultiRoleMetricsAsync(String resourceGroupName, String name, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Get metrics for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param startTime Beginning time of metrics query
     * @param endTime End time of metrics query
     * @param timeGrain Time granularity of metrics query
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentMultiRoleMetrics(String resourceGroupName, String name, String startTime, String endTime, String timeGrain, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param startTime Beginning time of metrics query
     * @param endTime End time of metrics query
     * @param timeGrain Time granularity of metrics query
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMultiRoleMetricsAsync(String resourceGroupName, String name, String startTime, String endTime, String timeGrain, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metrics for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentWebWorkerMetrics(String resourceGroupName, String name, String workerPoolName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentWebWorkerMetricsAsync(String resourceGroupName, String name, String workerPoolName, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Get metrics for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceMetricCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ResourceMetricCollection> getHostingEnvironmentWebWorkerMetrics(String resourceGroupName, String name, String workerPoolName, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentWebWorkerMetricsAsync(String resourceGroupName, String name, String workerPoolName, Boolean details, String filter, final ServiceCallback<ResourceMetricCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metric definitions for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinitionCollection> getHostingEnvironmentMultiRoleMetricDefinitions(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metric definitions for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMultiRoleMetricDefinitionsAsync(String resourceGroupName, String name, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metric definitions for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the MetricDefinitionCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<MetricDefinitionCollection> getHostingEnvironmentWebWorkerMetricDefinitions(String resourceGroupName, String name, String workerPoolName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metric definitions for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentWebWorkerMetricDefinitionsAsync(String resourceGroupName, String name, String workerPoolName, final ServiceCallback<MetricDefinitionCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get usages for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the UsageCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<UsageCollection> getHostingEnvironmentMultiRoleUsages(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get usages for a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentMultiRoleUsagesAsync(String resourceGroupName, String name, final ServiceCallback<UsageCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get usages for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the UsageCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<UsageCollection> getHostingEnvironmentWebWorkerUsages(String resourceGroupName, String name, String workerPoolName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get usages for a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentWebWorkerUsagesAsync(String resourceGroupName, String name, String workerPoolName, final ServiceCallback<UsageCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all sites on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getHostingEnvironmentSites(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all sites on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentSitesAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;
    /**
     * Get all sites on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param propertiesToInclude Comma separated list of site properties to include
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> getHostingEnvironmentSites(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all sites on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param propertiesToInclude Comma separated list of site properties to include
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentSitesAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getHostingEnvironmentServerFarms(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentServerFarmsAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<ServerFarmCollection> getHostingEnvironmentWebHostingPlans(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getHostingEnvironmentWebHostingPlansAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all multi role pools.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPoolCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPoolCollection> getMultiRolePools(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all multi role pools.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolsAsync(String resourceGroupName, String name, final ServiceCallback<WorkerPoolCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get properties of a multiRool pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> getMultiRolePool(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get properties of a multiRool pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolAsync(String resourceGroupName, String name, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param multiRolePoolEnvelope Properties of multiRole pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> createOrUpdateMultiRolePool(String resourceGroupName, String name, WorkerPool multiRolePoolEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create or update a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param multiRolePoolEnvelope Properties of multiRole pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPool multiRolePoolEnvelope, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param multiRolePoolEnvelope Properties of multiRole pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> beginCreateOrUpdateMultiRolePool(String resourceGroupName, String name, WorkerPool multiRolePoolEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param multiRolePoolEnvelope Properties of multiRole pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPool multiRolePoolEnvelope, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Get available skus for scaling a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SkuInfoCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SkuInfoCollection> getMultiRolePoolSkus(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get available skus for scaling a multiRole pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolSkusAsync(String resourceGroupName, String name, final ServiceCallback<SkuInfoCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get all worker pools.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPoolCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPoolCollection> getWorkerPools(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all worker pools.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolsAsync(String resourceGroupName, String name, final ServiceCallback<WorkerPoolCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get properties of a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> getWorkerPool(String resourceGroupName, String name, String workerPoolName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get properties of a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolAsync(String resourceGroupName, String name, String workerPoolName, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param workerPoolEnvelope Properties of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> createOrUpdateWorkerPool(String resourceGroupName, String name, String workerPoolName, WorkerPool workerPoolEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create or update a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param workerPoolEnvelope Properties of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateWorkerPoolAsync(String resourceGroupName, String name, String workerPoolName, WorkerPool workerPoolEnvelope, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Create or update a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param workerPoolEnvelope Properties of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the WorkerPool object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<WorkerPool> beginCreateOrUpdateWorkerPool(String resourceGroupName, String name, String workerPoolName, WorkerPool workerPoolEnvelope) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create or update a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param workerPoolEnvelope Properties of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateWorkerPoolAsync(String resourceGroupName, String name, String workerPoolName, WorkerPool workerPoolEnvelope, final ServiceCallback<WorkerPool> serviceCallback) throws IllegalArgumentException;

    /**
     * Get available skus for scaling a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SkuInfoCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SkuInfoCollection> getWorkerPoolSkus(String resourceGroupName, String name, String workerPoolName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get available skus for scaling a worker pool.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolSkusAsync(String resourceGroupName, String name, String workerPoolName, final ServiceCallback<SkuInfoCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getWorkerPoolInstanceMetrics(String resourceGroupName, String name, String workerPoolName, String instance) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolInstanceMetricsAsync(String resourceGroupName, String name, String workerPoolName, String instance, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Get metrics for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getWorkerPoolInstanceMetrics(String resourceGroupName, String name, String workerPoolName, String instance, Boolean details, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @param details Include instance details
     * @param filter Return only usages/metrics specified in the filter. Filter conforms to odata syntax. Example: $filter=(name.value eq 'Metric1' or name.value eq 'Metric2') and startTime eq '2014-01-01T00:00:00Z' and endTime eq '2014-12-31T23:59:59Z' and timeGrain eq duration'[Hour|Minute|Day]'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolInstanceMetricsAsync(String resourceGroupName, String name, String workerPoolName, String instance, Boolean details, String filter, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metric definitions for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getWorkerPoolInstanceMetricDefinitions(String resourceGroupName, String name, String workerPoolName, String instance) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metric definitions for a specific instance of a worker pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param workerPoolName Name of worker pool
     * @param instance Name of instance in the worker pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getWorkerPoolInstanceMetricDefinitionsAsync(String resourceGroupName, String name, String workerPoolName, String instance, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getMultiRolePoolInstanceMetrics(String resourceGroupName, String name, String instance) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolInstanceMetricsAsync(String resourceGroupName, String name, String instance, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;
    /**
     * Get metrics for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool
     * @param details Include instance details
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getMultiRolePoolInstanceMetrics(String resourceGroupName, String name, String instance, Boolean details) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metrics for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool
     * @param details Include instance details
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolInstanceMetricsAsync(String resourceGroupName, String name, String instance, Boolean details, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Get metric definitions for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool&amp;gt;
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Object> getMultiRolePoolInstanceMetricDefinitions(String resourceGroupName, String name, String instance) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get metric definitions for a specific instance of a multiRole pool of a hostingEnvironment (App Service Environment).
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param instance Name of instance in the multiRole pool&amp;gt;
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMultiRolePoolInstanceMetricDefinitionsAsync(String resourceGroupName, String name, String instance, final ServiceCallback<Object> serviceCallback) throws IllegalArgumentException;

    /**
     * Suspends the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> suspendHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Suspends the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall suspendHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Suspends the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> beginSuspendHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Suspends the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginSuspendHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Resumes the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> resumeHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Resumes the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall resumeHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

    /**
     * Resumes the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<SiteCollection> beginResumeHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Resumes the hostingEnvironment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of hostingEnvironment (App Service Environment)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginResumeHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<SiteCollection> serviceCallback) throws IllegalArgumentException;

}
