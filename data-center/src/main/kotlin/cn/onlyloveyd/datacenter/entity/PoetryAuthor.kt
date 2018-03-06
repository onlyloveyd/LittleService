package cn.onlyloveyd.datacenter.entity

import javax.persistence.*

/**
 * 文 件 名: PoetryAuthor
 * 创 建 人: 易冬
 * 创建日期: 2018/3/6 10:57
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
@Entity
@Table(name = "poetry_author", schema = "chinese-poety", catalog = "")
class PoetryAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Int = 0

    @Column(name = "name")
    var name: String? = null

    @Column(name = "intro")
    var intro: String? = null

    @Column(name = "dynasty")
    var dynasty: String? = null

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as PoetryAuthor?

        if (id != that!!.id) return false
        if (if (name != null) name != that.name else that.name != null) return false
        if (if (intro != null) intro != that.intro else that.intro != null) return false
        return if (if (dynasty != null) dynasty != that.dynasty else that.dynasty != null) false else true

    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + if (name != null) name!!.hashCode() else 0
        result = 31 * result + if (intro != null) intro!!.hashCode() else 0
        result = 31 * result + if (dynasty != null) dynasty!!.hashCode() else 0
        return result
    }
}
