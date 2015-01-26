import scala.collection.mutable.Map
class ChecksumCalculater {
	private var sum = 0
	//A = 65
	//a = 97
	def add(b: Byte) {sum += b}

	//1、求出正数的补码
	//2、求出负数+255
	def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumCalculater {
	private val cache = Map[String, Int]()
	def calculate(s: String): Int = {
		if (cache.contains(s))
			cache(s)
		else {
			val csc = new ChecksumCalculater
			for(c <- s)
				csc.add(c.toByte)
			val cs = csc.checksum
			cache += (s -> cs)
			cs
		}
	}
}