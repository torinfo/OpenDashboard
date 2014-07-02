/**
 * Copyright 2014 Unicon (R)
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
package ltistarter.repository;

import ltistarter.model.LtiUserEntity;
import org.springframework.data.repository.CrudRepository;

public interface LtiUserRepository extends CrudRepository<LtiUserEntity, Long> {
    /* Add custom crud methods here
     * If you need a custom implementation of the methods then see docs for steps to add it
     * http://docs.spring.io/spring-data/data-commons/docs/current/reference/html/repositories.html
     */
}
