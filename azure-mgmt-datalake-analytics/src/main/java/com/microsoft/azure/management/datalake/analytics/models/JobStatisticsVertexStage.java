/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics U-SQL job statistics vertex stage information.
 */
public class JobStatisticsVertexStage {
    /**
     * Gets the amount of data read, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long dataRead;

    /**
     * Gets the amount of data read across multiple pods, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long dataReadCrossPod;

    /**
     * Gets the amount of data read in one pod, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long dataReadIntraPod;

    /**
     * Gets the amount of data remaining to be read, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long dataToRead;

    /**
     * Gets the amount of data written, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long dataWritten;

    /**
     * Gets the number of duplicates that were discarded.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer duplicateDiscardCount;

    /**
     * Gets the number of failures that occured in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedCount;

    /**
     * Gets the maximum amount of data read in a single vertex, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long maxVertexDataRead;

    /**
     * Gets the minimum amount of data read in a single vertex, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long minVertexDataRead;

    /**
     * Gets the number of read failures in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer readFailureCount;

    /**
     * Gets the number of vertices that were revoked during this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer revocationCount;

    /**
     * Gets the number of currently running vertices in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer runningCount;

    /**
     * Gets the number of currently scheduled vertices in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer scheduledCount;

    /**
     * Gets the name of this stage in job execution.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String stageName;

    /**
     * Gets the number of vertices that succeeded in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer succeededCount;

    /**
     * Gets the amount of temporary data written, in bytes.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long tempDataWritten;

    /**
     * Gets the total vertex count for this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalCount;

    /**
     * Gets the amount of time that failed vertices took up in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String totalFailedTime;

    /**
     * Gets the current progress of this stage, as a percentage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalProgress;

    /**
     * Gets the amount of time all successful vertices took in this stage.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String totalSucceededTime;

    /**
     * Get the dataRead value.
     *
     * @return the dataRead value
     */
    public Long getDataRead() {
        return this.dataRead;
    }

    /**
     * Get the dataReadCrossPod value.
     *
     * @return the dataReadCrossPod value
     */
    public Long getDataReadCrossPod() {
        return this.dataReadCrossPod;
    }

    /**
     * Get the dataReadIntraPod value.
     *
     * @return the dataReadIntraPod value
     */
    public Long getDataReadIntraPod() {
        return this.dataReadIntraPod;
    }

    /**
     * Get the dataToRead value.
     *
     * @return the dataToRead value
     */
    public Long getDataToRead() {
        return this.dataToRead;
    }

    /**
     * Get the dataWritten value.
     *
     * @return the dataWritten value
     */
    public Long getDataWritten() {
        return this.dataWritten;
    }

    /**
     * Get the duplicateDiscardCount value.
     *
     * @return the duplicateDiscardCount value
     */
    public Integer getDuplicateDiscardCount() {
        return this.duplicateDiscardCount;
    }

    /**
     * Get the failedCount value.
     *
     * @return the failedCount value
     */
    public Integer getFailedCount() {
        return this.failedCount;
    }

    /**
     * Get the maxVertexDataRead value.
     *
     * @return the maxVertexDataRead value
     */
    public Long getMaxVertexDataRead() {
        return this.maxVertexDataRead;
    }

    /**
     * Get the minVertexDataRead value.
     *
     * @return the minVertexDataRead value
     */
    public Long getMinVertexDataRead() {
        return this.minVertexDataRead;
    }

    /**
     * Get the readFailureCount value.
     *
     * @return the readFailureCount value
     */
    public Integer getReadFailureCount() {
        return this.readFailureCount;
    }

    /**
     * Get the revocationCount value.
     *
     * @return the revocationCount value
     */
    public Integer getRevocationCount() {
        return this.revocationCount;
    }

    /**
     * Get the runningCount value.
     *
     * @return the runningCount value
     */
    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * Get the scheduledCount value.
     *
     * @return the scheduledCount value
     */
    public Integer getScheduledCount() {
        return this.scheduledCount;
    }

    /**
     * Get the stageName value.
     *
     * @return the stageName value
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * Get the succeededCount value.
     *
     * @return the succeededCount value
     */
    public Integer getSucceededCount() {
        return this.succeededCount;
    }

    /**
     * Get the tempDataWritten value.
     *
     * @return the tempDataWritten value
     */
    public Long getTempDataWritten() {
        return this.tempDataWritten;
    }

    /**
     * Get the totalCount value.
     *
     * @return the totalCount value
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * Get the totalFailedTime value.
     *
     * @return the totalFailedTime value
     */
    public String getTotalFailedTime() {
        return this.totalFailedTime;
    }

    /**
     * Get the totalProgress value.
     *
     * @return the totalProgress value
     */
    public Integer getTotalProgress() {
        return this.totalProgress;
    }

    /**
     * Get the totalSucceededTime value.
     *
     * @return the totalSucceededTime value
     */
    public String getTotalSucceededTime() {
        return this.totalSucceededTime;
    }

}
