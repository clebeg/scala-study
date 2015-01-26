//如何把函数值应用到创建新的控制抽象。学习 curry 化和叫名参数。

/* 特点：
1、当你把函数值用做参数时，算法的非通用部分就是它代表的某些其它算法。
2、可以实现像切片这样的模式（有点像spring的切片模式）。
3、贷出 模式:loan pattern
*/
import java.io._
def withPrintWriter(file: File, op: PrintWriter => Unit) = {
	val writer = new PrintWriter(file)
	try {
		op(writer)
	} finally {
		writer.close
	}
}

withPrintWriter (
	new File("out.txt"),
	_.println("wo zhishi ce shi yixia 贷出模式，类似于切片模型。")
)


//叫名函数：空的参数列表被省略。
def byNameAssert(predicate: => Boolean) {
	if (assertionsEnabled && !predicate)
		throw new AssertionErro
}

byNameAssert(5 > 3)

/*总结：这些都是利用函数值对象干的活。
1、你可以自己写控制抽象。
2、API中有大量的控制抽象，要看得懂。
3、什么是curry化代码，什么是贷出模式，什么是叫名函数。
*/