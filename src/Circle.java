import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Circle {
    int size = 35;
    int maxTrails = 100;
    ArrayList<Point> points = new ArrayList<>();


    public void savePoint(Point mousePos) {
        if (mousePos != null) {
            points.add(0, mousePos);
            if (points.size() > maxTrails) {
                points.removeLast();
            }
        }
    }

    public void circles(Graphics g) {
        for (int i = 0; i < points.size(); i++) {
            Point p = points.get(i);
            g.setColor(new Color(0, 0, 0, 128));
            g.fillOval(p.x, p.y, size-20, size-20);
            }
        }
    }
