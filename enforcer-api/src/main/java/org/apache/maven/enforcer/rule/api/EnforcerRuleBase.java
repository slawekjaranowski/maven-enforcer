/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.enforcer.rule.api;

/**
 * Base interface for old and new API.
 * <p>
 * Used for internal purpose.
 *
 * @author Slawomir Jaranowski
 * @since 3.2.1
 */
public interface EnforcerRuleBase {

    /**
     * Current Enforcer execution level
     *
     * @return an Enforcer execution level
     */
    default EnforcerLevel getLevel() {
        return EnforcerLevel.ERROR;
    }

    /**
     * Used by {@code EnforcerMojo} to inject logger instance
     *
     * @param log an {@link EnforcerLogger} instance
     */
    default void setLog(EnforcerLogger log) {}

    /**
     * Rule name for current rule instance.
     *
     * @return a rule name.
     * @since 3.6.0
     */
    default String getRuleName() {
        return null;
    }
}
