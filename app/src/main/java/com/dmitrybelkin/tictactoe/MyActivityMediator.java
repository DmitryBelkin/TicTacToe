package com.dmitrybelkin.tictactoe;

import android.app.Activity;
import android.os.Bundle;

import com.dmitrybelkin.tictactoe.view.StartActivity;
import com.dmitrybelkin.tictactoe.view.ChooseEnemyActivity;
import com.dmitrybelkin.tictactoe.view.TicTacToeActivity;

public class MyActivityMediator extends ActivityMediator {

	public MyActivityMediator(Activity activity){
		super(activity);
	}

	public void showStart() { startActivity(      StartActivity.class); }
	public void showEnemy() { startActivity(ChooseEnemyActivity.class); }

	public void showTicTacToe(int enemyId) {
		Bundle bundle = new Bundle();
		bundle.putInt(MyIntent.EXTRA_ENEMY_ID, enemyId);
		startActivity(TicTacToeActivity.class, bundle);
	}

}
