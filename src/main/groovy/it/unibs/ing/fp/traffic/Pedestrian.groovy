package it.unibs.ing.fp.traffic

class Pedestrian extends Item {
	def Position moveFrom(Position p) {
		return p.right(1)
	}
	
	def boolean canOverwrite(Item item) {
		true
	}
	
	def boolean canOverwrite(Cyclist item) {
		false
	}
}
