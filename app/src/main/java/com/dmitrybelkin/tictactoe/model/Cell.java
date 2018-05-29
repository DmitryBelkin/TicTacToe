package com.dmitrybelkin.tictactoe.model;

public class Cell {

    private Player value;
    private int row;
    private int column;

    public Player getValue () { return value;  }
    public int    getRow   () { return row;    }
    public int    getColumn() { return column; }

    public void setValue (Player value ) { this.value  = value;  }
    public void setRow   (int    row   ) { this.row    = row;    }
    public void setColumn(int    column) { this.column = column; }
}
