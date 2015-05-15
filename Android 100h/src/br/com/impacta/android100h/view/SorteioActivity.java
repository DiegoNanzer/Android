package br.com.impacta.android100h.view;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import br.com.impacta.android100h.R;
import br.com.impacta.android100h.controller.SorteioController;

public class SorteioActivity extends Activity {

	Button btSortear;
	TextView lblView;
	SorteioController ctrlSorteio;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sorteio);

		btSortear = (Button) findViewById(R.id.btSortear);
		lblView = (TextView) findViewById(R.id.lblResultSorteio);

		ctrlSorteio = SorteioController.getInstance(6);		
		btSortear.setOnClickListener(new ButtonSorteio());
		
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {

		//outState.putString(Keys.NUMEROS,"asda");
		super.onSaveInstanceState(outState);
	}
	
	@Override
	public void onBackPressed() {
		CharSequence t = this.getResources().getString(R.string.msgRetorno);
		Toast.makeText(this, t, Toast.LENGTH_LONG).show();
		super.onBackPressed();
	}
	
	@Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getNextValue();
    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_UP:
			getNextValue();	
			break;
		}
		
		return super.onTouchEvent(event);
	}

	class ButtonSorteio implements OnClickListener {

		@Override
		public void onClick(View v) {
			getNextValue();
		}

	}
	
	public void getNextValue() {
		ctrlSorteio.Next();
		lblView.setText("Resultado: " + ctrlSorteio.getResultado());
	}

}
