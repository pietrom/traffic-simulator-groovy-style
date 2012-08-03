package it.unibs.ing.fp.traffic

import static org.junit.Assert.*;

class CarTest {
	@org.junit.Test
	public void carMovesDown() throws Exception {
		Item cyclist = new Car()
		Position dest = cyclist.moveFrom([x: 3, y: 5] as Position)
		Position expected = [x:3, y:7] as Position
		assert expected == dest
	}
}
