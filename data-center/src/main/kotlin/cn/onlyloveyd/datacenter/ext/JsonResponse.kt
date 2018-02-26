package cn.onlyloveyd.datacenter.ext

/**
 * 文 件 名: JsonResponse
 * 创 建 人: 易冬
 * 创建日期: 2018/2/26 16:33
 * 邮   箱: onlyloveyd@gmail.com
 * 博   客: https://onlyloveyd.cn
 * 描   述：
 */
class JsonResponse<T> {
    companion object {
        val CODE_ERROR = -1
        val CODE_OK = 0

        fun success(data:Any):JsonResponse<Any> {
            val response = JsonResponse<Any>()
            response.data = data
            response.errorCode = CODE_OK
            response.errorMsg = ""
            return response
        }

        fun error(msg:String):JsonResponse<Any> {
            val response = JsonResponse<Any>()
            response.data = ""
            response.errorCode = CODE_ERROR
            response.errorMsg = msg
            return response
        }

    }

    var errorCode:Int ?= -1
    var errorMsg:String ?= null
    var data:T ?= null

}