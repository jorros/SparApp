package de.sparapp.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import de.sparapp.R;

public class SplashScreenActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreenActivity.this, TutorialActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
