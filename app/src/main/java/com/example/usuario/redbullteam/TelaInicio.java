package com.example.usuario.redbullteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaInicio extends AppCompatActivity {

    ImageView ImgLogo;
    Button btTime, btCad, btGols, btJogos;

    public void carregaElementos(){
        ImgLogo = (ImageView) findViewById(R.id.im_logo);
        btCad = (Button) findViewById(R.id.bt_cad);
        btGols = (Button)findViewById(R.id.bt_gols);
        btJogos = (Button) findViewById(R.id.bt_jogos);
        btTime = (Button) findViewById(R.id.bt_time);

    }

    public void irTime(){
        btTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        TelaInicio.this,TimeActivity.class);
                startActivity(intent);
            }
        });

    }
    public void irCadastro(){
        btCad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        TelaInicio.this,CadastroActivity.class);
                startActivity(intent);
            }
        });

    }

    public void irGols(){
        btGols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        TelaInicio.this,Gols2Activity.class);
                startActivity(intent);
            }
        });

    }

    public void irJogos(){
        btJogos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        TelaInicio.this,JogosActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicio);
        carregaElementos();
        irCadastro();
        irGols();
        irJogos();
        irTime();
    }
}
