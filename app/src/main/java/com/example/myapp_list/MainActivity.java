package com.example.myapp_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Book_adapter bookAdapter;
    ArrayList<Book> books = new ArrayList<Book>();
    ListView bookList;

    EditText name_in;
    EditText surname_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetInitialDate();

        bookList= findViewById(R.id.bookList);

        bookAdapter = new Book_adapter(this,R.layout.book_layout, books);
        bookList.setAdapter(bookAdapter);
    }
    private void SetInitialDate(){

    }
    public void Add(View view){
        name_in = findViewById(R.id.name_in);
        String name = name_in.getText().toString();

        surname_in = findViewById(R.id.surname_in);
        String surname = surname_in.getText().toString();



        if(!name.isEmpty() && !surname.isEmpty()){

            books.add(new Book(surname,name));

            name_in.setText("");
            surname_in.setText("");

            bookAdapter.notifyDataSetChanged();
        }
    }
}