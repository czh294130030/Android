package com.example.androidapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*捕捉android.intent.action.BOOT_COMPLETED的Receiver类1*/
public class StartupIntentReceiver extends BroadcastReceiver{
	
	@Override
	public void onReceive(Context context, Intent intent){
		/*当收到Receiver时，指定打开此程序*/
		Intent mBootIntent=new Intent(context,MainActivity.class);
		mBootIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(mBootIntent);
	}
}
