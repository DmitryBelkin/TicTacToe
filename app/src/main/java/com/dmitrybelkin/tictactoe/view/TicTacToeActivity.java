package com.dmitrybelkin.tictactoe.view;

import com.dmitrybelkin.tictactoe.MyActivity;

import static com.dmitrybelkin.tictactoe.MyIntent.EXTRA_ENEMY_ID;

import android.content.Intent;
import android.os.Bundle;

import android.databinding.DataBindingUtil;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.dmitrybelkin.tictactoe.R;
import com.dmitrybelkin.tictactoe.databinding.TictactoeBinding;
import com.dmitrybelkin.tictactoe.viewmodel.TicTacToeViewModel;

public class TicTacToeActivity extends MyActivity {

    TicTacToeViewModel viewModel = new TicTacToeViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TictactoeBinding binding = DataBindingUtil.setContentView(this, R.layout.tictactoe);
        binding.setViewModel(viewModel);
        viewModel.onCreate();

        int enemyId = getIntent().getIntExtra(EXTRA_ENEMY_ID, 1);
        viewModel.onEnemyChanged(enemyId);
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tictactoe, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new_game:
                viewModel.onNewGameSelected();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
