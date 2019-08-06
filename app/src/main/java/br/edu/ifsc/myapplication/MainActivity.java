package br.edu.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {

        EditText valor1 = findViewById(R.id.editText4);
        EditText valor2 = findViewById(R.id.editText5);
        TextView resultado = findViewById(R.id.resultado);

        int iValor1 = Integer.parseInt(valor1.getText().toString());
        int iValor2 = Integer.parseInt(valor2.getText().toString());
        int valorSort = (iValor2 - iValor1)+1;
        Random rand = new Random();
        int resultadoFinal = rand.nextInt(valorSort)+iValor1;
        resultado.setText(String.valueOf(resultadoFinal));

    }
}
