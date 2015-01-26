
//先得到行字符串
def makeRowSeq(row: Int) = {
	val rowSeq = 
		for(col <- row to 9) yield {
			val prod = (row * col).toString
			if (col == row)
				" " * (4 * (row - 1) - prod.length + 1) + prod
			else
				" " * (4 - prod.length) + prod
		}
	rowSeq.mkString
}

//然后按列得到所有的字符串，思路比起以前用C语言编程，明白易懂许多，效率当然也不会低
def multiTable() = {
	val tableSeq = 
		for(row <- 1 to 9) yield 
			makeRowSeq(row)
	tableSeq.mkString("\n")
}

println(multiTable)