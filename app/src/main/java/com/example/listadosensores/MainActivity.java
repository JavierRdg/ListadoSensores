package com.example.listadosensores;

import static android.content.Context.SENSOR_SERVICE;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private TextView texto;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.texto1);
        SensorManager gestorSensores =
                (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores =
                gestorSensores.getSensorList(Sensor.TYPE_ALL);
        for(Sensor sensor: listaSensores) {
            concatena(sensor.getName());
        }
    }
    private void concatena(String s) {
        texto.append(s + "\n");
    }
}
