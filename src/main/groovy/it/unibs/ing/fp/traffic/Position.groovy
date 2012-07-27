package it.unibs.ing.fp.traffic

class Position {
	def int x, y
	
	def Position right(int amount) {
		return move({it + amount}, {it})
	}
	
	def Position down(int amount) {
		return move({it}, {it + amount})
	}
	
	private Position move(Closure deltaX, Closure deltaY) {
		return new Position(x: deltaX(x), y: deltaY(y))
	}
}
