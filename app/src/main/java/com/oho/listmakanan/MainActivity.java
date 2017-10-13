package com.oho.listmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Makanan> dataMkn;
    private RecyclerView listMkn;
    private MknAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();//call
        listMkn = (RecyclerView) findViewById(R.id.id_mkn);
        adapter = new MknAdapter(this, dataMkn);
        listMkn.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listMkn.setLayoutManager(layoutManager);

        DividerItemDecoration divider = new DividerItemDecoration(listMkn.getContext(),
                layoutManager.getOrientation());
        listMkn.addItemDecoration(divider);

    }

    private void generateData() {
        dataMkn = new ArrayList<>();

        String[] title = {
                "Tumis Kangkung Terasi",
                "Terong Balado",
                "Sayur Asem",
                "Nasi Goreng Putih"
        };

        String[] desc = {
                "Tumis Kangkung Terasi cocok bagi anda yang suka dengan masakan pedas",
                "Terong Balado yang disajikan secara sederhana dan " +
                        "menggugah selera",
                "Sayur Asem yang sangat menggoda selera ini" +
                        "dapat disajikan dengan resep yang sangat mudah",
                "Nasi Goreng Putih makanan khas Indonesia" +
                        "yang tidak boleh untuk dilewatkan"
        };

        String[] bahan = {
                "1 ikat kangkung\n" +
                "1 lombok merah besar\n" +
                "5 siung bawang merah\n" +
                "2 siung bawang putih\n" +
                "Saus tiram ± 3 sdm\n" +
                "Lengkuas 1/3 ruas jari\n" +
                "Gula aren/gula pasir secukupnya\n" +
                "Terasi\n" +
                "Tomat dan mentega\n",

                "4 bh terong ungu\n" +
                "6 siung bawang merah\n" +
                "4 siung bawang putih\n" +
                "5 cabe keriting (kurangi jika ingin tidak terlalu pedas)\n" +
                "10 cabai merah besar\n" +
                "2 bh tomat\n" +
                "Garam dan gula secukupnya\n",

                "50 gram kecambah dari kedelai atau tauge besar\n" +
                "melinjo sesuai selera\n" +
                "10 biji kacang panjang yang dipotong kurang lebih 5 cm\n" +
                "2 buah labu siam yang dikupas dan dipotong sesuai selera\n" +
                        "Seikat kangkung yang dipotong sesuai selera\n" +
                        "1 liter air\n" +
                        "3 buah nelimbing wuluh\n" +
                        "2 cm lengkuas yang digeprak\n" +
                        "4 buah bawah merah yang diiris tipis-tipis\n" +
                        "3 siung bawang merah yang dihaluskan Garam dan gula secukupnya\n",

                "500 gram nasi putih\n" +
                "1 butir telur dikocok lepas\n" +
                "75 gram ayam fillet dipotong – potong\n" +
                "1 buah sosis ayam dipotong – potong\n" +
                        "2 siung bawang putih dicincang halus\n" +
                        "50 gram mixed vegetable\n" +
                        "1/2 sendok makan kecap ikan\n" +
                        "1/2 sendok teh garam\n" +
                        "1/4 sendok teh merica bubuk\n" +
                        "1/2 sendok teh kaldu ayam bubuk\n" +
                        "1 batang daun bawang, iris halus\n" +
                        "1 sendok makan minyak untuk menumis\n" +
                ""
        };

        String[] prosedur = {
                "1.Siapkan adalah kangkung yang telah dibersihkan dan di petik daunnya. \n" +
                "2.Iris bawang merah dan bawang putih, tomat dan cabai.\n" +
                "3.Panaskan mentega atau minyak di atas penggorengan, tumis bawang merah dan bawang putih hingga harum.\n" +
                "4.Masukan cabai, terasi, dan lengkuas segera lingkarkan saus tiram di pinggir2 bumbu yang sedang ditumis bukan langsung ke bumbunya.\n" +
                "5.Setelah itu masukan kangkung yang telah di cuci, jangan ditambahkan air." +
                        " usahakan jangan menambahkan air ketika menumis sayuran. karena sebenarnya air akan keluar sendiri dari kangkung yang dicuci. akali dengan mengecilkan api.\n" +
                "6.Setelah matang masukan garam dan gula. tahap terakhir ini usahakan untuk mencicipi dahulu kuahnya." +
                        " karena biasanya terasi dan saus tiram sendiri sudah asin.\n" +
                "7.Masukan tomat dan siap di hidangkan hangat-hangat.\n",

                "1.Iris terong ungu masing-masing menjadi 4 bagian kira-kira 10cm, tiap bagian potong memanjang menjadi empat bagian.\n" +
                "2.Rendam irisan terong ke dalam air agar terong tidak berubah warna. Kemudian di goreng hingga matang. \n" +
                "3.Kupas bawang merah dan bawang putih. Siapkan cabai keriting, cabai merah besar, dan tomat. \n" +
                        "Ulek sampai halus kemudian tambahkan gula dan garam sesuai selera.\n" +
                "4.Setelah bumbu halus dan terong sudah matang, tumis bumbu dengan minyak yang sudah dipanaskan hingga wangi. Kemudian masukan terong dan aduk hingga merata.\n",

                "1.Rebus air hingga mendidih.\n" +
                "2.Masukkan bawang putih, bawang merah, lengkuas dan belimbing wuluh.\n" +
                "3.Setelah air kembali mendidih, masukkan kacang panjang, kecambah dan labu siam. Masak hingga semua bahan setengah matang.\n" +
                "4.Tambahkan kangkung, gula dan garam. Aduk-aduk dan tunggu kurang lebih 1 menit atau sampai kangkung empuk.\n"+
                "5.Matikan api dan angkat. Sayur Asem siap dihidangkan selagi hangat.\n",

                "1.Tumis bawang putih sampai harum. Masukkan telur. Aduk sampai berbutir. \n"+
                        "Tambahkan ayam fillet dan sosis ayam. Aduk sampai berubah warna.\n" +
                "2.Masukkan mixed vegetable. Aduk sampai layu. Tambahkan nasi putih, kecap ikan, garam, merica bubuk, kaldu ayam bubuk, dan daun bawang. Masak sampai matang. \n" +
                "3.Nasi goreng putih kini telah siap untuk disajikan."
        };

        int[] img = {
                R.drawable.kangkung,
                R.drawable.terongbalado,
                R.drawable.sayurasem,
                R.drawable.nasigoreng
        };

        for (int i = 0; i < title.length; i++){
            Makanan makanan = new Makanan(title[i],desc[i],bahan[i],prosedur[i],img[i]);

            dataMkn.add(makanan);
        }
    }
}
