/*
 * Copyright 2013 Palantir Technologies, Inc.
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

package com.palantir.typescript.tsbridge;

/**
 * Error result object returned when the TypeScript bridge throws an error of some sort.
 *
 * @author tyleradams
 */
public final class ErrorResult implements IResult {

    private String resultType;
    private boolean resultValid;
    private String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override
    public String getResultType() {
        return this.resultType;
    }

    @Override
    public boolean isResultNotValid() {
        return !this.resultValid;
    }

}
