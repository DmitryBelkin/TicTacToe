package com.dmitrybelkin.tictactoe;

import android.support.v7.app.AppCompatActivity;

public abstract class MyActivity extends AppCompatActivity {
	
	private MyActivityMediator mActivityMediator = new MyActivityMediator(this);
	
	public MyActivityMediator getActivityMediator(){
		return mActivityMediator;
	}

}
