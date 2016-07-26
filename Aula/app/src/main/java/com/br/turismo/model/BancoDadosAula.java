package com.br.turismo.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Note on 24/07/2016.
 */
public class BancoDadosAula extends SQLiteOpenHelper {
    public static final String NAMEDATABASE = "Aula";
    public static final Integer VERSION = 2;

    public BancoDadosAula(Context context){

        super(context, NAMEDATABASE, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE usuario (_id INTEGER PRIMARY KEY, name TEXT, sexo Text, email TEXT, login TEXT, senha TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("CREATE TABLE usuario (_id INTEGER PRIMARY KEY, name TEXT, email TEXT, login TEXT, senha TEXT)");
    }
}
