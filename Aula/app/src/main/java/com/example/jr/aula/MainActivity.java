package com.example.jr.aula;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jr.aula.com.example.jr.aula.database.DataBase;
import com.example.jr.aula.com.example.jr.aula.database.Person;
import com.example.jr.aula.com.example.jr.aula.database.Phone;
import com.example.jr.aula.com.example.jr.aula.intents.TestarIntent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MainActivity extends AppCompatActivity {

    private EditText name,cpf,address,phone;
    private Button dateBirth;
    private DataBase dataBase = null;
    private Integer day, month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the database
        this.dataBase = new DataBase(this);
        // Create a link activity and layout
        name      = (EditText)findViewById(R.id.name);
        cpf       = (EditText)findViewById(R.id.cpf);
        address   = (EditText)findViewById(R.id.address);
        phone     = (EditText)findViewById(R.id.phone);
        dateBirth = (Button)findViewById(R.id.buttonDate);

        //Create a date objet
        Calendar calendar =  Calendar.getInstance();
        this.day   = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH);
        this.year  = calendar.get(Calendar.YEAR);

        //Update date of Button
        dateBirth.setText(this.day+"/"+(this.month+1)+"/"+this.year);
    }



    /**
     * This method is responsable for save data in dadabase
     * @param view
     */
    public void saveData(View view) {
        //Create a format for date
        SimpleDateFormat dateFormat;
        Date date = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            date = dateFormat.parse(this.dateBirth.getText().toString());
        }catch(Exception ex){
            Toast.makeText(this, "Problemas-Converter: string-date: "+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }

        Person person = new Person(dataBase);
        Phone pho   = new Phone(dataBase);

        pho.setNumber(phone.getText().toString());
        pho.setType(0);

        person.setName(name.getText().toString());
        person.setAddress(address.getText().toString());
        person.setCpf(cpf.getText().toString());
        person.setDateBirth(date);

        person.addPhone(pho);

        try {
                person.save();
                Toast.makeText(this, "Salvo com sucesso!", Toast.LENGTH_SHORT).show();
        }catch(Exception ex){
            Toast.makeText(this, "Problemas-salvar: "+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method is responsable for listing names save in database
     * @param view
     */
    public void listNames(View view){

        Person person = new Person(this.dataBase);
        try{
              //Capture the list of Names
              ArrayList<Person> persons = person.list();
              String[] lists = new String[persons.size()];
              for(int i =0; i < persons.size();i++){
                  lists[i] = persons.get(i).getName();
              }
              //Create a Intent for showing the result
              Intent intent = new Intent(this, TestarIntent.class);
              Bundle bundle = new Bundle();
              bundle.putStringArray("Names",lists);
              intent.putExtras(bundle);
              //Called a new Activity
              startActivity(intent);
        }catch(Exception ex){
            Toast.makeText(this, "Problemas-Listar-Nomes: "+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void listar(View vies){
        SQLiteDatabase dataSet = this.dataBase.getReadableDatabase();


        Cursor cursor = dataSet.rawQuery("SELECT * FROM com.br.turismo.model.Login", null);
        String[] lista = new String[cursor.getCount()];

        cursor.moveToFirst();
        for(int i = 0; i < cursor.getCount();i++){
            lista[i] = cursor.getString(1);
            cursor.moveToNext();
        }
        cursor.close();
        Intent intent = new Intent(this,TestarIntent.class);
        Bundle bundle = new Bundle();
        bundle.putStringArray("com.br.turismo.model.Login",lista);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * This method is responsable for open new activity
     * @param view
     */
    public void openNewIntents(View view){
        Uri uri = Uri.parse("http://www.android.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    /**
     * This method is responsable for cancel this program
     * @param view
     */
    public void cancel(View view){

    }

    /**
     * This method is responsable fr selecting date oof user
     * @param view
     */
    public void selectDate(View view){
        showDialog(view.getId());
    }
    @Override
    protected Dialog onCreateDialog(int id){
        if(R.id.buttonDate == id){
            return new DatePickerDialog(this, listener,year,month,day);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int yearT, int monthOfYear, int dayOfMonth) {
            year = yearT;
            month = monthOfYear;
            day   = dayOfMonth;
            dateBirth.setText(day+"/"+(month+1)+"/"+year);
        }
    };

    /**
     * This method is responsable for close connection
     */
    @Override
    protected void onDestroy(){
        this.dataBase.close();
        super.onDestroy();
    }

    public void save(View view){
        try {
            SQLiteDatabase dataset = this.dataBase.getWritableDatabase();
            ContentValues values = new ContentValues();

            values.put("com.br.turismo.model.Login",name.getText().toString());
            values.put("Senha",cpf.getText().toString());

            Long id = dataset.insert("com.br.turismo.model.Login", null, values);
            Toast.makeText(this,"inserido com sucesso: "+ String.valueOf(id),Toast.LENGTH_LONG).show();
        }catch (Exception  ex){
            Toast.makeText(this,"Problemas: "+ ex.getMessage(),Toast.LENGTH_LONG).show();
        }

    }
}
