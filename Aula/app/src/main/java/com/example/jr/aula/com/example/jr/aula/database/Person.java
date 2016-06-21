package com.example.jr.aula.com.example.jr.aula.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by junior on 04/06/2016.
 * This class is responsable for retrive data of Person
 */
public class Person {
        public static final String TABLENAME = "Person";
        private DataBase dataset = null;
        public Integer id;
        private String name;
        private String address;
        private String cpf;
        private Date dateBirth;
        private ArrayList<Phone> phones = new ArrayList<>();

    /**
     * This construtor is responsable for create database
     * @param dataset object
     */
    public Person(DataBase dataset){
        this.dataset = dataset;
    }

    /**
     * This construtor is responsable for create a new object
     * @param name
     * @param address
     * @param cpf
     * @param dateBirth
     */
    public Person(String name,String address,String cpf,Date dateBirth){
        this.name      = name;
        this.address   = address;
        this.cpf       = cpf;
        this.dateBirth = dateBirth;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method is responsable for add new phone
     * @param phone
     */
    public void addPhone(Phone phone){
        this.phones.add(phone);
    }

    /**
     * This method is responsable for save this person in database
     * @return long with indicate: -1 for problem for save or diferent f -1 for process is 'OK'
     */
    public Long save() throws Exception{
        Long result;
        // Create acess to database insert
        SQLiteDatabase dataBase = this.dataset.getWritableDatabase();
        // Object for set values of paramenters
        ContentValues values = new ContentValues();
        // Puting the values
        values.put("name",this.name);
        values.put("address",this.address);
        values.put("dateBirth",this.dateBirth.getTime());
        values.put("cpf",this.cpf);
        // insert values in database, and capture index or primary key
        result = dataBase.insert( TABLENAME , null, values);

        //Save the all phones this person
        for(Phone phone :phones){
            phone.setIdPerson(Integer.valueOf(result.toString()));
        }
        return result;
    }

    /**
     * This method is responsable for return the list of person
     * @return ArrayList of Object Person
     * @throws Exception
     */
    public ArrayList<Person> list()throws Exception{

        //Create a list of person
        ArrayList<Person> persons = new ArrayList<>();

        //Create a Object for reading of dataBase
        SQLiteDatabase database = dataset.getReadableDatabase();

        //Return the pointer for prior the first result of query
        Cursor cursor = database.rawQuery("SELECT * FROM "+TABLENAME , null);

        //Move for to first line
        cursor.moveToFirst();

        //Capture all lines from query
        for(int i = 0; i < cursor.getCount(); i++){
            //Get and Create new Object
            Person person = new Person( cursor.getString(1) , cursor.getString(4), cursor.getString(3), new Date(cursor.getLong(2)) );
            person.id = cursor.getInt(0);
            //Add new Person in list
            persons.add(person);
            //Move for next line
            cursor.moveToNext();
        }
            //Close the cursor
            cursor.close();

        return persons;
    }

    /**
     * This method is responsable for remove one line from database
     * @param id is a primary key
     */
    public void delete(Integer id) throws Exception{

        SQLiteDatabase database = dataset.getWritableDatabase();
        String where[] = new String[]{id.toString()};
        database.delete(this.TABLENAME,"_id = ?",where);
    }

    /**
     * This method is responsable for update this line in database
     * @throws Exception
     */
    public void update(Integer id,ContentValues value) throws Exception{
        SQLiteDatabase database =  dataset.getWritableDatabase();
        database.update(this.TABLENAME, value, "_id = ?", new String[]{id.toString()});
    }
}
