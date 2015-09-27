package com.example.jola.tutorialorderdbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Jola on 9/27/2015.
 */
public class Receiver1 extends BroadcastReceiver{

    private final String TAG = "Receiver1";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Intent received by Receiver1");
        //public final String getResultData()
       // Retrieve the current result data, as set by the previous receiver.
        String msg = getResultData() == null ? " " : getResultData();
        //public final void	setResultData(String data)
        //This method does not work with non-ordered broadcasts such as those sent with Context.sendBroadcast
        //Change the current result data of this broadcast; only works with broadcasts sent through Context.sendOrderedBroadcast.
        setResultData( msg + "Receiver1");
    }
}
