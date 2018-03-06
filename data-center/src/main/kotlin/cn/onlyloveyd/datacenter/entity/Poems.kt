package cn.onlyloveyd.datacenter.entity

import javax.persistence.*

/**
 * 文 件 名: Poems
 * 创 建 人: 易冬
 * 创建日期: 2018/3/6 10:57
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Entity
@Table(name = "poems", schema = "chinese-poety", catalog = "")
class Poems {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0


    @Column(name = "title")
    var title: String? = null

    @Column(name = "content")
    var content: String? = null

    @Column(name = "author_id")
    var authorId: Int = 0

    @Column(name = "dynasty")
    var dynasty: String? = null

    @Column(name = "author")
    var author: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val poems = o as Poems?

        if (id != poems!!.id) return false
        if (authorId != poems.authorId) return false
        if (if (title != null) title != poems.title else poems.title != null) return false
        if (if (content != null) content != poems.content else poems.content != null)
            return false
        if (if (dynasty != null) dynasty != poems.dynasty else poems.dynasty != null)
            return false
        return if (if (author != null) author != poems.author else poems.author != null) false else true

    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + if (title != null) title!!.hashCode() else 0
        result = 31 * result + if (content != null) content!!.hashCode() else 0
        result = 31 * result + authorId
        result = 31 * result + if (dynasty != null) dynasty!!.hashCode() else 0
        result = 31 * result + if (author != null) author!!.hashCode() else 0
        return result
    }
}
