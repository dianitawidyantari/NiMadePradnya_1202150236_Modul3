package com.example.widya.nimadepradnyadw_1202150236_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Merk;
    private ArrayList<Integer> Gambar;
    private ArrayList<String> Deskripsi;
    //Daftar nama minuman
    private String[] Nama = {"Ades", "Amidis", "Aqua", "Cleo", "Club", "Equil", "Evian", "Le Minerale", "Nestle", "Pristine", "Vit"};
    //Daftar Gambar minuman
    private int[] Gbr = {R.mipmap.ades, R.mipmap.amidis, R.mipmap.aqua, R.mipmap.cleo, R.mipmap.club, R.mipmap.equil, R.mipmap.evian, R.mipmap.leminerale, R.mipmap.nestle, R.mipmap.pristine, R.mipmap.vit};
    //Daftar deskripsi minuman
    private String[] Des = {"Ini adalah air minum merk Ades", "Ini adalah air minum merk Amidis", "Ini adalah air minum merk Aqua", "Ini adalah air minum merk Cleo", "Ini adalah air minum merk Club",
            "Ini adalah air minum merk Equil","Ini adalah air minum merk Evian", "Ini adalah air minum merk Le Minerale", "Ini adalah air minum merk Nestle", "Ini adalah air minum merk Pristine", "Ini adalah air minum merk Vit" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Merk = new ArrayList<>();
        Gambar = new ArrayList<>();
        Deskripsi = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerAdapter(Merk, Gambar, Deskripsi);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
        //mengubah tampilan saat layar landscape
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<Nama.length; w++){
            Gambar.add(Gbr[w]);
            Merk.add(Nama[w]);
            Deskripsi.add(Des[w]);
        }
    }
}
