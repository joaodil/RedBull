package com.example.usuario.redbullteam;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Usuario on 15/01/2018.
 */

public class BancoController {
    private SQLiteDatabase db;
    private CriaBanco banco;

    public BancoController(Context context){

        banco = new CriaBanco(context);
    }

    public String InsereJogador (String nome, String apelido, int telefone, int camisa, String posicao ){
        ContentValues valores;
        long resultado;

        db=banco.getWritableDatabase();
        valores = new ContentValues();

        valores.put(CriaBanco.NOME,nome);
        valores.put(CriaBanco.APELIDO,apelido);
        valores.put(CriaBanco.TELEFONE,telefone);
        valores.put(CriaBanco.CAMISA,camisa);
        valores.put(CriaBanco.POSICAO,posicao);

        resultado=db.insert(CriaBanco.TABELAJ,null,valores);
        db.close();

        if(resultado==-1){
            return "ERRO AO INSERIR";
        } else {
            return "INSERIDO";
        }
    }
}
