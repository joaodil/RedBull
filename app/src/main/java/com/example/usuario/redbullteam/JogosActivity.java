package com.example.usuario.redbullteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class JogosActivity extends AppCompatActivity {

    ImageView imgLogo;
    EditText etData, etHora, etLocal, etAdversario;
    Button btMarcar, btJgMarcados;

    public void carregaElementos(){
        imgLogo = (ImageView) findViewById(R.id.im_logo);
        etData = (EditText) findViewById(R.id.et_data);
        etHora = (EditText) findViewById(R.id.et_hora);
        etLocal = (EditText) findViewById(R.id.et_local);
        etAdversario = (EditText) findViewById(R.id.et_adv);
        btMarcar = (Button) findViewById(R.id.bt_marcar);
        btJgMarcados = (Button) findViewById(R.id.bt_jgmarcados);
    }

    public void IrJogosMarcados(){
        btJgMarcados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        JogosActivity.this,JogosMarcadosActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogos);
        carregaElementos();
        IrJogosMarcados();
    }
}
