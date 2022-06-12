package com.main.databinding.ViewModel;

import android.annotation.SuppressLint;

import com.main.databinding.model.ModelClass;
import com.main.databinding.utilities.PhoneDetailsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.lifecycle.ViewModel;

@SuppressLint("NotConstructor")
public class DetailsViewModel{
    PhoneDetailsList phoneDetailsList = new PhoneDetailsList();

    List<ModelClass> dataList = new ArrayList<>();

    //SongList songList = new SongList();
    //List<Model> arrayList = new ArrayList<>();
    public List<ModelClass> DetailsViewModel(){
        //movielist=new MutableLiveData<>();
        phoneDetailsList.getPhoneList();
        dataList = Arrays.asList(phoneDetailsList.getPhoneList());

        return dataList;
    }
}
