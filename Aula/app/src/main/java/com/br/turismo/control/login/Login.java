package com.br.turismo.control.login;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.br.turismo.control.cadastrar.CadastrarUsuario;
import com.br.turismo.model.BancoDadosAula;
import com.example.jr.aula.R;

public class Login extends AppCompatActivity {

    private EditText login, senha;
    private Button entrar, cadastrar;
    private BancoDadosAula bancoDadosAula = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        this.bancoDadosAula = new BancoDadosAula(this);

        login = (EditText)findViewById(R.id.loginLogar);
        senha = (EditText)findViewById(R.id.senhaLogar);

        entrar = (Button) findViewById(R.id.entrarLogar);
    }

    public void validarLogin(View view){
        SQLiteDatabase banco = this.bancoDadosAula.getReadableDatabase();

        Cursor cursor = banco.rawQuery("SELECT * FROM usuario where login ='"+login.getText()+"'and senha ='"+senha.getText()+"' ", null);
        if(cursor.getCount()>0){
            Toast.makeText(this, "Usuario Logado !!!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Login ou Senha incorreto(s)!", Toast.LENGTH_LONG).show();
        }
    }

    public void layoutCadastrarUsuario(View view){
        Intent i = new Intent(this, CadastrarUsuario.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }
}
