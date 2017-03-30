package it.unibo.studio.savini.gianni.lab05es1;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_ACTION = "it.unibo.studio.savini.gianni.lab05es1.ACTION";
    public static final String EXTRA = "extra";

    private Button button;
    private MyReciver reciver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBroadcast = new Intent();
                intentBroadcast.setAction((INTENT_ACTION));
                intentBroadcast.putExtra(EXTRA, "Valore passato da MainActivity");

                /*
                * Di solito si usa il Bundle
                * */


                sendBroadcast(intentBroadcast);


            }
        });
    }

    @Override
    protected void onResume() {
        reciver = new MyReciver();
        registerReceiver(reciver, new IntentFilter((INTENT_ACTION)));
        super.onResume();
    }
}
