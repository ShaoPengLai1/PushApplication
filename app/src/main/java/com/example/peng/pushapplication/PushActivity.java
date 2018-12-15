package com.example.peng.pushapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

/**
 * @author Peng
 */
public class PushActivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            Bundle bundle=intent.getExtras();
            if ("cn.jpush.android.intent.NOTIFICATION_OPENED".equals(intent.getAction())){

                Intent intent1=new Intent(context,Main2Activity.class);
              // intent1.putExtras(bundle);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                context.startActivity(intent1);
            }

        }catch (Exception e){
                    e.printStackTrace();
        }
    }
}
