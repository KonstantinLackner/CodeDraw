import codedraw.CodeDraw;
import codedraw.Palette;
import codedraw.events.*;

public class GameOfLife {
	private static final int FIELD_SIZE = 10;

	public static void main(String[] args) {
		final int size = 1 << 6; // must be power of 2
		final int mask = size - 1;

		CodeDraw cd = new CodeDraw(size * FIELD_SIZE, size * FIELD_SIZE);
		EventScanner es = new EventScanner(cd);

		boolean[][] field = createRandomBooleans(size);

		boolean isMouseDown = false;
		boolean setValue = false;

		for (int i = 0; !es.isClosed(); i++) {
			while (es.hasEventNow()) {
				if (es.hasMouseDownEvent()) {
					MouseDownEventArgs a = es.nextMouseDownEvent();
					isMouseDown = true;
					setValue = !field[a.getX() / FIELD_SIZE][a.getY() / FIELD_SIZE];
				}
				else if (es.hasMouseUpEvent() || es.hasMouseLeaveEvent()) {
					es.nextEvent();
					isMouseDown = false;
				}
				else if (es.hasMouseMoveEvent()) {
					MouseMoveEventArgs a = es.nextMouseMoveEvent();
					if (isMouseDown) {
						field[a.getX() / FIELD_SIZE][a.getY() / FIELD_SIZE] = setValue;
					}
				}
				else {
					es.nextEvent();
				}
			}

			if (i % 8 == 0) {
				field = simulateNextGeneration(field, mask);
			}

			render(cd, field);
		}
	}

	private static boolean[][] createRandomBooleans(int size) {
		boolean[][] field = new boolean[size][size];

		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				field[x][y] = Math.random() > 0.5;
			}
		}

		return field;
	}

	public static boolean[][] simulateNextGeneration(boolean[][] field, int mask) {
		final int radius = 1;
		boolean[][] nextField = new boolean[field.length][field.length];

		for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field[x].length; y++) {
				int sum = 0;

				for (int xn = -radius; xn <= radius; xn++) {
					for (int yn = -radius; yn <= radius; yn++) {
						if ((xn != 0 || yn != 0) && field[(x + xn) & mask][(y + yn) & mask]) {
							sum++;
						}
					}
				}

				if (field[x][y]) {
					nextField[x][y] = sum == 2 || sum == 3;
				}
				else {
					nextField[x][y] = sum == 3;
				}
			}
		}

		return nextField;
	}

	public static void render(CodeDraw cd, boolean[][] field) {
		for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field[x].length; y++) {
				cd.setColor(field[x][y] ? Palette.BLACK : Palette.WHITE);
				cd.fillSquare(FIELD_SIZE * x, FIELD_SIZE * y, FIELD_SIZE);
			}
		}

		cd.show(16);
	}
}
