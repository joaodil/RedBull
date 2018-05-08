package com.example.usuario.redbullteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    ImageView imgLogo;
    EditText etNome, etApelido, etTelefone, etCamisa, etPosicao;
    Button btCadastrar;

    public void carregaElementos(){
        imgLogo = (ImageView) findViewById(R.id.im_logo);
        etNome = (EditText) findViewById(R.id.et_nome);
        etApelido = (EditText) findViewById(R.id.et_apelido);
        etTelefone = (EditText) findViewById(R.id.et_fone);
        etCamisa = (EditText) findViewById(R.id.et_camisa);
        etPosicao = (EditText) findViewById(R.id.et_posicao);
        btCadastrar = (Button) findViewById(R.id.bt_cadastrar);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        carregaElementos();
        Cadastrar();
    }

    public void Cadastrar(){

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BancoController crud= new BancoController(getBaseContext());
                String nome = etNome.getText().toString();
                String apelido = etApelido.getText().toString();
                int telefone = Integer.parseInt(etTelefone.getText().toString());
                int camisa = Integer.parseInt(etCamisa.getText().toString());
                String posicao = etPosicao.getText().toString();
                String resultado;
                resultado = crud.InsereJogador(nome, apelido, telefone, camisa, posicao);
                Toast.makeText(CadastroActivity.this,resultado,Toast.LENGTH_LONG).show();
            }
        });

    }
}
