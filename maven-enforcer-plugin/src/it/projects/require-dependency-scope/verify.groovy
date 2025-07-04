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
File buildLog = new File(basedir, 'build.log')

def column = mavenVersion.startsWith('4.') ? '9' : '21'

assert buildLog.text.contains('[ERROR] Dependency org.apache.jackrabbit.vault:vault-cli:jar @ line 65, column ' + column + ' does not have an explicit scope defined!')
assert buildLog.text.contains('Found 1 missing dependency scope. Look at the errors emitted above for the details.')
