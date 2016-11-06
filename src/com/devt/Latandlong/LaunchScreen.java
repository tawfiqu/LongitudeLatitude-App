package com.devt.Latandlong;

import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.location.Address;
import android.location.Geocoder;
import android.net.wifi.WifiConfiguration.Protocol;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;


public class LaunchScreen extends Activity {

	private static final int SPLASH_DISPLAY_TIME = 4000;

	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.logo);
	    
	    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

	    new Handler().postDelayed(new Runnable() {

	        public void run() {

	            Intent mainIntent = new Intent(LaunchScreen.this,
	                    MainActivity.class);
	            LaunchScreen.this.startActivity(mainIntent);

	            LaunchScreen.this.finish();
	        }
	    }, SPLASH_DISPLAY_TIME);
	  }
}
	