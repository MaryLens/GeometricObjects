package geometry;

public class Line {
	// properties
	public int startX;
	public int endX;
	public int startY;
	public int endY;

	// constructor
	public Line(int startX, int startY, int endX, int endY) {
		if (startX == endX && startY == endY) {
			System.err.println("Start coordinates are the same as end coordinates!");

		} else {
			this.startX = startX;
			this.startY = startY;
			this.endX = endX;
			this.endY = endY;
		}
	}

	// behavior
	public void printCoords() {
		System.out.println("[" + startX + ":" + startY + "]----->[" + endX + ":" + endY + "]");

	}

	public int length() {
		int length = (int)Math.rint(Math.sqrt((sqr(endX - startX)) + (sqr(endY - startY))));
		return length;

	}

// helper mini method for squaring 
	static int sqr(int a) {
		int result = a * a;
		return result;
	}

}
