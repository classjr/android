package com.br.turismo.control.cadastrar;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


import com.br.turismo.model.BancoDadosAula;
import com.br.turismo.model.Login;
import com.example.jr.aula.R;

public class CadastrarUsuario extends AppCompatActivity {

    private EditText cadName, cadLogin, cadSenha, cadEmail;
    private RadioButton cadSexo;
    private Button cadCadastrar, Cadcancelar;
    private BancoDadosAula bancoDadosAula = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);


        this.bancoDadosAula = new BancoDadosAula(this);

        cadName = (EditText)findViewById(R.id.nomeUsuario);
        //cadSexo = (RadioButton)findViewById(R.id.masculino);
        //cadSexo = (RadioButton)findViewById(R.id.feminino);
        cadEmail = (EditText)findViewById(R.id.emailUsuario);
        cadLogin = (EditText)findViewById(R.id.loginUsuario);
        cadSenha = (EditText)findViewById(R.id.senhaUsuario);

        cadCadastrar = (Button) findViewById(R.id.cadastrarBtn);

    }

    public void saveCadastroUsuario(View view){
        try {
            SQLiteDatabase banco = bancoDadosAula.getWritableDatabase();
            ContentValues value = new ContentValues();

            value.put("name", cadName.getText().toString());
            value.put("email", cadEmail.getText().toString());
            value.put("login", cadLogin.getText().toString());
            value.put("senha", cadSenha.getText().toString());

            Long retorno = banco.insert("usuario", null, value);
            Toast.makeText(this, "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
        }catch(Exception ex){
            Toast.makeText(this, "Problemas no cadastro" +ex.getMessage(), Toast.LENGTH_LONG).show();
        }
        Intent i = new Intent(this, com.br.turismo.control.login.Login.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    @Override
    protected void onDestroy(){
        this.bancoDadosAula.close();
        super.onDestroy();
    }

    public void layoutLogin(View view){
        Intent i = new Intent(this, com.br.turismo.control.login.Login.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }



}
