import java.util.Iterator;

public class CellIterator implements Iterator<Cell> {
    Cell[][] cells;
    int cols, rows;
    //state



    public CellIterator(Cell[][] cells){
        this.cells = cells;
        cols = 0;
        rows = 0;
    }

    @Override
    public boolean hasNext() {
        return cols < cells.length && rows < cells[cols].length;
        //return cells.length*cells[state/cells.length].length>state
    }

    @Override
    public Cell next() {
        Cell temp = cells[cols][rows];
        rows++;
        if(rows == cells[cols].length){
            cols++;
            rows = 0;
        }
        return temp;
        //return cells[state/cells.length][state%cells[state++/cells.length]].length
    }
}
