/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import java.util.List;
import java.util.UUID;

/**
 * A Data Lake Analytics catalog U-SQL table index item.
 */
public class USqlIndex {
    /**
     * Gets or sets the name of the index in the table.
     */
    private String name;

    /**
     * Gets or sets the list of directed columns in the index.
     */
    private List<USqlDirectedColumn> indexKeys;

    /**
     * Gets or sets the list of columns in the index.
     */
    private List<String> columns;

    /**
     * Gets or sets the distributions info of the index.
     */
    private USqlDistributionInfo distributionInfo;

    /**
     * Gets or sets partition function ID for the index.
     */
    private UUID partitionFunction;

    /**
     * Gets or sets the list of partion keys in the index.
     */
    private List<String> partitionKeyList;

    /**
     * Gets or sets the list of full paths to the streams that contain this
     * index in the DataLake account.
     */
    private List<String> streamNames;

    /**
     * Gets or sets the switch indicating if this index is a columnstore index.
     */
    private Boolean isColumnstore;

    /**
     * Gets or sets the ID of this index within the table.
     */
    private Integer indexId;

    /**
     * Gets or sets the switch indicating if this index is a unique index.
     */
    private Boolean isUnique;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the indexKeys value.
     *
     * @return the indexKeys value
     */
    public List<USqlDirectedColumn> getIndexKeys() {
        return this.indexKeys;
    }

    /**
     * Set the indexKeys value.
     *
     * @param indexKeys the indexKeys value to set
     */
    public void setIndexKeys(List<USqlDirectedColumn> indexKeys) {
        this.indexKeys = indexKeys;
    }

    /**
     * Get the columns value.
     *
     * @return the columns value
     */
    public List<String> getColumns() {
        return this.columns;
    }

    /**
     * Set the columns value.
     *
     * @param columns the columns value to set
     */
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    /**
     * Get the distributionInfo value.
     *
     * @return the distributionInfo value
     */
    public USqlDistributionInfo getDistributionInfo() {
        return this.distributionInfo;
    }

    /**
     * Set the distributionInfo value.
     *
     * @param distributionInfo the distributionInfo value to set
     */
    public void setDistributionInfo(USqlDistributionInfo distributionInfo) {
        this.distributionInfo = distributionInfo;
    }

    /**
     * Get the partitionFunction value.
     *
     * @return the partitionFunction value
     */
    public UUID getPartitionFunction() {
        return this.partitionFunction;
    }

    /**
     * Set the partitionFunction value.
     *
     * @param partitionFunction the partitionFunction value to set
     */
    public void setPartitionFunction(UUID partitionFunction) {
        this.partitionFunction = partitionFunction;
    }

    /**
     * Get the partitionKeyList value.
     *
     * @return the partitionKeyList value
     */
    public List<String> getPartitionKeyList() {
        return this.partitionKeyList;
    }

    /**
     * Set the partitionKeyList value.
     *
     * @param partitionKeyList the partitionKeyList value to set
     */
    public void setPartitionKeyList(List<String> partitionKeyList) {
        this.partitionKeyList = partitionKeyList;
    }

    /**
     * Get the streamNames value.
     *
     * @return the streamNames value
     */
    public List<String> getStreamNames() {
        return this.streamNames;
    }

    /**
     * Set the streamNames value.
     *
     * @param streamNames the streamNames value to set
     */
    public void setStreamNames(List<String> streamNames) {
        this.streamNames = streamNames;
    }

    /**
     * Get the isColumnstore value.
     *
     * @return the isColumnstore value
     */
    public Boolean getIsColumnstore() {
        return this.isColumnstore;
    }

    /**
     * Set the isColumnstore value.
     *
     * @param isColumnstore the isColumnstore value to set
     */
    public void setIsColumnstore(Boolean isColumnstore) {
        this.isColumnstore = isColumnstore;
    }

    /**
     * Get the indexId value.
     *
     * @return the indexId value
     */
    public Integer getIndexId() {
        return this.indexId;
    }

    /**
     * Set the indexId value.
     *
     * @param indexId the indexId value to set
     */
    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    /**
     * Get the isUnique value.
     *
     * @return the isUnique value
     */
    public Boolean getIsUnique() {
        return this.isUnique;
    }

    /**
     * Set the isUnique value.
     *
     * @param isUnique the isUnique value to set
     */
    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

}
