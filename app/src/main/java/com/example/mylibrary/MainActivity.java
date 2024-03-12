package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList <String> bookList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.book_list);
        //подготовка данных
        bookList.add("Робинзон Крузо");
        bookList.add("Преступление и наказание");
        bookList.add("Двенадцать стульев");
        bookList.add("Основание");
        bookList.add("Парадоксы младшего патриарха");
        bookList.add("Человек, который купил автомобиль");
        bookList.add("Сто лет одиночества");

        //создание адаптера
        arrayAdapter = new ArrayAdapter<>(this,
                R.layout.list_item, bookList);
        listView.setAdapter(arrayAdapter);
    }
}