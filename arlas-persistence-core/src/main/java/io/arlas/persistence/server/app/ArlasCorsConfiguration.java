/*
 * Licensed to Gisaïa under one or more contributor
 * license agreements. See the NOTICE.txt file distributed with
 * this work for additional information regarding copyright
 * ownership. Gisaïa licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.arlas.persistence.server.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;


public class ArlasCorsConfiguration {
    @JsonProperty("allowed_origins")
    public String allowedOrigins;
    @JsonProperty("allowed_headers")
    public String allowedHeaders;
    @JsonProperty("allowed_methods")
    public String allowedMethods;
    @JsonProperty("allowed_credentials")
    public boolean allowedCredentials;
    @JsonProperty("exposed_headers")
    public String exposedHeaders;
}
