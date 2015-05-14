package br.com.impacta.android100h.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import br.com.impacta.android100h.R;

public class SplashActivity extends Activity {

	private Handler h;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		h = new Handler();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		h.postDelayed(new Runnable() {
			
			@Override
			public void run() {
						
				startActivity(new Intent(SplashActivity.this , MainActivity.class));
				
			}
		}, 3000);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
