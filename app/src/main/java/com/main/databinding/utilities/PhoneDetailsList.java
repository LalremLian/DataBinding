package com.main.databinding.utilities;

import com.main.databinding.model.ModelClass;

public class PhoneDetailsList {
    ModelClass[] phoneList = new ModelClass[]{
        new ModelClass("Android Butter","8.2")
    };

    public ModelClass[] getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(ModelClass[] songsList) {
        this.phoneList = songsList;
    }
}
