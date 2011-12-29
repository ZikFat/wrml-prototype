/**
 * Copyright (C) 2011 WRML.org <mark@wrml.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wrml.model;

/**
 * A single "node" in a REST API's path-based Web resource model's hierarchical
 * usage.
 * 
 * Note: This is a metadata class - instances should be edited with tools and
 * persisted for reuse.
 */
// Generated from a Web Resource Schema
public interface ResourceTemplate extends Versioned, Descriptive,
        TreeNode<Api, ResourceTemplate, ResourceTemplate>, Document {

    public String getPathSegment();

    public ResourceArchetype getResourceArchetype();

    public String setPathSegment(String pathSegment);

    public ResourceArchetype setResourceArchetype(ResourceArchetype resourceArchetype);

    // TODO: The (half-baked) idea here was to allow resource tree nodes to override model defaults...
    // public ObservableMap<URI, ObservableList<RuntimePrototypeField>> getSchemaFieldDefaultsMap();

}