package it.unibs.ing.fp.traffic

import org.junit.Test

class PositionTest {
	@Test
	def void rightIncrementsX() {
		def p = new Position(x: 4, y: 5)
		def q = p.right(2)
		assert 6 == q.x
		assert 5 == q.y
	}
}
