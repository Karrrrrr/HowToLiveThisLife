package com.example.program3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void back(View view) {
        onBackPressed();
    }

    public void house(View view) {
        MainActivity.flag = 0;
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void paper(View view) {
        MainActivity.flag = 1;
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void state(View view) {
        MainActivity.flag = 2;
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void housing(View view) {
        MainActivity.flag = 3;
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void work(View view) {
        MainActivity.flag = 4;
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void search(View view) {
        Intent search = new Intent(this, Search.class);
        startActivity(search);
    }

    public void info(View view) {
        AlertDialog.Builder b = new AlertDialog.Builder(Menu.this);
        b.setTitle("Информация о разработчике")
                .setMessage("Наумкина Сабина 4332");
        AlertDialog a = b.create();
        a.show();
    }
}