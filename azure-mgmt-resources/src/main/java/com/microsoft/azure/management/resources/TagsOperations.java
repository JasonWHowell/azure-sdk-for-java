/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.TagDetails;
import com.microsoft.azure.management.resources.models.TagValue;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in TagsOperations.
 */
public interface TagsOperations {
    /**
     * Delete a subscription resource tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> deleteValue(String tagName, String tagValue) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a subscription resource tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteValueAsync(String tagName, String tagValue, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a subscription resource tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TagValue object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<TagValue> createOrUpdateValue(String tagName, String tagValue) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a subscription resource tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateValueAsync(String tagName, String tagValue, final ServiceCallback<TagValue> serviceCallback) throws IllegalArgumentException;

    /**
     * Create a subscription resource tag.
     *
     * @param tagName The name of the tag.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TagDetails object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<TagDetails> createOrUpdate(String tagName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a subscription resource tag.
     *
     * @param tagName The name of the tag.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String tagName, final ServiceCallback<TagDetails> serviceCallback) throws IllegalArgumentException;

    /**
     * Delete a subscription resource tag.
     *
     * @param tagName The name of the tag.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String tagName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Delete a subscription resource tag.
     *
     * @param tagName The name of the tag.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String tagName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * Get a list of subscription resource tags.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;TagDetails&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<TagDetails>> list() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a list of subscription resource tags.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final ListOperationCallback<TagDetails> serviceCallback) throws IllegalArgumentException;

    /**
     * Get a list of subscription resource tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;TagDetails&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<TagDetails>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a list of subscription resource tags.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<TagDetails> serviceCallback) throws IllegalArgumentException;

}
