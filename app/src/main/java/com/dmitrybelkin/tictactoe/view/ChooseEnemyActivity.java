package com.dmitrybelkin.tictactoe.view;

import com.dmitrybelkin.tictactoe.MyActivity;
import com.dmitrybelkin.tictactoe.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseEnemyActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chooseenemyactivity);

        final Button mBtAndroidPlayer = (Button)findViewById(R.id.androidPlayer);
        final Button mBtHumanPlayer   = (Button)findViewById(R.id.  humanPlayer);

        mBtAndroidPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivityMediator().showTicTacToe(0);
            }
        });

        mBtHumanPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivityMediator().showTicTacToe(1);
            }
        });

    }
    
}
