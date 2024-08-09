import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

public class Circle {
  // fields
  int x;
  int y;
  int size = 35;

  // constructors
  public Circle() {
    
  }

  // methods
  public void circle(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
        
    }
        g.drawOval(x, y, size, size);
        g.fillOval(x, y, size, size);
  }

  public boolean contains(Point p) {
    if(p != null) {
      return true;
    } else {
      return false;
    }
  }

public static void paint(Graphics g, Point mousePosition) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'paint'");
}
}