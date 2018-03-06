package cn.onlyloveyd.datacenter.entity

import javax.persistence.*

/**
 * 文 件 名: Poetry
 * 创 建 人: 易冬
 * 创建日期: 2018/3/6 10:57
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Entity
@Table(name = "poetry", schema = "chinese-poety", catalog = "")
class Poetry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "title")
    var title: String? = null

    @Column(name = "yunlv_rule")
    var yunlvRule: String? = null

    @Column(name = "author_id")
    var authorId: Int = 0

    @Column(name = "content")
    var content: String? = null

    @Column(name = "dynasty")
    var dynasty: String? = null

    @get:Column(name = "author")
    var author: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val poetry = o as Poetry?

        if (id != poetry!!.id) return false
        if (authorId != poetry.authorId) return false
        if (if (title != null) title != poetry.title else poetry.title != null) return false
        if (if (yunlvRule != null)
            yunlvRule != poetry.yunlvRule
        else
            poetry.yunlvRule != null) {
            return false
        }
        if (if (content != null) content != poetry.content else poetry.content != null) {
            return false
        }
        if (if (dynasty != null) dynasty != poetry.dynasty else poetry.dynasty != null) {
            return false
        }
        return if (if (author != null) author != poetry.author else poetry.author != null) false else true

    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + if (title != null) title!!.hashCode() else 0
        result = 31 * result + if (yunlvRule != null) yunlvRule!!.hashCode() else 0
        result = 31 * result + authorId
        result = 31 * result + if (content != null) content!!.hashCode() else 0
        result = 31 * result + if (dynasty != null) dynasty!!.hashCode() else 0
        result = 31 * result + if (author != null) author!!.hashCode() else 0
        return result
    }
}
