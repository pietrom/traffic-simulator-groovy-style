package it.unibs.ing.fp.traffic

class Cyclist extends Item {
	@Override
	def Position moveFrom(Position p) {
		p.down(1);
	}
}
