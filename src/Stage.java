import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    Grid grid = new Grid();
    Actor birdd;
    Actor dogg;
    Actor catt;

    public Stage(){
        birdd = new Bird(grid.cells[1][1]);
        dogg = new Dog(grid.cells[18][6]);
        catt = new Cat(grid.cells[10][17]);
    }

    void paint(Graphics g, Point p){
        grid.paint(g, p);
        birdd.paint(g);
        dogg.paint(g);
        catt.paint(g);
    }
}
