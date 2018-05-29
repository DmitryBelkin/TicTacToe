package com.dmitrybelkin.tictactoe;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;

public class ActivityMediator {
	
	private Activity mActivity;
	
	public ActivityMediator(Activity activity){
		mActivity = activity;
	}
	
	protected void startActivity(Class<?> cls){
		Intent intent = new Intent(mActivity, cls);
		mActivity.startActivity(intent);
	}
	
	protected void startActivity(Class<?> cls, Bundle extras){
		Intent intent = new Intent(mActivity, cls);
		intent.replaceExtras(extras);
		mActivity.startActivity(intent);
	}

}
