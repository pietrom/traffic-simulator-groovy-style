package it.unibs.ing.fp.traffic

class Cyclist extends Item {
	@Override
	def Position moveFrom(Position p) {
		return p.down(1);
	}
}
