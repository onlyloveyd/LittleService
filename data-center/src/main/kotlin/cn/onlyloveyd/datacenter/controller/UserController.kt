package cn.onlyloveyd.datacenter.controller

import cn.onlyloveyd.datacenter.entity.User
import cn.onlyloveyd.datacenter.ext.JsonResponse
import cn.onlyloveyd.datacenter.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 文 件 名: UserController
 * 创 建 人: 易冬
 * 创建日期: 2018/2/26 16:31
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@RestController
@RequestMapping(path = ["/user"])
class UserController(@Autowired private var userRepository: UserRepository) {


    @GetMapping("/users")
    fun findAll():JsonResponse<Any>{
        return JsonResponse.success(userRepository.findAll())
    }

    @PostMapping("/addOne")
    fun addOne( user:User): JsonResponse<Any> {
        return JsonResponse.success(userRepository.save(user))
    }

}