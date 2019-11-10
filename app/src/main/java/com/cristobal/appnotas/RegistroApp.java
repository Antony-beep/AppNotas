package com.cristobal.appnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cristobal.appnotas.models.Usuario;
import com.cristobal.appnotas.repositories.UserRepository;

public class RegistroApp extends AppCompatActivity {

    private EditText usuario;

    private EditText nombre;

    private EditText email;

    private EditText contraseña;

    private Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_app);

        usuario=findViewById(R.id.username_input);
        nombre=findViewById(R.id.fullname_input);
        email=findViewById(R.id.email_input);
        contraseña=findViewById(R.id.password_input);
        btnregister=findViewById(R.id.save_button);
        btnregister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }
    public void Register(){
        String user1 = usuario.getText().toString();
        String name = nombre.getText().toString();
        String Email = email.getText().toString();
        String password = contraseña.getText().toString();

        Usuario user =new Usuario();
        user.setUser(user1);
        user.setFullname(name);
        user.setEmail(Email);
        user.setPassword(password);

        UserRepository.save(user);
        Toast.makeText(this,"Usuario registrado", Toast.LENGTH_SHORT).show();

        setResult(RESULT_OK);
    }
}
