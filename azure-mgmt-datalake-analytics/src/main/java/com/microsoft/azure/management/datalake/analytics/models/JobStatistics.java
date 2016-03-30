/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics U-SQL job execution statistics.
 */
public class JobStatistics {
    /**
     * Gets the last update time for the statistics.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdateTimeUtc;

    /**
     * Gets the list of stages for the job.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<JobStatisticsVertexStage> stages;

    /**
     * Get the lastUpdateTimeUtc value.
     *
     * @return the lastUpdateTimeUtc value
     */
    public DateTime getLastUpdateTimeUtc() {
        return this.lastUpdateTimeUtc;
    }

    /**
     * Get the stages value.
     *
     * @return the stages value
     */
    public List<JobStatisticsVertexStage> getStages() {
        return this.stages;
    }

}
