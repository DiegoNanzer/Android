package br.com.impacta.android100h.view;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import br.com.impacta.android100h.R;
import br.com.impacta.android100h.controller.GorjetaController;
import br.com.impacta.android100h.domain.model.Gorjeta;
import br.com.impacta.android100h.pattern.SeekBarChangedAdapter;
import br.com.impacta.android100h.pattern.TextWatcherAdapter;

public class GorjetaActivity extends Activity {

	GorjetaController ctr;
	EditText txtValorConta, txtValorGorjeta, txtValorTotal;
	TextView lblPercentagemTextView;
	SeekBar sk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gorjeta);

		txtValorConta = (EditText) findViewById(R.id.txtValorConta);
		txtValorConta.addTextChangedListener(new TextChanged());
		
		txtValorGorjeta = (EditText) findViewById(R.id.txtGorjeta);
		txtValorTotal = (EditText) findViewById(R.id.txtValorTotal);

		lblPercentagemTextView = (TextView) findViewById(R.id.lblPorcentagem);

		lblPercentagemTextView.setText("0%");

		sk = (SeekBar) findViewById(R.id.skPorcentagem);
		sk.setOnSeekBarChangeListener(new SeekChange());

		ctr = new GorjetaController();

	}

	void setValuesView(double valorConta, double percentual) {
		Gorjeta gorjeta = ctr.CalcularGorjeta(valorConta, percentual);

		lblPercentagemTextView.setText(String.valueOf(percentual) + " %");
		txtValorGorjeta.setText(String.valueOf(gorjeta.getValorGorjeta()));
		txtValorTotal.setText(String.valueOf(gorjeta.getValorTotal()));
	}

	private class SeekChange extends SeekBarChangedAdapter {

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			try {

				double valorConta = Double.parseDouble(txtValorConta.getText()
						.toString());
				double percentual = Double
						.parseDouble(String.valueOf(progress));
				setValuesView(valorConta, percentual);
			} catch (Exception e) {
				Toast toast = Toast.makeText(getApplicationContext(),
						"Não foi possível calcular", Toast.LENGTH_LONG);
				toast.show();
			}
		}
	}

	private class TextChanged extends TextWatcherAdapter {
		@Override
		public void onTextChanged(CharSequence s, int start, int before,
				int count) {
			try {
				double valorConta = Double.parseDouble(s.toString());
				double percentual = Double.parseDouble(String.valueOf(sk
						.getProgress()));

				setValuesView(valorConta, percentual);
				
			} catch (Exception e) {
				Toast toast = Toast.makeText(getApplicationContext(),
						"Não foi possível calcular", Toast.LENGTH_LONG);
				toast.show();
			}
			super.onTextChanged(s, start, before, count);
		}

	}

}
