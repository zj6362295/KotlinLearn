package com.zj.kotlin.learn.unit5

class ConstructTest(a:String, b:Int): Any() {
  init {
      println("a: $a, b: $b")
  }
    constructor(a:String) : this(a, 0){
    }

}