package com.zj.kotlin.learn.unit1_4

import kotlin.reflect.KClass

var age: Int = 18
var name: String = "zhangsan"
var name2: String? = null

fun main(args: Array<String>) {
    name2 = name
    println(printLen(name2))
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
    println(JavaMain.`in`)
    Aj.a.putNumber(123)
    var nullable: String? = null
    println(nullable?.length)
    val age = 18
    val name = "Zhang Tao"
    println("我叫${name} 我今年${age}岁 ")

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