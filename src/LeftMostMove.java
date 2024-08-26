import java.util.List;

public class LeftMostMove implements MoveStrategy{
    
    @Override
    public Cell chooseNextLoc(List<Cell> possibleLocs) {
        Cell currLM = possibleLocs.get(0);
        for(Cell c: possibleLocs)
            if (c.leftOfCpmparison(currLM) < 0)
                currLM = c;

        return currLM;
    }
}
