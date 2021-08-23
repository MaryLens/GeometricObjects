package main;

import geometry.Line;

public class Application {

	public static void main(String[] args) {
		// horizontal line
		Line short_horizontal_line = new Line(100, 0, 200, 0);
		short_horizontal_line.printCoords();
		System.out.println(short_horizontal_line.length());

		// diagonal line
		Line long_diagonal_line = new Line(100, 100, 500, 500);
		long_diagonal_line.printCoords();
		System.out.println(long_diagonal_line.length());

		// error case
		Line error_line = new Line(10, 100, 10, 100);
		error_line.printCoords();
		System.out.println(error_line.length());

	}

}
