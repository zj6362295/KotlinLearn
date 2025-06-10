package com.zj.kotlin.learn.unit1_4

class LambdaTest {
}
val print = { name:String -> println("hello $name")}

val lambdaA = {
        a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int,
        i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int,
        q: Int, r: Int, s: Int, t: Int, u: Int, v: Int, w: Int, x: Int,
        y : Int, z: Int ->
    println("Zhang Tao")
}

fun main(args: Array<String>) {
    lambdaA(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1,1,1)
}

