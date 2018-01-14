package mathdet.mathgadget.com.mathdet;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_2x2;
import mathdet.mathgadget.com.mathdet.Adjunta.Adj_Pasos_3x3;
import mathdet.mathgadget.com.mathdet.Determinante.Pasos3x3;

public class tres extends AppCompatActivity implements View.OnClickListener {

    private EditText X5, X6, X7, X8, X9, X10, X11, X12, X13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        Botones();
        X5.requestFocus();
    }

    private void Botones() {
        X5 = (EditText) findViewById(R.id.X5);
        X6 = (EditText) findViewById(R.id.X6);
        X7 = (EditText) findViewById(R.id.X7);
        X8 = (EditText) findViewById(R.id.X8);
        X9 = (EditText) findViewById(R.id.X9);
        X10 = (EditText) findViewById(R.id.X10);
        X11 = (EditText) findViewById(R.id.X11);
        X12 = (EditText) findViewById(R.id.X12);
        X13 = (EditText) findViewById(R.id.X13);
        findViewById(R.id.btnLimpiar).setOnClickListener(this);
        findViewById(R.id.btnResolver).setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnLimpiar:
                Limpiar();
                break;
            case R.id.btnResolver:
                Resolver();
                break;
        }

    }

    private void Limpiar() {
        X5.setText("");
        X6.setText("");
        X7.setText("");
        X8.setText("");
        X9.setText("");
        X10.setText("");
        X11.setText("");
        X12.setText("");
        X13.setText("");
        X5.requestFocus();
    }

    private void Resolver() {
        if (X5.getText().toString() == null || X5.getText().toString().equals("") || X6.getText().toString() == null || X6.getText().toString().equals("")
                || X7.getText().toString() == null || X7.getText().toString().equals("") || X8.getText().toString() == null || X8.getText().toString().equals("")
                || X10.getText().toString() == null || X10.getText().toString().equals("") || X9.getText().toString() == null || X9.getText().toString().equals("")
                || X11.getText().toString() == null || X11.getText().toString().equals("") || X12.getText().toString() == null || X12.getText().toString().equals("")
                || X13.getText().toString() == null || X13.getText().toString().equals("")) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("ERROR!");
            builder.setIcon(R.drawable.error);
            builder.setMessage("Ha Dejado Campos Vacios");
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.show();
        } else {
            final double x5, x6, x7, x8, x9, x10, x11, x12, x13;
            x5 = Double.parseDouble(X5.getText().toString());
            x6 = Double.parseDouble(X6.getText().toString());
            x7 = Double.parseDouble(X7.getText().toString());
            x8 = Double.parseDouble(X8.getText().toString());
            x9 = Double.parseDouble(X9.getText().toString());
            x10 = Double.parseDouble(X10.getText().toString());
            x11 = Double.parseDouble(X11.getText().toString());
            x12 = Double.parseDouble(X12.getText().toString());
            x13 = Double.parseDouble(X13.getText().toString());
            Intent intent = Opcion();
            intent.putExtra("x5", x5);
            intent.putExtra("x6", x6);
            intent.putExtra("x7", x7);
            intent.putExtra("x9", x9);
            intent.putExtra("x13", x13);
            intent.putExtra("x8", x8);
            intent.putExtra("x10", x10);
            intent.putExtra("x11", x11);
            intent.putExtra("x12", x12);
            intent.putExtra("Determinante", ((x5 * x9 * x13 + x8 * x12 * x7 + x11 * x6 * x10) - (x8 * x6 * x13 + x5 * x12 * x10 + x11 * x9 * x7)));
            intent.putExtra("Part1", (x5 * x9 * x13 + x8 * x12 * x7 + x11 * x6 * x10));
            intent.putExtra("Part2", (x8 * x6 * x13 + x5 * x12 * x10 + x11 * x9 * x7));
            startActivity(intent);
        }

    }

    private Intent Opcion() {
        Bundle o = getIntent().getExtras();
        switch (o.getInt("Opcion")) {
            case 1:
                return new Intent(getApplicationContext(), Pasos3x3.class);
            case 2:
                return new Intent(getApplicationContext(), Adj_Pasos_3x3.class);
            default:
                return new Intent(getApplicationContext(), Adj_Pasos_2x2.class);
        }
    }

}
