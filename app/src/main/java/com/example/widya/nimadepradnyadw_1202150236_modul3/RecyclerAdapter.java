package com.example.widya.nimadepradnyadw_1202150236_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private ArrayList<String> MerkList; //Digunakan untuk nama merk
    private ArrayList<Integer> GbrList; //Digunakan untuk gambar
    private ArrayList<String> DesList;//Digunakan untuk deskripsi

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerAdapter(ArrayList<String> merkList, ArrayList<Integer> gbrList, ArrayList<String> desList){
        this.MerkList = merkList;
        this.GbrList = gbrList;
        this.DesList = desList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView Merk, Deskripsi;
        private ImageView Gbr;
        private RelativeLayout ItemList;
        private Context context;
        private CardView cview;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            context = itemView.getContext();
            Merk = itemView.findViewById(R.id.merktitle);
            Deskripsi = itemView.findViewById(R.id.desmerk);
            Gbr = itemView.findViewById(R.id.gbrmerk);
            cview = (CardView) itemView.findViewById(R.id.card_view);
            cview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    String deskripsi = "";
                    switch (getAdapterPosition()) {
                        case 0:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 1:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 2:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 3:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Cleo pure water adalah air yang kadar kemurniannya mendekati 100%. Air semacam ini tidak lagi mengandung bakteri, virus, mineral atau zat-zat lain yang akan membahayakan tubuh dalam jangka panjang.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 4:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 5:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Equil Natural Mineral Water adalah air mineral alami yang sangat ringan dan halus. Berasal dari mata air pilihan yang diproduksi menggunakan teknologi modern untuk menjaganya tetap murni dan higienis. Dikemas secara eksklusif dalam botol kaca untuk menjaga kualitas alaminya.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 6:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman. Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 7:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 8:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "Nestle memiliki brand Nestle Water, yang tersebar sebanyak 64 merk di berbagai negara. Beberapa merk terkenal mereka yaitu PureLife, Poland Spring, Acqua Panna, Deer Park, springs, Water Park, San Pellegrino, Perrier dan Waterline. Di Amerika, Nestle PureLife merupakan air murni yang disaring. Merk ini sempat menjadi andalan utama perusahaan. Selanjutnya Nestle PureLife pun menjadi merk paling terkemuka di dunia.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 9:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                        case 10:
                            intent.putExtra("merk", MerkList.get(getAdapterPosition()));
                            intent.putExtra("gambar", GbrList.get(getAdapterPosition()));
                            deskripsi = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.";
                            intent.putExtra("detail", deskripsi);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_adapter, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String dtmerk = MerkList.get(position);
        final String dtdes = DesList.get(position);
        final Integer dtgbr = GbrList.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.Merk.setText(dtmerk);
        holder.Deskripsi.setText(dtdes);
        holder.Gbr.setImageResource(GbrList.get(position)); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
    }


    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return MerkList.size();
    }

}