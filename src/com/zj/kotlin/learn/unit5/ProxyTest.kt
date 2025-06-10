package com.zj.kotlin.learn.unit5

class ProxyTest {
}

interface Animal {
    fun bark() { }
}

class Dog : Animal {
    override fun bark() {
        println("Dog bark")
    }
}

class Zoo(private val animal: Animal):  Animal by animal{
    override fun bark() {
        println("Zoo bark start ")
        animal.bark()
        println("Zoo bark end ")
    }
}

fun main() {
    Zoo(Dog()).bark()
}