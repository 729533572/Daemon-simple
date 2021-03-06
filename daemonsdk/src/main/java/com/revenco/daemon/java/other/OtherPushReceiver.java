package com.revenco.daemon.java.other;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.revenco.daemon.DaemonManager;
import com.revenco.daemon.utils.XLog;

/**
 * 接收第三方推送的广播，以唤醒APP
 */
public class OtherPushReceiver extends BroadcastReceiver {
    private static final String TAG = "OtherPushReceiver";

    public OtherPushReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null)
            XLog.log2Sdcard(TAG, "OtherPushReceiver -> ACTION = " + intent.getAction());
        DaemonManager.INSTANCE.SendSDKWakeUpBroadcast(context,intent);
    }
}
