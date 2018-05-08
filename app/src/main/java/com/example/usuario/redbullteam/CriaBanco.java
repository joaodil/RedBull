package com.example.usuario.redbullteam;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Usuario on 14/01/2018.
 */

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO= "banco.db";
    static final String TABELAJ="jogador";
    /*static final String TABELAG="gols";
    static final String TABELAJOGOS="jogos";*/
    static final String ID = "_id";
    static final String NOME= "nome";
    static final String APELIDO= "apelido";
    static final String TELEFONE= "telefone";
    static final String POSICAO= "posicao";
    static final String CAMISA= "camisa";
    /*static final String GOLS= "gols";
    static final String DATA= "data";
    static final String HORA= "hora";
    static final String LOCAL= "local";
    static final String ADVERSARIO= "adversario";*/
    private static final int VERSAO= 1;

    public CriaBanco(Context context){

        super(context,NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE "+TABELAJ+" ("+
                ID+ " integer primary key autoincrement,"+
                NOME+ " varchar(50),"+
                APELIDO+ " varchar(50),"+
                TELEFONE+ " int(9),"+
                CAMISA+ " int(3),"+
                POSICAO+ " varchar(50))";
        //" PRIMARY KEY ("+ID+"))";

        /*String sqlG = "CREATE TABLE "+TABELAG+" ("+
                ID+ " integer primary key autoincrement,"+
                APELIDO+ " varchar(50),"+
                GOLS+ " int(5))";
        //" PRIMARY KEY ("+ID+"))";

        String sqlJOGOS = "CREATE TABLE "+TABELAJOGOS+" ("+
                ID+ " integer primary key autoincrement,"+
                DATA+ " date,"+
                HORA+ " varchar(50),"+
                LOCAL+ " varchar(30),"+
                ADVERSARIO+ " varchar(50))";
        //" PRIMARY KEY ("+ID+"))";*/

        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABELAJ);
        onCreate(sqLiteDatabase);
        /*sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABELAG) ;
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABELAJOGOS) ;*/

    }



}
