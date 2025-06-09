package com.zj.kotlin.learn

import kotlin.reflect.KClass

var age: Int = 18
var name: String = "zhangsan"
var name2: String? = null

fun main(args: Array<String>) {
//    name = name2!!
    name2 = name
    println(printLen(name2))
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
    println(JavaMain.`in`)
}

fun printLen(str: String?) :String? {
    println(str)
    println("字符串是:$str")
    return str
}

fun testClass(clazz: Class<JavaMain>) {
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}