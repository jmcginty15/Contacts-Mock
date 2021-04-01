package com.example.contactsmock;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button button;
    TextView nameView;
    TextView phoneView;
    TextView areaView;
    TextView addressView;
    TextView cityView;
    TextView stateView;
    TextView zipView;
    TextView emailView;
    TextView birthdayView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        button = findViewById(R.id.backButton);
        button.setOnClickListener(v -> finish());

        Bundle extras = getIntent().getExtras();
        FormData data = null;
        if (extras != null) {
            data = (FormData) extras.getSerializable("data");
        }
        nameView = findViewById(R.id.nameField);
        phoneView = findViewById(R.id.phoneField);
        areaView = findViewById(R.id.areaField);
        addressView = findViewById(R.id.addressField);
        cityView = findViewById(R.id.cityField);
        stateView = findViewById(R.id.stateField);
        zipView = findViewById(R.id.zipField);
        emailView = findViewById(R.id.emailField);
        birthdayView = findViewById(R.id.birthdayField);

        nameView.setText(data.getNameText());
        phoneView.setText(data.getPhoneText());
        areaView.setText(data.getAreaText());
        addressView.setText(data.getAddressText());
        cityView.setText(data.getCityText());
        stateView.setText(data.getStateText());
        zipView.setText(data.getZipText());
        emailView.setText(data.getEmailText());
        birthdayView.setText(data.getBirthdayText());
    }
}
