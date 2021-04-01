package com.example.contactsmock;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {
    MaterialToolbar appbar;
    TextInputEditText nameField;
    TextInputEditText phoneField;
    AppCompatAutoCompleteTextView areaField;
    TextInputEditText addressField;
    TextInputEditText cityField;
    AppCompatAutoCompleteTextView stateField;
    TextInputEditText zipField;
    TextInputEditText emailField;
    TextInputEditText birthdayField;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        nameField = findViewById(R.id.nameField);
        phoneField = findViewById(R.id.phoneField);
        areaField = findViewById(R.id.areaField);
        addressField = findViewById(R.id.addressField);
        cityField = findViewById(R.id.cityField);
        stateField = findViewById(R.id.stateField);
        zipField = findViewById(R.id.zipField);
        emailField = findViewById(R.id.emailField);
        birthdayField = findViewById(R.id.birthdayField);

        appbar = findViewById(R.id.appBar);
        appbar.setOnClickListener(v -> navigateToSecondActivity());
    }

    private void navigateToSecondActivity() {
        String nameText;
        String phoneText;
        String areaText;
        String addressText;
        String cityText;
        String stateText;
        String zipText;
        String emailText;
        String birthdayText;


        nameText = nameField.getText().toString();
        phoneText = phoneField.getText().toString();
        areaText = areaField.getText().toString();
        addressText = addressField.getText().toString();
        cityText = cityField.getText().toString();
        stateText = stateField.getText().toString();
        zipText = zipField.getText().toString();
        emailText = emailField.getText().toString();
        birthdayText = birthdayField.getText().toString();

        FormData data = new FormData(nameText, phoneText, areaText, addressText, cityText, stateText, zipText, emailText, birthdayText);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", data);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
