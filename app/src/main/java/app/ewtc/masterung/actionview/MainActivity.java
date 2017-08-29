package app.ewtc.masterung.actionview;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private String urlString = "http://www.inspectorrta.org/IGD2017/";
    private int anInt = 0;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            myIntentToActionView();
        }

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setProgress(0);

        myLoop();

    }   // Main Method

    @Override
    protected void onResume() {
        super.onResume();

    }

    private void myDelay() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                myLoop();
            }
        }, 200);
    }

    private void myLoop() {
        //Todo
        //Increase Integer
        anInt += 5;

        //Check Integer
        if (anInt > 100) {
            myIntentToActionView();
        }

        progressBar.setProgress(anInt);

        myDelay();
    }

    private void myIntentToActionView() {
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse(urlString));
//        startActivity(intent);

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("URL", urlString);
        startActivity(intent);

        finish();
    }
}   // Main Class
