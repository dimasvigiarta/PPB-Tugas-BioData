package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMaps, btnMasage, btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCall = findViewById(R.id.btn_call);
        btnMaps = findViewById(R.id.btn_maps);
        btnMasage = findViewById(R.id.btn_masage);

        btnMaps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="https://maps.app.goo.gl/zYzeLNbxLWiHABwX7";
                Intent bukaMaps = new Intent(Intent.ACTION_VIEW);
                bukaMaps.setData(Uri.parse(url));
                startActivity(bukaMaps);
            }
        });
    }

    public void bukaTelepon(View view){
        String nomor="082336486623";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(memanggil);
    }

    public void bukaEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"indradimas57@gmail.com"});

        startActivity(Intent.createChooser(intent, "Kirim Email"));
    }
}