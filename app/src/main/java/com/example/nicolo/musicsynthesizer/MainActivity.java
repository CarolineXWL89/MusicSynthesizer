package com.example.nicolo.musicsynthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, bfButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, aoctButton;
    private MediaPlayer a, bf, b, c, cs, d, ds, e, f, fs, g, gs, aoct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();
    }

    private void createMediaPlayers() {
        a = MediaPlayer.create(this, R.raw.scalea);
        bf = MediaPlayer.create(this, R.raw.scalea);
        b = MediaPlayer.create(this, R.raw.scalea);
        c = MediaPlayer.create(this, R.raw.scalea);
        cs = MediaPlayer.create(this, R.raw.scalea);
        d = MediaPlayer.create(this, R.raw.scalea);
        ds = MediaPlayer.create(this, R.raw.scalea);
        e = MediaPlayer.create(this, R.raw.scalea);
        f = MediaPlayer.create(this, R.raw.scalea);
        fs = MediaPlayer.create(this, R.raw.scalea);
        g = MediaPlayer.create(this, R.raw.scalea);
        gs = MediaPlayer.create(this, R.raw.scalea);
        aoct = MediaPlayer.create(this, R.raw.scalea);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        bfButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        aoctButton.setOnClickListener(this);
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        bfButton = (Button) findViewById(R.id.button_Bb);
        bButton = (Button) findViewById(R.id.button_B);
        cButton = (Button) findViewById(R.id.button_B);
        csButton = (Button) findViewById(R.id.button_B);
        dButton = (Button) findViewById(R.id.button_B);
        dsButton = (Button) findViewById(R.id.button_B);
        eButton = (Button) findViewById(R.id.button_B);
        fButton = (Button) findViewById(R.id.button_B);
        fsButton = (Button) findViewById(R.id.button_B);
        gButton = (Button) findViewById(R.id.button_B);
        gsButton = (Button) findViewById(R.id.button_B);
        aoctButton = (Button) findViewById(R.id.button_B);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_a:
                a.seekTo(0); //restarts note (file) from the beginning
                a.start();
                //Toast.makeText(this, "A clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_Bb:
                bf.seekTo(0); //restarts note (file) from the beginning
                bf.start();
                //Toast.makeText(this, "B-flat clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_B:
                b.seekTo(0); //restarts note (file) from the beginning
                b.start();
                //Toast.makeText(this, "B clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_c:
                c.seekTo(0); //restarts note (file) from the beginning
                c.start();
                break;
            case R.id.button_Cs:
                cs.seekTo(0); //restarts note (file) from the beginning
                cs.start();
                break;
            case R.id.button_D:
                d.seekTo(0); //restarts note (file) from the beginning
                d.start();
                break;
            case R.id.button_Ds:
                ds.seekTo(0); //restarts note (file) from the beginning
                ds.start();
                break;
            case R.id.button_E:
                e.seekTo(0); //restarts note (file) from the beginning
                e.start();
                break;
            case R.id.button_F:
                f.seekTo(0); //restarts note (file) from the beginning
                f.start();
                break;
            case R.id.button_Fs:
                fs.seekTo(0); //restarts note (file) from the beginning
                fs.start();
                break;
            case R.id.button_G:
                g.seekTo(0); //restarts note (file) from the beginning
                g.start();
                break;
            case R.id.button_Gs:
                gs.seekTo(0); //restarts note (file) from the beginning
                gs.start();
                break;
            case R.id.button_AOct:
                aoct.seekTo(0); //restarts note (file) from the beginning
                aoct.start();
                break;
            default:
                Toast.makeText(this, "Hey. Wake up, dodo bird.", Toast.LENGTH_SHORT).show();
        }
    }
}
