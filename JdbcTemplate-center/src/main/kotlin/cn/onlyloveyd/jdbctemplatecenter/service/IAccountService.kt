package cn.onlyloveyd.jdbctemplatecenter.service

import cn.onlyloveyd.jdbctemplatecenter.entity.Account



/**
 * 文 件 名: IAccountService
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 13:35
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
interface IAccountService {


    fun add(account: Account): Int?

    fun update(account: Account): Int?

    fun delete(id: Int): Int?

    fun findAccountById(id: Int): Account?

    fun findAccountList(): List<Account>?

}