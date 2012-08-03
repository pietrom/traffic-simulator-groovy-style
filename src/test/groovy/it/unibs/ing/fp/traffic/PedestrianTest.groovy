package it.unibs.ing.fp.traffic

import org.junit.Test
import org.junit.Before

class PedestrianTest {
	def Item pedestrian
	
	@Before
	def void initPedestrian() {
		pedestrian = new Pedestrian()
	}
	
	@Test
	public void pedestrianMovesDown() throws Exception {
		Position dest = pedestrian.moveFrom([x: 3, y: 5] as Position)
		Position expected = [x:4, y:5] as Position
		assert expected == dest
	}
	
	@Test
	def void pedestrianCanOverwriteCars() {
		assert pedestrian.canOverwrite(new Car())
	}
	
	@Test
	def void pedestrianCantOverwriteCyclists() {
		assert !pedestrian.canOverwrite(new Cyclist())
	}
}
