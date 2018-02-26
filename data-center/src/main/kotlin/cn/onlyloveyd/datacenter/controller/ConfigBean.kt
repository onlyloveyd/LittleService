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

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.PropertySource
import org.springframework.stereotype.Component

/**
 * 文 件 名: ConfigBean
 * 创 建 人: 易冬
 * 创建日期: 2018/02/26 19/51
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@ConfigurationProperties(prefix = "me")
@PropertySource(value = "classpath:custom.properties")
@Component
data class ConfigBean(var name:String?=null,
                      var age:Int?=null,
                      var uuid: String?=null,
                      var max: Int?=null,
                      var value: String?=null,
                      var greeting: String?=null)