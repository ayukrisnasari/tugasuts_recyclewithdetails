package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mountNames = new ArrayList<>();
    private ArrayList<String> mountDesc = new ArrayList<>();
    private ArrayList<String> mountImageUrls = new ArrayList<>();
    private ArrayList<String> mountImageDet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/sinabung-lava-90f6b2704a3928f79b26f6a9bd5e68bb.jpg");
        mountNames.add("Gunung Sinabung");
        mountDesc.add("Sumatera Utara, Indonesia");
        mountImageDet.add("   Gunung Sinabung menyemburkan awan panas hingga 2.000 meter disertai abu vulkanik setinggi 2.000 meter dan gempa selama 287 detik. \n" +
                "\n" +
                "Gunung aktif ini menjadi salah satu favorit para pendaki yang terletak di dataran tinggi Karo, Sumatera Utara.\n" +
                "\n" +
                "   Terdapat beberapa jalur pendakian, salah satunya melalui Danau Lau Kawar yang berada di Desa Kuta Gugung.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/mt-kerinci-db9285f77289c80e3a8a8a9d93ecf863.jpg");
        mountNames.add("Gunung Kerinci");
        mountDesc.add("Sumatera Barat, Indonesia");
        mountImageDet.add("   Gunung Kerinci merupakan gunung tertinggi ke-9 di Indonesia, yakni 3.085 mdpl. Salah satu puncak impian di Jambi, Sumatera Barat.\n" +
                "\n" +
                "    Gunung Kerinci berada di dalam kawasan Taman Nasional Kerinci Seblat yang menjadi habitat badak dan harimau Sumatera. Salah satu jalur pendakian Gunung Kerinci melalui Kersik Tuo");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/gunung-tangkuban-perahu-bandung-c7ca46bf807a7c4f1be582e4366a942e.jpg");
        mountNames.add("Gunung Tangkuban Perahu");
        mountDesc.add("Jawa Barat, Indonesia");
        mountImageDet.add("   Kamu bisa merasakan liburan yang menantang di Bandung dengan berkunjung ke Gunung Tangkuban Perahu. Jaraknya sekitar 20 kilometer ke arah utara, tepatnya berada di daerah Cikole, Lembang.Gunung yang diceritakan dalam legenda Sangkuriang ini memiliki ketinggian sekitar 2.084 mdpl.\n" +
                "\n" +
                "   Untuk bisa ke sini, aksesnya cukup mudah dengan beragam pilihan, seperti angkutan umum, mobil, atau motor. Salah satu daya tarik utamanya adalah kawah Tangkuban Perahu yang sangat menawan. ");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/asoka-remadja-mount-kelud-8-e6ab6eda54405d5ab617bf0a65f45699.jpg");
        mountNames.add("Gunung Kelud");
        mountDesc.add("Jawa Timur, Indonesia");
        mountImageDet.add("    Gunung Kelud terletak di antara Kabupaten Kediri, Kabupaten Blitar, dan Kabupaten Malang dengan ketinggian 1.731 mdpl. Pascameletus pada 2014, kawasan Gunung Kelud mengalami banyak perubahan. \n" +
                "\n" +
                "Dulunya, para wisatawan dapat berkunjung dengan mudah hingga puncak gunung. Terdapat banyak infrastruktur menunjang untuk memanjakan para wisatawan.\n" +
                "\n" +
                "   Sekarang kondisi kawah tak lagi sama, anak Gunung Kidul telah hancur lebur. Untuk bisa sampai ke jalur pendakian, harus berjalan jauh atau menggunakan ojek terlebih dahulu. Jalurnya telah berubah dipenuhi pasir, kerikil, dan batu.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/elia-locardi-sleeping-giants-mt-bromo-indonesia-1440-wm-60q-1280x640-c7be828932f989300107ce56e0a34c7e.jpg");
        mountNames.add("Gunung Bromo");
        mountDesc.add("Jawa Timur, Indonesia");
        mountImageDet.add("   Gunung Bromo merupakan primadona Jawa Timur yang termasuk ke dalam kawasan Taman Nasional Bromo Tengger Semeru (TNBTS). Kawasan ini diapit beberapa kabupaten, yakni kabupaten Lumajang, Malang, Pasuruan, dan Probolinggo.\n" +
                "\n" +
                "   Penanjakan merupakan salah satu spot strategis untuk menikmati momen matahari terbit Gunung Bromo. Selain di penanjakan, kamu bisa melihat keindahan Gunung Bromo dari Bukit King Kong, Bukit Cinta, pasir berbisik, dan sekitarnya.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/semeru-trekking-and-mount-bromo-tour-package-5-days-5871ccb4357c70b026e3b405c155f4fb.jpg");
        mountNames.add("Gunung Semeru");
        mountDesc.add("Jawa Timur, Indonesia");
        mountImageDet.add("   Tak jauh dari Gunung Bromo, terdapat Ranu Pani yang merupakan gerbang utama sebelum mendaki Gunung Semeru. Hanya tersedia kuota 500 orang yang dapat mendaki hingga Kalimati setiap harinya. \n" +
                "\n" +
                "   Selain ingin merasakan keindahan puncak Gunung Semeru, banyak wisatawan yang juga ingin menikmati berkemah di Ranu Kumbolo. Sebagai gunung tertinggi di Pulau Jawa, Puncak Mahameru memiliki ketinggian sekitar 3.676 mdpl.");


        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/mount-ijen-crater-hike-blue-fire-ijen-miners-cover-2-d67e343a20db2b3f2597246032d54ee2.jpg");
        mountNames.add("Gunung Ijen");
        mountDesc.add("Jawa Timur, Indonesia");
        mountImageDet.add("   Gunung setinggi 2.443 mdpl ini berada di perbatasan Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur. Meskipun terbilang cukup mudah, kamu tetap membutuhkan fisik yang kuat. Kamu harus menempuh lintasan menanjak sejauh 1,5 kilometer dengan sudut kemiringan sekitar 25-30 derajat. \n" +
                "\n"+
                "   Kamu yang ingin menikmati api biru disarankan mulai mendaki pada tengah malam. Selain itu, ada banyak hal menarik yang bisa kamu lihat di sini. Matahari terbit yang sangat memukau, para penambang di kawah, dan danau air asam terbesar di Indonesia.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/top-of-mount-agung-bali-1-1200x900-94bf3068266e6bceed1cd3ba223742c2.jpg");
        mountNames.add("Gunung Agung");
        mountDesc.add("Bali, Indonesia");
        mountImageDet.add("   Gunung tertinggi di Bali ini memiliki ketinggian sekitar 3.031 mdpl dan terletak di kecamatan Rendang, Kabupaten Karangasem. Terdapat tiga jalur pendakian, yakni Kecamatan Selat, Budakeling, dan Pura Besakih.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/1-cvwmo1ikye-xgndqob3pbq-166d358013405ebb5f8788c6dbcae614.jpeg");
        mountNames.add("Gunung Rinjani");
        mountDesc.add("Nusa Tenggara Barat, Indonesia ");
        mountImageDet.add("   Gunung Rinjani merupakan gunung berapi tertinggi ke-2 setelah Kerinci, yakni setinggi 3.726 mdpl. Selain puncaknya, Gunung Rinjani mempunyai daya tarik berupa Danau Segara Anak.\n" +
                "\n" +
                "   Lokasi tersebut dapat ditempuh dari dua jalur resmi pendakian, yakni Senaru dan Sembalun. Danau Segara Anak dapat ditempuh sekitar 7-10 jam melalui Senaru. Sedangkan, dari Sembalun dibutuhkan waktu sekitar 8-10 jam.\n" +
                "\n" +
                "   Beratnya pendakian ke Rinjani akan terbayarkan dengan pemandangan indah berlatar belakang Gunung Agung, Bali; Gunung Raung, Banyuwangi; serta Gunung Tambora, Sumbawa.");

        mountImageUrls.add("https://cdn.idntimes.com/content-images/post/20171130/tambora-3-11175e68d9445d37fe89b7ecc93d0d3d.jpg");
        mountNames.add("Gunung Tambora");
        mountDesc.add("Nusa Tenggara Barat, Indonesia");
        mountImageDet.add("   Gunung Tambora 1 Gunung ini pernah meletus hingga meluluhlantahkan kerajaan sekitarnya pada 1815. Kejadian tersebut juga menyebabkan cuaca tak wajar disertai hujan lebat dan badai.Selain itu, ketinggian Gunung Tambora juga berubah dari 4.300 menjadi 2.815 meter di atas permukaan laut (mdpl).\n" +
                "\n" +
                "   Gunung Tambora terkenal kalderanya yang terluas di Indonesia. Letaknya berada di antara kabupaten Dompu dan Bima. Terdapat beberapa jalur pendakian yakni melalui Desa Pancasila, Doro Peti, atau Doro Ncanga.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mountNames, mountImageUrls, mountDesc, mountImageDet);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListGunungAdapter adapter = new ListGunungAdapter(this, mountNames, mountImageUrls, mountDesc, mountImageDet);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridGunungAdapter adapter = new GridGunungAdapter(this, mountImageUrls);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Gunung Api Indonesia Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Gunung Api Indonesia Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Gunung Api Indonesia Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}