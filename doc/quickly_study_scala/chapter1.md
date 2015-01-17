# SCALA 入门
* 使用Scala解释器
* 用var和val定义变量
* 数字类型
* 使用操作符和函数
* 浏览Scaladoc

## 基本语法
```
scala> 8 * 5 + 2
res0: Int = 42

scala> 0.5 * res0
res1: Double = 21.0

scala> "Hello," + res0
res2: String = Hello,42
scala> res2.t
toCharArray   toLowerCase   toString   toUpperCase   trim

scala> res2.toUpperCase
res3: String = HELLO,42
```

* 变量声明——必须初始化
1. val	声明常量（Scala 鼓励）
2. var	声明变量 

```
scala> val answer = 8*5+2
answer: Int = 42

scala> 8 * answer
res4: Int = 336
scala> answer = 1
<console>:8: error: reassignment to val
       answer = 1
              ^

scala> var answer = 1
answer: Int = 1

scala> answer = 2
answer: Int = 2
```
* 也可以指定变量类型，变量名:变量类型（切记）
\[在Scala中，仅当同一行代码中存在多条语句的时候，才需要分号分割。\]
```

scala> val xmax, ymax = 100
xmax: Int = 100
ymax: Int = 100

scala> var greeting, message: String = null
greeting: String = null
message: String = null
```
* 在Scala中常用的数据类型有八种和Java一样：Byte、Char、Short、Int、Long、Float、Double、Boolean
\[和Java不同，这些类型都是类,和Java不同，不作强制类型转换，而是使用方法\]
```
scala> 1.toString
res5: String = 1

scala> 1.
%   +   >    >>>            isInstanceOf   toDouble   toLong     unary_+   |
&   -   >=   ^              toByte         toFloat    toShort    unary_-
*   /   >>   asInstanceOf   toChar         toInt      toString   unary_~

scala> 1.to(10)
res6: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8,
 9, 10)

 scala> 1.to(10, 2)
res7: scala.collection.immutable.Range.Inclusive = Range(1, 3, 5, 7, 9)

scala> Range(1,10, 2)
res8: scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
```