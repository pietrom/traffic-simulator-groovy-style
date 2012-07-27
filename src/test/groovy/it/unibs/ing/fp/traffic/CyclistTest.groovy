package it.unibs.ing.fp.traffic

import static org.junit.Assert.*;

class CyclistTest {
	@org.junit.Test
	public void cyclistMovesDown() throws Exception {
		Item cyclist = new Cyclist()
		Position dest = cyclist.moveFrom([x: 3, y: 5] as Position)
		Position expected = [x:3, y:6] as Position
		assert expected == dest
	}
}
