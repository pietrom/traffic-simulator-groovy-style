package it.unibs.ing.fp.traffic

abstract class Item {
	def abstract Position moveFrom(Position p)
	
	def boolean canOverwrite(Item item) {
		false
	}
}
