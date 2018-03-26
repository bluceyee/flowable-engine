/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.app.admin.application;

import org.flowable.admin.conf.ApplicationConfiguration;
import org.flowable.admin.conf.DispatcherServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * @author Filip Hrisafov
 */
@Import({
    ApplicationConfiguration.class,
    DispatcherServletConfiguration.class
})
@SpringBootApplication
public class FlowableAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FlowableAdminApplication.class, args);
    }
}