package com.svalero.aasfrpm.model;

import android.content.Context;

import com.svalero.aasfrpm.contract.ProductDetailsContract;
import com.svalero.aasfrpm.domain.Product;

public class ProductDetailsModel  implements ProductDetailsContract.Model {
    private Context context;

    public ProductDetailsModel(Context context) {
        this.context = context;
    }

    @Override
    public Product getProduct(String name) {
        //TODO conectar con la api
        //final AppDatabase db = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
        //        .allowMainThreadQueries().build();
        //return db.taskDao().getByName(name);
        return null;
    }
}
