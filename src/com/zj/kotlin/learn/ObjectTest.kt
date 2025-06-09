package com.zj.kotlin.learn

object Test {
    fun sayMessage(message: String) {
        println("message: $message")
    }
}
fun main() {
    Test.sayMessage("hello")
}