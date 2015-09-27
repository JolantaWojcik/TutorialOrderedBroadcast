package com.example.jola.tutorialorderdbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Jola on 9/27/2015.
 */
public class Receiver3 extends BroadcastReceiver{

    private final String TAG = "Receiver3";

    //static manifest security:
    //To prevent others from sending to it, make it unavailable to them with android:exported="false".

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Intent received by Receiver3");
        String msg = getResultData() == null ? " " : getResultData();
        setResultData( msg + "Receiver3 ");
    }
}
