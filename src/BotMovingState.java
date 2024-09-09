import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

public class BotMovingState implements GameState {

  @Override
  public void paint(Graphics g, Point mouseLoc, Stage s){
    for(Actor a: s.actors) {
        if(!a.isHuman()) {
          List<Cell> possibleLocs = s.getClearRadius(a.loc, a.moves);
          Cell nextLoc = a.strat.chooseNextLoc(possibleLocs);
          a.setLocation(nextLoc);
        }
      }
      s.currentState = new ChoosingActorState();
      for(Actor a: s.actors) {
        a.turns = 1;
      }
    }

  @Override
  public void mouseClicked(int x, int y, Stage s) {
    System.out.println(s.currentState);
  }
}
