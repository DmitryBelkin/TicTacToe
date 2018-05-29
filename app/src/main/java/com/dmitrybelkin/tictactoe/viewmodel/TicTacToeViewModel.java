package com.dmitrybelkin.tictactoe.viewmodel;

import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;

import com.dmitrybelkin.tictactoe.model.Board;
import com.dmitrybelkin.tictactoe.model.Player;
import com.dmitrybelkin.tictactoe.model.Cell;

public class TicTacToeViewModel implements ViewModel {

    private Board model;

    public final ObservableArrayMap<String, String> cells = new ObservableArrayMap<>();
    public final ObservableField<String > winner    = new ObservableField<>();
    public final ObservableField<Integer> xWinCount = new ObservableField<>();
    public final ObservableField<Integer> yWinCount = new ObservableField<>();

    public TicTacToeViewModel() {
        model = new Board();
        xWinCount.set(0); // I know that it's not very good solution but it was quicker
        yWinCount.set(0); // further I'll improve it
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onNewGameSelected() {
        model.restart();
        winner.set(null);
        cells.clear();
    }

    public void onEnemyChanged(int enemyId) {
        model.setEnemyId(enemyId);
    }

    public void onClickedCellAt(int row, int col) {
        if (!cells.containsKey("" + row + col)) // prevent duplicate click
        {
            Cell playerCell = model.mark(row, col);
            processCell(playerCell);

            if (model.getEnemyId() == 0 && winner.get() == null) { // computer move
                Cell enemyCell = model.makeMove();
                processCell(enemyCell);
            }

            if (winner.get() == "X") xWinCount.set(xWinCount.get() + 1); // make statistics
            if (winner.get() == "O") yWinCount.set(yWinCount.get() + 1);
        }
    }

    private void processCell(Cell cell)
    {
        Player playerThatMoved = cell.getValue();
        cells.put("" + cell.getRow() + cell.getColumn(), playerThatMoved == null ? null : playerThatMoved.toString());
        winner.set(model.getWinner() == null ? null : model.getWinner().toString());
    }

}
