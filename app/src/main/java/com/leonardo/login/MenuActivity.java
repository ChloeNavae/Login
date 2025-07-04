package com.leonardo.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    private Button _showMahasiswaButton, _showForexButton;
    private Intent _showMahasiswaIntent, _showForexIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initShowMahasiswaButton();
        initShowForexButton();
    }

    private void initShowMahasiswaButton() {
        _showMahasiswaButton = (Button) findViewById(R.id.showMahasiswaButton);

        _showMahasiswaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _showMahasiswaIntent = new Intent(getApplicationContext(), ShowMahasiswaActivity.class);
                startActivity(_showMahasiswaIntent);
            }
        });
    }

    private void initShowForexButton(){
        _showForexButton = (Button) findViewById(R.id.showForexButton);
        _showForexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _showForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_showForexIntent);
            }
        });
    }


}