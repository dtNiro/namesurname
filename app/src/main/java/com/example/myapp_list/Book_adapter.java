package com.example.myapp_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Book_adapter extends ArrayAdapter<Book> {
    private LayoutInflater inflater;
    private int layout;
    private List<Book> books;

    public  Book_adapter(Context context, int resource, List<Book> books){
        super(context, resource, books);
        this.books = books;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertview, ViewGroup parent){
        View view = inflater.inflate(this.layout, parent,false);

        TextView nameView = (TextView) view.findViewById(R.id.book_name);
        TextView surnameView = (TextView) view.findViewById(R.id.book_surname);


        Book book = books.get(position);

        nameView.setText(book.getBook_name());
        surnameView.setText(book.getBook_surname());

        return view;
    }

}
