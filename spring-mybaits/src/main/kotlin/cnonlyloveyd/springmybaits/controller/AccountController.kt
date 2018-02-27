package cnonlyloveyd.springmybaits.controller

import cn.onlyloveyd.datacenter.ext.JsonResponse
import cnonlyloveyd.springmybaits.entity.Account
import cnonlyloveyd.springmybaits.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import com.oracle.util.Checksums.update
import org.springframework.web.bind.annotation.*


/**
 * 文 件 名: AccountController
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 16:50
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@RestController
@RequestMapping(value = "/account")
class AccountController(@Autowired
                        val accountService: AccountService) {

    @GetMapping(value = "/list")
    fun getAccounts(): JsonResponse<Any> {
        return JsonResponse.success(accountService.findAccountList())
    }

    @GetMapping(value = "/{id}")
    fun getAccountById(@PathVariable("id") id: Int): JsonResponse<Any> {
        return JsonResponse.success(accountService.findAccount(id))
    }

    @PutMapping(value = "/{id}")
    fun updateAccount(@PathVariable("id") id: Int, @RequestParam(value = "name", required = true) name: String,
                      @RequestParam(value = "money", required = true) money: Double): JsonResponse<Any> {
        val t = accountService.update(name, money, id)
        return if (t == 1) {
            JsonResponse.success("success")
        } else {
            JsonResponse.error("fail")
        }

    }

    @DeleteMapping(value = "/{id}")
    fun delete(@PathVariable(value = "id") id: Int): String {
        val t = accountService.delete(id)
        return if (t == 1) {
            "success"
        } else {
            "fail"
        }

    }

    @PostMapping(value = "")
    fun postAccount(@RequestParam(value = "name") name: String,
                    @RequestParam(value = "money") money: Double): String {

        val t = accountService.add(name, money)
        return if (t == 1) {
            "success"
        } else {
            "fail"
        }

    }

}