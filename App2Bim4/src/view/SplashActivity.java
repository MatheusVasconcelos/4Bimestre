package view;

import com.example.app2bim4.R;
import com.example.app2bim4.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity implements Runnable {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);

		Handler splash = new Handler();
		splash.postDelayed(SplashActivity.this, 4000);
	}

	public void run() {

		startActivity(new Intent(SplashActivity.this, MainActivity.class));
		finish();
	}
}
