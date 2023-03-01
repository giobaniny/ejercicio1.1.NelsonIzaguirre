package tarea1.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSuma;
    private Button btnResta;
    private Button btnMultiplicacion;
    private Button btnDivicion;
    private TextView txtResultado;
    private EditText txtNumero1;
    private EditText txtNumero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText(suma(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        btnResta = findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText(resta(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText(multiplicacion(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        btnDivicion = findViewById(R.id.btnDivicion);
        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText(divicion(Integer.parseInt(txtNumero1.getText().toString()),Integer.parseInt(txtNumero2.getText().toString()))+"");
            }
        });
        txtResultado = findViewById(R.id.txtResultado);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);

    }

    public int suma(int x, int y){
    return x + y;
    }
    public int resta(int x, int y){
        return x - y;
    }
    public int multiplicacion(int x, int y){
        return (x*y);
    }
    public int divicion(int x, int y){
        return (x/y);
    }
}