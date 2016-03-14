package com.example.cubero.animales;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public ImageButton perro, gato,tigre;
    MediaPlayer sonido;
    private boolean sonando = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        perro = (ImageButton) findViewById(R.id.perro);
        gato = (ImageButton) findViewById(R.id.gato);
        tigre = (ImageButton) findViewById(R.id.tigre);

        tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonando == true){
                    sonido.stop();
                    sonando = false;
                }
                sonido = MediaPlayer.create(MainActivity.this,R.raw.tigre);
                sonando = true;
                sonido.start();
            }
        });
        perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonando == true){
                    sonido.stop();
                    sonando = false;
                }
                sonido = MediaPlayer.create(MainActivity.this,R.raw.dog);
                sonando = true;
                sonido.start();
            }
        });
        gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonando == true){
                    sonido.stop();
                    sonando = false;
                }
                sonido= MediaPlayer.create(MainActivity.this,R.raw.cat);
                sonando = true;
                sonido.start();
            }
        });

    }
}
