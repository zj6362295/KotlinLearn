package com.zj.kotlin.learn.unit1_4

object Test {
    fun sayMessage(message: String) {
        println("message: $message")
    }
}
fun main() {
    Test.sayMessage("hello")
}