package cn.onlyloveyd.jdbctemplatecenter.dao.impl

import cn.onlyloveyd.jdbctemplatecenter.dao.IAccountDAO
import cn.onlyloveyd.jdbctemplatecenter.entity.Account
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository


/**
 * 文 件 名: AccountDaoImpl
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 13:30
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Repository
class AccountDaoImpl : IAccountDAO {

    @Autowired
    private val jdbcTemplate: JdbcTemplate? = null

    override fun add(account: Account): Int? {
        return jdbcTemplate?.update("insert into account(name, money) values(?, ?)",
                account.name, account.money)

    }

    override fun update(account: Account): Int? {
        return jdbcTemplate?.update("UPDATE  account SET NAME=? ,money=? WHERE id=?",
                account.name, account.money, account.id)
    }

    override fun delete(id: Int): Int? {
        return jdbcTemplate?.update("DELETE from TABLE account where id=?", id)
    }

    override fun findAccountById(id: Int): Account? {

        val list = jdbcTemplate?.query("select * from account where id = ?", arrayOf<Any>(id), BeanPropertyRowMapper(Account::class.java))
        return if (list != null && list.size > 0) {
            list[0]
        } else {
            null
        }
    }

    override fun findAccountList(): List<Account>? {
        val list = jdbcTemplate?.query("select * from account", arrayOf<Any>(), BeanPropertyRowMapper(Account::class.java))
        return if (list != null && list.size > 0) {
            list
        } else {
            null
        }
    }
}