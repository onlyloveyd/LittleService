package cn.onlyloveyd.jdbctemplatecenter.controller

import cn.onlyloveyd.datacenter.ext.JsonResponse
import cn.onlyloveyd.jdbctemplatecenter.entity.Account
import cn.onlyloveyd.jdbctemplatecenter.service.IAccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


/**
 * 文 件 名: AccountController
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 13:37
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@RestController
@RequestMapping(value = "/account")
class AccountController {
    @Autowired
    var accountService: IAccountService? = null

    @GetMapping(value = "/list")
    fun getAccounts(): JsonResponse<Any> {
        return JsonResponse.success(accountService?.findAccountList() as Any)
    }

    @GetMapping(value = "/{id}")
    fun getAccountById(@PathVariable("id") id: Int): JsonResponse<Any> {
        return JsonResponse.success(accountService?.findAccountById(id) as Any)
    }

    @PutMapping(value = "/{id}")
    fun updateAccount(@PathVariable("id") id: Int, @RequestParam(value = "name", required = true) name: String,
                      @RequestParam(value = "money", required = true) money: Double): JsonResponse<Any> {
        val account = Account()
        account.money = money
        account.name = name
        account.id = id
        val t = accountService?.update(account)!!
        return if (t == 1) {
            JsonResponse.success(account.toString())
        } else {
            JsonResponse.error("fail")
        }
    }

    @PostMapping(value = "")
    fun postAccount(@RequestParam(value = "name") name: String,
                    @RequestParam(value = "money") money: Double): JsonResponse<Any> {
        val account = Account()
        account.money = money
        account.name = name
        val t = accountService?.add(account)!!
        return if (t == 1) {
            JsonResponse.success(account.toString())
        } else {
            JsonResponse.error("fail")
        }

    }

}