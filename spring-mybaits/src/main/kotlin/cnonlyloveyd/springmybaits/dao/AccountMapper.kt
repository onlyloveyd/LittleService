package cnonlyloveyd.springmybaits.dao

import cnonlyloveyd.springmybaits.entity.Account
import org.apache.ibatis.annotations.*

/**
 * 文 件 名: AccountMapper
 * 创 建 人: 易冬
 * 创建日期: 2018/2/27 16:29
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Mapper
interface AccountMapper {

    @Insert("insert into account(name, money) value(#{name}, #{money}")
    fun add(@Param("name") name: String, @Param("money") money: Double): Int

    @Update("update account set name=#{name}, money = #{money} where id = #{id}")
    fun update(@Param("name") name: String, @Param("money") money: Double, @Param("id") id: Int): Int

    @Delete("delete from account where id=#{id}")
    fun delete(@Param("id") id: Int): Int

    @Select("select * from account where id = #{id}")
    fun findAccount(@Param("id") id: Int): Account

    @Select("select * from account")
    fun findAccountList(): MutableList<Account>

}