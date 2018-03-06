package cn.onlyloveyd.datacenter.controller

import cn.onlyloveyd.datacenter.ext.JsonResponse
import cn.onlyloveyd.datacenter.repository.PoemsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 文 件 名: PoemsController
 * 创 建 人: 易冬
 * 创建日期: 2018/3/6 11:05
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@RestController
@RequestMapping("/poems")
class PoemsController(@Autowired private var poemsRepository: PoemsRepository) {

    @GetMapping("/list")
    fun findAll(): JsonResponse<Any> {
        return JsonResponse.success(poemsRepository.findAll())
    }

    @GetMapping("/{id}")
    fun getOne(@PathVariable(value = "id", required = true) id: Int): JsonResponse<Any> {
        return JsonResponse.success(poemsRepository.getOne(id))
    }

}