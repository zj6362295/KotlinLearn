package com.zj.kotlin.learn.unit5

class CompanionTest {
}

class StringUtils{
    companion object{
        fun isEmpty(str: String): Boolean{
            return str.isEmpty()
        }
        fun length(str: String): Int{
            return str.length
        }
    }
}

class Single private constructor(){
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}

fun main(args: Array<String>) {
    println(StringUtils.isEmpty(""))
    println(StringUtils.length("12"))
    println(Single.get())
//    println(Single())

}