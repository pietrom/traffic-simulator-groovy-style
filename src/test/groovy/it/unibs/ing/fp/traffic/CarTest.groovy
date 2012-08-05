package it.unibs.ing.fp.traffic

import static org.junit.Assert.*;
import org.junit.Test
import org.junit.Before

class CarTest {
	def Item car
	
	@Before
	def void initCar() {
		car = new Car()
	}
	
	@Test
	def void carMovesDown() throws Exception {
		Position dest = car.moveFrom([x: 3, y: 5] as Position)
		Position expected = [x:3, y:7] as Position
		assert expected == dest
	}
	
	@Test
	def void carCantOverwritePedestrian() {
		assert !car.canOverwrite(new Pedestrian())
	}
}
