package br.com.somdosbichos.cursoandroid.allinedelara.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    private ImageView cao, gato, macaco, vaca, ovelha, leao;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cao = (ImageView) findViewById(R.id.cao);
        gato = (ImageView) findViewById(R.id.gato);
        macaco = (ImageView) findViewById(R.id.macaco);
        ovelha = (ImageView) findViewById(R.id.ovelha);
        vaca = (ImageView) findViewById(R.id.vaca);
        leao = (ImageView) findViewById(R.id.leao);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        vaca.setOnClickListener(this);
        leao.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        macaco.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cao:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.cao));
                tocarSom();
                break;
            case R.id.leao:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.leao));
                tocarSom();
                break;
            case R.id.ovelha:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.ovelha));
                tocarSom();
                break;
            case R.id.macaco:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.macaco));
                tocarSom();
                break;
            case R.id.gato:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.gato));
                tocarSom();
                break;
            case R.id.vaca:
                mediaPlayer = (MediaPlayer.create(MainActivity.this, R.raw.vaca));
                tocarSom();
                break;

        }

    }

    public void tocarSom(){
        if(mediaPlayer!=null){
            mediaPlayer.start();
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
