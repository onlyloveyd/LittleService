package cnonlyloveyd.springmybaits.service

import cnonlyloveyd.springmybaits.dao.AccountMapper
import cnonlyloveyd.springmybaits.entity.Account
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * 文 件 名: AccountService
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 16:38
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Service
class AccountService(@Autowired private var accountMapper: AccountMapper) {

    fun add(name: String, money: Double): Int {
        return accountMapper.add(name, money)
    }

    fun update(name: String, money: Double, id:Int):Int{
        return accountMapper.update(name, money, id)
    }

    fun delete(id: Int): Int {
        return accountMapper.delete(id)
    }

    fun findAccount(id: Int): Account {
        return accountMapper.findAccount(id)
    }

    fun findAccountList(): MutableList<Account> {
        return accountMapper.findAccountList()
    }
}

