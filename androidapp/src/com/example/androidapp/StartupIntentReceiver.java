package com.example.androidapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/*��׽android.intent.action.BOOT_COMPLETED��Receiver��*/
public class StartupIntentReceiver extends BroadcastReceiver{
	
	@Override
	public void onReceive(Context context, Intent intent){
		/*���յ�Receiverʱ��ָ���򿪴˳���*/
		Intent mBootIntent=new Intent(context,MainActivity.class);
		mBootIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(mBootIntent);
	}
}
