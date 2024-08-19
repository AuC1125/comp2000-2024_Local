import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    if (grid.cellAtPoint(mouseLoc).isPresent()){
      System.out.println(grid.cellAtPoint(mouseLoc).get().toString());
      g.drawString(grid.cellAtPoint(mouseLoc).get().toString(), 740, 300);
    }

    g.drawString("onetwethree", 800, 200);
    for(Actor a: actors) {
      a.paint(g);
    }
  }
}
