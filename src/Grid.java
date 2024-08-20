import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.function.Consumer;

public class Grid {
  Cell[][] cells = new Cell[20][20];

  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j] = new Cell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
      }
    }
  }

  private char colToLabel(int col) {
    return (char) (col + Character.valueOf('A'));
  }

  private int labelToCol(char col) {
    return (int) (col - Character.valueOf('A'));
  }

  public void paint(Graphics g, Point mousePos) {
    doToEachCell(cell -> cell.paint(g, mousePos));
    // doToEachCell(cell -> cell.x = (cell.x + 1) % 1024);
  }

  public void doToEachCell(Consumer<Cell> func) {
    for (Cell[] c : cells)
      for (Cell apples : c)
        func.accept(apples);
  }



  public Optional<Cell> cellAtColRow(int c, int r) {
    if (c >= 0 && c < cells.length && r >= 0 && r < cells[r].length)
      return Optional.of(cells[c][r]);
    return Optional.empty();
  }

  public Optional<Cell> cellAtColRow(char c, int r) {
    return cellAtColRow(labelToCol(c), r);
  }

  public Optional<Cell> cellAtPoint(Point p) {
    if (p == null)
      return Optional.empty();
    int x = (int) (p.getX() - 10) / Cell.size;
    int y = (int) (p.getY() - 10) / Cell.size;
    return cellAtColRow(x, y);
  }
}
