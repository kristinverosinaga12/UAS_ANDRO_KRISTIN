package com.example.pljc_pc.uts_kristin;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout_action_bar, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = (EditText) findViewById(R.id.edNama);
        final EditText Email = (EditText) findViewById(R.id.edEmail);
        final Button Simpan = (Button) findViewById(R.id.btsimpan);
        final Button Kosongkan = (Button) findViewById(R.id.btkosong);

        Kosongkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama.setText("");
                Email.setText("");
            }
        });

        Simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View parentView = findViewById(R.id.main_layout_id);
                String pesan = " Data Tersimpan";

                final Snackbar snackbar = Snackbar
                        .make(parentView, pesan, Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });



    }
}
