/*
 *  Copyright 2015 the original author or authors members of codetrack.org
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.codetrack.domain.data.fixing;

import org.codetrack.annotation.definition.Feature;
import org.codetrack.annotation.identify.Product;
import org.codetrack.domain.data.definition.Issue;
import org.codetrack.domain.data.identify.Source;
import org.codetrack.domain.data.temporal.Cycle;
import org.codetrack.domain.data.temporal.Iteration;
import org.codetrack.domain.data.temporal.Sprint;

import java.util.Map;

/**
 * @author josecmoj at 29/05/15.
 */
@Product(id = "codetrack-core")
@Feature(id = "#4-DATABASE")
public class Fix {

    private String id;

    private String observation;

    private FixType type;

    private Issue issue;

    private Cycle cycle;

    private Iteration iteration;

    private Sprint sprint;

    private Map<String, Source> sources;

}
