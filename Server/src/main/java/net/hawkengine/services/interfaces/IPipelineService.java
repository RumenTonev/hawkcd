/*
 * Copyright (C) 2016 R&D Solutions Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.hawkengine.services.interfaces;

import net.hawkengine.model.Pipeline;
import net.hawkengine.model.ServiceResult;

public interface IPipelineService extends ICrudService<Pipeline> {
    ServiceResult getAllByDefinitionId(String pipelineDefinitionId);

    ServiceResult getAllNonupdatedPipelines();

    ServiceResult getAllUpdatedUnpreparedPipelinesInProgress();

    ServiceResult getAllPreparedPipelinesInProgress();

    ServiceResult getAllPreparedAwaitingPipelines();

    ServiceResult getLastRun(String pipelineDefinitionId);

    ServiceResult getAllPipelineHistoryDTOs(String pipelineDefinitionId, Integer numberOfPipelines);

    ServiceResult getAllPipelineHistoryDTOs(String pipelineDefinitionId, Integer numberOfPipelines, String pipelineId);

    ServiceResult getPipelineArtifactDTOs(String searchCriteria, Integer numberOfPipelines);

    ServiceResult getPipelineArtifactDTOs(String searchCriteria, Integer numberOfPipelines, String pipelineId);

    ServiceResult cancelPipeline(String pipelineId);

    ServiceResult pausePipeline(String pipelineId);
}
