import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  // Actor cat;
  // Actor dog;
  // Actor bird;
  ArrayList <Actor> actors = new ArrayList<>();

  public Stage() {
    grid = new Grid();
    actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(0, 15)));
    actors.add(new Bird(grid.cellAtColRow(12, 9)));
  

    // cat = new Cat(grid.cellAtColRow(0, 0));
    // dog = new Dog(grid.cellAtColRow(0, 15));
    // bird = new Bird(grid.cellAtColRow(12, 9));
    
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Actor a : actors){
      a.paint(g);
    }
    

    // cat.paint(g);
    // dog.paint(g);
    // bird.paint(g);
  }
}
