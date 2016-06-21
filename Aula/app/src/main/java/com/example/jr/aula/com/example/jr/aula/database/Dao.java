package com.example.jr.aula.com.example.jr.aula.database;

import android.content.ContentValues;

/**
 * Created by junior on 13/06/2016.
 * This class is responsable for conection with database
 */
public class Dao {

    private DataBase dataSet = null;
    public Dao(DataBase dataSet){
        this.dataSet = dataSet;
    }

    /**
     * This method is responsable for insert new data
     * @param values
     */
    public void insert(ContentValues values){

    }

    public void delete(ContentValues values){

    }
}
