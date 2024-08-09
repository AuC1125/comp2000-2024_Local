import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {
    Cell loc;
    Color col;

    void paint(Graphics g){
        g.setColor(col);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
}
