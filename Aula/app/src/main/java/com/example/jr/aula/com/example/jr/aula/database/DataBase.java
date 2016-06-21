package com.example.jr.aula.com.example.jr.aula.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by junior on 04/06/2016.
 * This class is responsable for connectiooo with database SQLite
 */
public class DataBase extends SQLiteOpenHelper {

    public static final String NAMEDATABASE = "Aula";
    public static final Integer VERSION = 1;

    public DataBase(Context context) {
        super(context, NAMEDATABASE , null, VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Let's go create a table called 'Person'
        db.execSQL("CREATE TABLE Person (_id INTEGER PRIMARY KEY, name TEXT, dateBirth DATE, cpf TEXT, address TEXT); ");

        //Let's go create a table called 'Phone'
        db.execSQL("CREATE TABLE Phone (_id INTEGER PRIMARY KEY, type_Phone INTEGER, number TEXT, id_Person INTEGER,"+
                " FOREIGN KEY(id_Person) REFERENCES Person(_id));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("ALTER TABLE Phone ADD COLUMN codeArea TEXT;");
    }
}
