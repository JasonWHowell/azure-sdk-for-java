/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.website.models.Recommendation;
import com.microsoft.azure.management.website.models.RecommendationRule;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined
 * in RecommendationsOperations.
 */
public interface RecommendationsOperations {
    /**
     * Gets a list of recommendations associated with the specified subscription.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendationBySubscription() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of recommendations associated with the specified subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendationBySubscriptionAsync(final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a list of recommendations associated with the specified subscription.
     *
     * @param featured If set, this API returns only the most critical recommendation among the others. Otherwise this API returns all recommendations available
     * @param filter Return only channels specified in the filter. Filter is specified by using OData syntax. Example: $filter=channels eq 'Api' or channel eq 'Notification'
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendationBySubscription(Boolean featured, String filter) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of recommendations associated with the specified subscription.
     *
     * @param featured If set, this API returns only the most critical recommendation among the others. Otherwise this API returns all recommendations available
     * @param filter Return only channels specified in the filter. Filter is specified by using OData syntax. Example: $filter=channels eq 'Api' or channel eq 'Notification'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendationBySubscriptionAsync(Boolean featured, String filter, final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the detailed properties of the recommendation object for the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param name Recommendation rule name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the RecommendationRule object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<RecommendationRule> getRuleDetailsBySiteName(String resourceGroupName, String siteName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the detailed properties of the recommendation object for the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param name Recommendation rule name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRuleDetailsBySiteNameAsync(String resourceGroupName, String siteName, String name, final ServiceCallback<RecommendationRule> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of recommendations associated with the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendedRulesForSite(String resourceGroupName, String siteName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of recommendations associated with the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendedRulesForSiteAsync(String resourceGroupName, String siteName, final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets a list of recommendations associated with the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param featured If set, this API returns only the most critical recommendation among the others. Otherwise this API returns all recommendations available
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendedRulesForSite(String resourceGroupName, String siteName, Boolean featured) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of recommendations associated with the specified web site.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param featured If set, this API returns only the most critical recommendation among the others. Otherwise this API returns all recommendations available
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendedRulesForSiteAsync(String resourceGroupName, String siteName, Boolean featured, final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets the list of past recommendations optionally specified by the time range.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendationHistoryForSite(String resourceGroupName, String siteName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of past recommendations optionally specified by the time range.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendationHistoryForSiteAsync(String resourceGroupName, String siteName, final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;
    /**
     * Gets the list of past recommendations optionally specified by the time range.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param startTime The start time of a time range to query, e.g. $filter=startTime eq '2015-01-01T00:00:00Z' and endTime eq '2015-01-02T00:00:00Z'
     * @param endTime The end time of a time range to query, e.g. $filter=startTime eq '2015-01-01T00:00:00Z' and endTime eq '2015-01-02T00:00:00Z'
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Recommendation&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<List<Recommendation>> getRecommendationHistoryForSite(String resourceGroupName, String siteName, String startTime, String endTime) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets the list of past recommendations optionally specified by the time range.
     *
     * @param resourceGroupName Resource group name
     * @param siteName Site name
     * @param startTime The start time of a time range to query, e.g. $filter=startTime eq '2015-01-01T00:00:00Z' and endTime eq '2015-01-02T00:00:00Z'
     * @param endTime The end time of a time range to query, e.g. $filter=startTime eq '2015-01-01T00:00:00Z' and endTime eq '2015-01-02T00:00:00Z'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getRecommendationHistoryForSiteAsync(String resourceGroupName, String siteName, String startTime, String endTime, final ServiceCallback<List<Recommendation>> serviceCallback) throws IllegalArgumentException;

}
