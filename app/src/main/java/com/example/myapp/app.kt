package com.example.myapplication

import com.github.mikephil.charting.data.Entry
import kotlin.random.Random

/*类的修饰符
类的修饰符包括 classModifier 和_accessModifier_:

classModifier: 类属性修饰符，标示类本身特性。

abstract    // 抽象类
final       // 类不可继承，默认属性
enum        // 枚举类
open        // 类可继承，类默认是final的
annotation  // 注解类
accessModifier: 访问权限修饰符

private    // 仅在同一个文件中可见
protected  // 同一个文件中或子类可见
public     // 所有调用的地方都可见
internal   // 同一个模块中可见*/

fun main (args:Array<String>){
//    print(sum(10,5))
//    print("\n"+sum2(3,5))
//    print("\n"+sum3(8,5)+"\n")
//    printSum(6,5)
//    printSum1(7,8)
    val entries: MutableList<Entry> = ArrayList()
    for (i in 0..11){
        entries.add(
            Entry(
                i.toFloat(),
                Random.nextInt(300).toFloat()
            )
        )
    }
    println(entries)
}

fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    return a + b
}

//表达式作为函数体，返回类型自动推断：

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型

//无返回值的函数(类似Java中的void)：

fun printSum(a: Int, b: Int): Unit {
    print(a + b)
}

// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
public fun printSum1(a: Int, b: Int) {
    print("\n"+ a + b)
}

fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}


