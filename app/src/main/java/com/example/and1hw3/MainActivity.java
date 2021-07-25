package com.example.and1hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRv();
        getList();
    }


    private void setRv() {
        rv = findViewById(R.id.rv);
        adapter = new Adapter();
        rv.setAdapter(adapter);
        adapter.setList(getList());
    }
    private ArrayList<Country>  getList(){
        ArrayList<Country> list = new ArrayList<>();
        list.add(new Country("Испания","Мадрид",R.drawable.spain));
        list.add(new Country("Аргентина","Буэнос-Айрес",R.drawable.argentina));
        list.add(new Country("Италия","Рим",R.drawable.italy));
        list.add(new Country("Япония","Токио",R.drawable.japan));
        list.add(new Country("Египет","Каир",R.drawable.egypet));
        list.add(new Country("Бельгия","Брюссель",R.drawable.belgium));
        list.add(new Country("Саудовская Аравия","Эр-Рияд",R.drawable.sa));
        list.add(new Country("Кыргызстан","Бишкек",R.drawable.kg));
        list.add(new Country("Украина","Киев",R.drawable.ua));
        list.add(new Country("Бразилия","Бразилиа",R.drawable.brazil));
        list.add(new Country("Израиль","Иерусалим",R.drawable.izrael));
        list.add(new Country("ГонКонг","ГонКонг",R.drawable.hongkong));
        list.add(new Country("Литва","Вильнюс",R.drawable.litua));
        list.add(new Country("Китай","Пекин",R.drawable.china));
        list.add(new Country("Греция","Афины",R.drawable.greece));
        return list;
    }
}