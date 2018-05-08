package com.example.usuario.redbullteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AlterarGolsActivity extends AppCompatActivity {

    ImageView imgLogo;
    EditText etApelido, etQtdGols;
    Button btAlterar;

    public void CarregaElementos(){
        imgLogo = (ImageView) findViewById(R.id.im_logo);
        etApelido = (EditText) findViewById(R.id.et_apelido);
        etQtdGols = (EditText) findViewById(R.id.et_qtdgols);
        btAlterar = (Button) findViewById(R.id.bt_alterar);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_gols);
        CarregaElementos();
    }
}
