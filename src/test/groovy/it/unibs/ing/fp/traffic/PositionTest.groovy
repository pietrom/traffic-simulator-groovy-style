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
	
	@Test
	def void downIncrementsY() {
		def p = new Position(x: 4, y: 5)
		def q = p.down(3)
		assert 4 == q.x
		assert 8 == q.y
	}
	
	@Test
	def void givenDifferentXsThenEqualsIsFalse() {
		def p = [x: 3, y: 5] as Position
		def q = [x: 4, y: 5] as Position
		assert p != q
	}
	
	@Test
	def void givenDifferentYsThenEqualsIsFalse() {
		def p = [x: 4, y: 7] as Position
		def q = [x: 4, y: 5] as Position
		assert p != q
	}
	
	@Test
	def void givenDifferentXsAndYsThenEqualsIsFalse() {
		def p = [x: 2, y: 7] as Position
		def q = [x: 4, y: 5] as Position
		assert p != q
	}
	
	@Test
	def void givenIdenticalXsAndYsThenEqualsIsTrue() {
		def p = [x: 4, y: 7] as Position
		def q = [x: 4, y: 7] as Position
		assert p == q
	}
}
