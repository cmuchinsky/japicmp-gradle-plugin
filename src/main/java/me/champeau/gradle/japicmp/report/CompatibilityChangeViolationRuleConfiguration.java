/*
 * Copyright 2003-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.champeau.gradle.japicmp.report;

import japicmp.model.JApiCompatibilityChangeType;

import java.util.Map;

public class CompatibilityChangeViolationRuleConfiguration extends ViolationRuleConfiguration {
    private final JApiCompatibilityChangeType change;

    public CompatibilityChangeViolationRuleConfiguration(final Class<? extends ViolationRule> ruleClass, final Map<String, String> arguments, final JApiCompatibilityChangeType change) {
        super(ruleClass, arguments);
        this.change = change;
    }

    public JApiCompatibilityChangeType getChange() {
        return change;
    }
}
