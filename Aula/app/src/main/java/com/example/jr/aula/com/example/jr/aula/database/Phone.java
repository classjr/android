package com.example.jr.aula.com.example.jr.aula.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by junior on 04/06/2016.
 * This class is responsable for keep number phone
 */
public class Phone {
    public static final String TABLENAME = "Phone";
    private DataBase dataSet;

    private Integer type;
    private String number;
    private Integer idPerson;

    /**
     * This cnstrutor is responsable for
     * @param dataSet
     */
    public Phone(DataBase dataSet){
        this.dataSet = dataSet;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * This method is responsable for save this Phone in database
     * @return long with indicate: -1 for problem for save or diferent f -1 for process is 'OK'
     * @throws Exception
     */
    public Long save()throws Exception{

        SQLiteDatabase database = dataSet.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("type",this.type);
        values.put("number",this.number);
        values.put("id_Person",this.idPerson);
        return database.insert(TABLENAME, null, values);
    }
}
