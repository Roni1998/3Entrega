package com.eist.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {
    private Button mButtonSignOut;
    private FirebaseAuth mAuth;
    private Button mButtonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerrarsesion);

        mAuth = FirebaseAuth.getInstance();
        mButtonSignOut = (Button) findViewById(R.id.btnSignout);
        mButtonA = (Button) findViewById(R.id.btnaplicacion);

        mButtonSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                startActivity(new Intent(ProfileActivity.this, LoginActivity.class));
                finish();
            }
        });
        mButtonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent Intent = new Intent(ProfileActivity.this, Navegador.class);
                startActivity(Intent);
            }
        });
    }
}