package it.unibs.ing.fp.traffic

class Car extends Item {
	@Override
	def Position moveFrom(Position p) {
		return p.down(2);
	}
}
