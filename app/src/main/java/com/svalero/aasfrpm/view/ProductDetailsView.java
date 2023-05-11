package com.svalero.aasfrpm.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.svalero.aasfrpm.R;
import com.svalero.aasfrpm.contract.ProductDetailsContract;
import com.svalero.aasfrpm.domain.Product;
import com.svalero.aasfrpm.presenter.ProductDetailsPresenter;

public class ProductDetailsView extends AppCompatActivity implements ProductDetailsContract.View {

    private ProductDetailsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        presenter = new ProductDetailsPresenter(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        if (name == null)
            return;


        presenter.loadProduct(name);
    }
    @Override
    public void showProduct(Product product) {
        TextView tvName = findViewById(R.id.tv_product_name);
        TextView tvDescription = findViewById(R.id.tv_product_description);
        TextView tvOwner = findViewById(R.id.tv_product_owner);

        tvName.setText(product.getName());
        tvDescription.setText(product.getCategory());
        tvOwner.setText(product.getUser_user());
    }
}
