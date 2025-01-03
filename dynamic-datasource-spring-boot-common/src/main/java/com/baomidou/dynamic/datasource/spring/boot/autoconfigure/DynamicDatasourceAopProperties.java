/*
 * Copyright © 2018 organization baomidou
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
package com.baomidou.dynamic.datasource.spring.boot.autoconfigure;

import lombok.Data;
import org.springframework.core.Ordered;

import java.util.List;
import java.util.Map;

/**
 * 多数据源aop相关配置
 *
 * @author TaoYu
 */
@Data
public class DynamicDatasourceAopProperties {

    /**
     * enabled default DS annotation default true
     */
    private Boolean enabled = true;
    /**
     * aop order
     */
    private Integer order = Ordered.HIGHEST_PRECEDENCE;
    /**
     * aop allowedPublicOnly
     */
    private Boolean allowedPublicOnly = true;

    /**
     * aop scanPackagePatterns
     */
    private List<String> scanPackagePatterns;

    /**
     * dynamic datasource routes
     */
    private Map<String, String> dsRoutes;
}