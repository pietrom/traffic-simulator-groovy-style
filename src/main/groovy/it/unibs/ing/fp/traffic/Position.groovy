package it.unibs.ing.fp.traffic

class Position {
	def int x, y
	
	def Position right(int amount) {
		return new Position(x: this.x + amount, y: this.y)
	}
}
