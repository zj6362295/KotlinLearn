package com.zj.kotlin.learn.unit5

data class TestData(private val _name:  String, private var _age: Int){
    val name: String
        get() = _name
    var age: Int
        get() = _age
        set(value) {
            _age = value
        }

    override fun toString(): String {
        return "$_name,  $_age"
    }
}


fun main() {
    val testData = TestData("zhangsan", 18)
    println(testData.toString())
    testData.age = 20
    println(testData)
}