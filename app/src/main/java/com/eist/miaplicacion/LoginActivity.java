package com.eist.miaplicacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
private EditText mEditTextEmail;
private EditText mEditPassword;
private Button mButtonLogin;
private String email ="";
private String password="";
private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        mEditTextEmail=(EditText) findViewById(R.id.editTextMail);
        mEditPassword=(EditText) findViewById(R.id.editTextPassword);
        mButtonLogin=(Button) findViewById(R.id.btnLogin);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = mEditTextEmail.getText().toString();
                password = mEditPassword.getText().toString();

                if (!email.isEmpty() && !password.isEmpty()) {
                    loginUser();
                }
                else{
                Toast.makeText(LoginActivity.this, "Complete los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void loginUser(){
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "No se pudo iniciar sesion ,porfavor verifique sus datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
