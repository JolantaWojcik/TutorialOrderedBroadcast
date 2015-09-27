package com.example.jola.tutorialorderdbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Jola on 9/27/2015.
 */
public class Receiver2 extends BroadcastReceiver {

    private final String TAG = "Receiver2";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Intent received by Receiver2");
        String msg = getResultData() == null ? " " : getResultData();
        setResultData( msg + " Receiver2");
    }
}
