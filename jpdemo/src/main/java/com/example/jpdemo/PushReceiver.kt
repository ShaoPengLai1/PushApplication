package com.example.jpdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class PushReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        try {
            intent!!.getExtras()
            if ("cn.jpush.android.intent.NOTIFICATION_OPENED" == intent.getAction()) {

                val intent1 = Intent(context, Main2Activity::class.java)
                // intent1.putExtras(bundle);
                intent1.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                context!!.startActivity(intent1)
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}