package cn.onlyloveyd.datacenter.repository

import cn.onlyloveyd.datacenter.entity.Poems
import org.springframework.data.jpa.repository.JpaRepository

/**
 * 文 件 名: PoemsRepository
 * 创 建 人: 易冬
 * 创建日期: 2018/3/6 10:58
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
interface PoemsRepository:JpaRepository<Poems, Int>