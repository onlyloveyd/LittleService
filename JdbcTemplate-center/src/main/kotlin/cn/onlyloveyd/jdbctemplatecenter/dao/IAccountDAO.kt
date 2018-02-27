package cn.onlyloveyd.jdbctemplatecenter.dao

import cn.onlyloveyd.jdbctemplatecenter.entity.Account



/**
 * 文 件 名: IAccountDAO
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 13:29
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
interface IAccountDAO {
    fun add(account: Account): Int?

    fun update(account: Account): Int?

    fun delete(id: Int): Int?

    fun findAccountById(id: Int): Account?

    fun findAccountList(): List<Account>?
}