package com.geektech.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    private EditText editTitle;
    private EditText editDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDesc);
    }

    public void onClick(View view) {
        String title = editTitle.getText().toString().trim();
        String desc = editDesc.getText().toString().trim();
        Intent intent = new Intent();
        Task task = new Task(title, desc);
        intent.putExtra("task", task);
        setResult(RESULT_OK, intent);
        finish();


        if (editDesc.getText().toString().equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Бакыт ваще красавчик!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        else if (editTitle.getText().toString().equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Бакыт ваще ваще красавчик!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();


        }
    }
}
