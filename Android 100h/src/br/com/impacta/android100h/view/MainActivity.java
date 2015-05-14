package br.com.impacta.android100h.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.com.impacta.android100h.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setButtonOnClickAction(R.id.btGojeta, GorjetaActivity.class);
		setButtonOnClickAction(R.id.btSorteio, SorteioActivity.class);
		
	}

	private void setButtonOnClickAction(int id, Class<?> _class ) {

		Button b = (Button) findViewById(id);
		b.setOnClickListener(new ButtonNext(_class ));
	
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	private class ButtonNext implements OnClickListener {
		
		private Class<?> _target;
		
		public ButtonNext(Class<?> pTarget )
		{
			this._target = pTarget;
		}
		
		@Override
		public void onClick(View v) {

			Intent intent = new Intent(MainActivity.this, this._target );
			startActivity(intent);
		}
	}
}
