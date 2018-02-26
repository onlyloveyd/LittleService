package cn.onlyloveyd.datacenter.entity

import javax.persistence.*

/**
 * 文 件 名: User
 * 创 建 人: 易冬
 * 创建日期: 2018/2/26 16:30
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Entity
@Table(name = "user")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Int? = null

    var username:String ?= null

    var password:String ?= null
}