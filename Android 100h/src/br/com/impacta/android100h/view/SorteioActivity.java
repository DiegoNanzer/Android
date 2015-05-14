package br.com.impacta.android100h.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
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
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sorteio, menu);
		return true;
	}

	class ButtonSorteio implements OnClickListener {

		@Override
		public void onClick(View v) {
			ctrlSorteio.Next();
			lblView.setText("Resultado: " + ctrlSorteio.getResultado());
		}

	}

}
