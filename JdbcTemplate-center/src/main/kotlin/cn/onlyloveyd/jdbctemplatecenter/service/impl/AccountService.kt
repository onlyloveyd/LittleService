package cn.onlyloveyd.jdbctemplatecenter.service.impl

import cn.onlyloveyd.jdbctemplatecenter.entity.Account
import cn.onlyloveyd.jdbctemplatecenter.dao.IAccountDAO
import cn.onlyloveyd.jdbctemplatecenter.service.IAccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


/**
 * 文 件 名: AccountService
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 13:35
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Service
class AccountService : IAccountService {
    @Autowired
    internal var accountDAO: IAccountDAO? = null

    override fun add(account: Account): Int? {
        return accountDAO?.add(account)
    }

    override fun update(account: Account): Int? {
        return accountDAO?.update(account)
    }

    override fun delete(id: Int): Int? {
        return accountDAO?.delete(id)
    }

    override fun findAccountById(id: Int): Account? {
        return accountDAO?.findAccountById(id)
    }

    override fun findAccountList(): List<Account>? {
        return accountDAO?.findAccountList()
    }
}