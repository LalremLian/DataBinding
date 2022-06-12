package com.main.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.main.databinding.ViewModel.DetailsViewModel;
import com.main.databinding.adapter.RecylcerAdapter;
import com.main.databinding.databinding.ActivityMainBinding;
import com.main.databinding.model.ModelClass;
import com.main.databinding.utilities.PhoneDetailsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;

    PhoneDetailsList phoneDetailsList = new PhoneDetailsList();

    DetailsViewModel detailsViewModel;
    List<ModelClass> poop = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        populateData();
    }

    private void populateData() {

        //detailsViewModel.DetailsViewModel().addAll(poop);

        phoneDetailsList.getPhoneList();
        poop = Arrays.asList(phoneDetailsList.getPhoneList());

        //poop.addAll(detailsViewModel.DetailsViewModel());

        Log.e("DataList",poop.toString());


        RecylcerAdapter recylcerAdapter = new RecylcerAdapter(poop, this);
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.setRecyclerAdapter(recylcerAdapter);
    }
}