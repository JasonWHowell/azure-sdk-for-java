/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.Location;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.Subscription;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in SubscriptionsOperations.
 */
public interface SubscriptionsOperations {
    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Location&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Location>> listLocations(final String subscriptionId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of the subscription locations.
     *
     * @param subscriptionId Id of the subscription
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listLocationsAsync(final String subscriptionId, final ListOperationCallback<Location> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Subscription object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Subscription> get(String subscriptionId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets details about particular subscription.
     *
     * @param subscriptionId Id of the subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String subscriptionId, final ServiceCallback<Subscription> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of the subscriptionIds.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subscription&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Subscription>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<Subscription> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Location&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Location>> listLocationsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of the subscription locations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listLocationsNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Location> serviceCallback) throws IllegalArgumentException;

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subscription&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Subscription>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of the subscriptionIds.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Subscription> serviceCallback) throws IllegalArgumentException;

}
