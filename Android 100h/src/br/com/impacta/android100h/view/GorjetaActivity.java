package br.com.impacta.android100h.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import br.com.impacta.android100h.R;
import br.com.impacta.android100h.controller.GorjetaController;
import br.com.impacta.android100h.domain.model.Gorjeta;

public class GorjetaActivity extends Activity {

	EditText txtValorConta, txtValorGorjeta, txtValorTotal;
	TextView lblPercentagemTextView;
	SeekBar sk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gorjeta);

		txtValorConta = (EditText) findViewById(R.id.txtValorConta);
		txtValorGorjeta = (EditText) findViewById(R.id.txtGorjeta);
		txtValorTotal = (EditText) findViewById(R.id.txtValorTotal);
		

		txtValorGorjeta.setEnabled(false);
		txtValorTotal.setEnabled(false);
		
		lblPercentagemTextView = (TextView) findViewById(R.id.lblPorcentagem);

		lblPercentagemTextView.setText("0%");

		sk = (SeekBar) findViewById(R.id.skPorcentagem);
		sk.setOnSeekBarChangeListener(new SeekChange());

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gorjeta, menu);
		return true;
	}

	class SeekChange implements OnSeekBarChangeListener {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			
			try {
				
				lblPercentagemTextView.setText(String.valueOf(progress) + " %");
				
				double valorConta = Double.parseDouble(txtValorConta.getText().toString());
				double percentual = Double.parseDouble(String.valueOf(progress));
				
				GorjetaController ctr = new GorjetaController();
				Gorjeta gorjeta = ctr.CalcularGorjeta(valorConta, percentual);
				
				txtValorGorjeta.setText(String.valueOf( gorjeta.getValorGorjeta()));
				txtValorTotal.setText(String.valueOf( gorjeta.getValorTotal()));
				
				ctr = null;
				gorjeta = null;
			} catch (Exception e) {
				Toast toast = Toast.makeText(getApplicationContext(),"Não foi possível calcular" , Toast.LENGTH_LONG);
				toast.show();
			}
			
			
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub

		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub

		}

	}

}
