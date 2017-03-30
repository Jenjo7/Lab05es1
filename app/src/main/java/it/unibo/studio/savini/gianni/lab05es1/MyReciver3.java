package it.unibo.studio.savini.gianni.lab05es1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by gianni.savini on 30/03/2017.
 */
public class MyReciver3 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Log.i("MyReciver", "Ricevuto Intent");
        int resultCode = getResultCode();
        Log.i("MyReciver", "Ricevuto Intent" + String.valueOf(resultCode));
        String resultData = getResultData();
        Log.i("MyReciver", "Ricevuto Intent" + resultData);

        setResultCode(3);
        setResultData("Fonte3");

        String extra;
        Bundle bundle = intent.getExtras();
        if(bundle != null) {
            extra = bundle.getString(MainActivity.EXTRA);
            Log.i("MyReciver", extra);

            extra += "- 1";

            bundle.putString(MainActivity.EXTRA, extra);
            setResultExtras(bundle);
        }


        if(intent.hasExtra(MainActivity.EXTRA)) {
            Log.i("MyReciver", "Messaggio: " + intent.getStringExtra(MainActivity.EXTRA));
        }
    }
}
