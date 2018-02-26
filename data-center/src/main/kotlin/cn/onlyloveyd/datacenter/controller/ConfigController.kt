/**
 * Copyright 2017 yidong
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.onlyloveyd.datacenter.controller

import cn.onlyloveyd.datacenter.ext.JsonResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 文 件 名: ConfigController
 * 创 建 人: 易冬
 * 创建日期: 2018/02/26 20/49
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@RestController
@RequestMapping(value = "/config")
@EnableConfigurationProperties(value = ConfigBean::class)
class ConfigController() {

    @Autowired
    private var configBean:ConfigBean?= null

    @GetMapping(value = "/getConfig")
    fun getConfig():JsonResponse<Any> {
        return JsonResponse.success(configBean as Any)
    }
}