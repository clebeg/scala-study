/*
1、面向对象编程的一个优点就是它允许你把数据封装在对象之内以便于确保数据在整个生命周期中有效
2、操作符名称来创建方法并定义隐式转换能帮助你设计出让客户代码更简洁和易于理解的库
3、操作符方法和隐式转换都会让客户代码变得难以阅读和理解。因为隐式转换是由编译器隐式地应用的，而不是显式地写在源代码中
4、在设计库的时候你应记在脑袋里的目标，并不是仅仅让客户代码简洁，而是让它变得更可读，更易懂。
5、和Java一样你会学到如何重载 equals 和 hashcode 来允许 Rational 在用 == 比较或放入到哈希表时表现得更好
*/
class Rational(n: Int, d: Int) {
	require(d != 0)
	private val k = maxCommonDivisor(n.abs, d.abs)
	val number = n / k
	val denom = d / k
	override def toString = number +"/" + denom
	def +(that: Rational): Rational = 
		new Rational(
			number * that.denom + that.number * denom,
			denom * that.denom
		)
	def *(that: Rational): Rational = 
		new Rational(
			this.number * that.number,
			this.denom * that.denom
		)
	def /(that: Rational): Rational = 
		new Rational(
			this.number * that.denom,
			this.denom * that.number
		)
	private def maxCommonDivisor(m:Int, n:Int): Int = {
		if (n == 0) m else maxCommonDivisor(n, m % n)
	}
}
