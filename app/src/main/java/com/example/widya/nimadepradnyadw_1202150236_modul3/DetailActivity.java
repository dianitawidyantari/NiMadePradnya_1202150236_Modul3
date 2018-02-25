package com.example.widya.nimadepradnyadw_1202150236_modul3;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private TextView mrk, dsk, literair;
    private ImageView foto, galon;
    private int liter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mrk = (TextView) findViewById(R.id.merkminuman);
        dsk = (TextView) findViewById(R.id.deskripsimerk);
        foto = (ImageView) findViewById(R.id.foto);
        galon = (ImageView) findViewById(R.id.isigalon);
        literair = (TextView) findViewById(R.id.literair);
        liter = 20;

        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent c = getIntent();

        String nmMerk = c.getStringExtra("merk");
        String desMerk = c.getStringExtra("detail");
        Integer gbMerk = c.getIntExtra("gambar", 0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sbeelumnya
        mrk.setText(nmMerk);
        dsk.setText(desMerk);
        foto.setImageResource(gbMerk);
        galon.setImageLevel(0);
        literair.setText(liter + " Liter");
    }

    //Method ketika tombol + ditekan
    public void bertambah(View view) {
        //Memeriksa apakah botol telah penuh
        if (galon.getDrawable().getLevel() + 1 <= 4) {
            //Menambahkan level gambar
            galon.setImageLevel(galon.getDrawable().getLevel() + 1);
            liter += 20;
            literair.setText(liter + " Liter");
        } else {
            //ketika botol telah penuh lakukan :
            galon.setImageLevel(4);
            Toast.makeText(this, "Galon sudah terisi penuh!", Toast.LENGTH_SHORT).show();
        }
    }

    //Method ketika tombol - ditekan
    public void berkurang(View view) {
        //Memeriksa apakah botol akan kosong
        if (galon.getDrawable().getLevel() - 1 >= 0) {
            //Mengurangi level gambar
            galon.setImageLevel(galon.getDrawable().getLevel() - 1);
            liter -= 20;
            literair.setText(liter + " Liter");
        } else {
            //Ketika botol telah kosong lakukan :
            galon.setImageLevel(0);
            Toast.makeText(this, "Galon sudah hampir habis!", Toast.LENGTH_SHORT).show();
        }
    }

}
