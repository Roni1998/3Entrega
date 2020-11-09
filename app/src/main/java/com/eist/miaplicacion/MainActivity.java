package com.eist.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button MiBotonA;
private SensorManager sensorManager;
private Sensor sensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MiBotonA = (Button) findViewById(R.id.loginButton);
        MiBotonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent MiIntentA = new Intent(MainActivity.this,Navegador.class);
                startActivity(MiIntentA);

            }
        });
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);





        ;

    }



}