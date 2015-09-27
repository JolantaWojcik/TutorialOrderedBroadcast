package com.example.jola.tutorialorderdbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String CUSTOM_INTENT = "com.example.jola.tutorialorderdbroadcast.show_toast";
    private final Receiver1 receiver1 = new Receiver1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter(CUSTOM_INTENT);
        intentFilter.setPriority(3);
        registerReceiver(receiver1, intentFilter);
    }

    public void sendBroadcas(View view) {
        sendOrderedBroadcast(new Intent(CUSTOM_INTENT), null, new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "Wynik to " + getResultData(), Toast.LENGTH_LONG).show();
            }
        }, null, 0, null, null);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver1);
        super.onDestroy();
    }
}
