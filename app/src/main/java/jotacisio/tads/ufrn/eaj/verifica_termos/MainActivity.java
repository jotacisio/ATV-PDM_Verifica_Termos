package jotacisio.tads.ufrn.eaj.verifica_termos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;




public class MainActivity extends AppCompatActivity {
    Button b;
    CheckBox c;
    RadioGroup rg;
    boolean marcado;
    RadioButton rbNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.button);
        c = (CheckBox) findViewById(R.id.checkBox);
        rg = (RadioGroup) findViewById(R.id.radiogroup1);
        rbNao = (RadioButton) findViewById(R.id.rbtn2);
        b.setOnClickListener(meu_onclick);

    }
    private View.OnClickListener meu_onclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (marcado == c.isChecked())
            {
                Toast.makeText(MainActivity.this, "Os emails são legais :) !", Toast.LENGTH_SHORT).show();
            }

            if (R.id.rbtn2 == rg.getCheckedRadioButtonId())
            {
                Toast.makeText(MainActivity.this, "Nada foi enviado", Toast.LENGTH_SHORT).show();
            }
        }
    };

    /*public void clicaBotao(View v){
        boolean marcado = c.isChecked();

        if (marcado == false)
        {
            Toast.makeText(MainActivity.this, "os emails são legais", Toast.LENGTH_SHORT).show();
        }

        if (R.id.radiogroup1 == rg.getCheckedRadioButtonId())
        {
            Toast.makeText(MainActivity.this, "Nada foi enviado", Toast.LENGTH_SHORT).show();
        }
    }*/

}
