package com.dmitrybelkin.tictactoe.view;

import com.dmitrybelkin.tictactoe.MyActivity;
import com.dmitrybelkin.tictactoe.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends MyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity);

        final Button mBtLaunchChooseEnemyActivity = (Button) findViewById(R.id.start);

        mBtLaunchChooseEnemyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivityMediator().showEnemy();
            }
        });
    }

}
