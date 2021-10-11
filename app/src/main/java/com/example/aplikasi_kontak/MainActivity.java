package com.example.aplikasi_kontak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText editNama,editAlamat,editNohp;
    RadioGroup radioGroup;
    ImageButton imageButton;
    Button uploadButton,submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = findViewById(R.id.editNama);
        editAlamat = findViewById(R.id.editNama1);
        editNohp = findViewById(R.id.editNama2);

        imageButton = findViewById(R.id.img);
        uploadButton = findViewById(R.id.btnUpload);
        submitButton = findViewById(R.id.btnSave);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(intent);

            }
        });


    }
}