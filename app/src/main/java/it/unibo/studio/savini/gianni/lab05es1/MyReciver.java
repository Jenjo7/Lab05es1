package it.unibo.studio.savini.gianni.lab05es1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by gianni.savini on 30/03/2017.
 */
public class MyReciver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("MyReciver", "Ricevuto Intent");
        if(intent.hasExtra(MainActivity.EXTRA)) {
            Log.i("MyReciver", "Messaggio: " + intent.getStringExtra(MainActivity.EXTRA));
        }
    }
}
