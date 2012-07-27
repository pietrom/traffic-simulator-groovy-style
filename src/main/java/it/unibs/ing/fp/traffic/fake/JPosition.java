package it.unibs.ing.fp.traffic.fake;

public class JPosition {
	private int x, y;

	public JPosition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean equals(JPosition that) {
		return this.x == that.x && this.y == that.y;
	}
}
