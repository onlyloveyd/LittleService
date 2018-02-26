package cn.onlyloveyd.datacenter.repository

import cn.onlyloveyd.datacenter.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * 文 件 名: UserRepository
 * 创 建 人: 易冬
 * 创建日期: 2018/2/26 16:32
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
interface UserRepository:JpaRepository<User, Int>