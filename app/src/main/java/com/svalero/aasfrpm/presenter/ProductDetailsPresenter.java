package com.svalero.aasfrpm.presenter;

import com.svalero.aasfrpm.contract.ProductDetailsContract;
import com.svalero.aasfrpm.domain.Product;
import com.svalero.aasfrpm.model.ProductDetailsModel;
import com.svalero.aasfrpm.view.ProductDetailsView;

public class ProductDetailsPresenter implements ProductDetailsContract.Presenter {

    private ProductDetailsModel model;
    private ProductDetailsView view;

    public ProductDetailsPresenter(ProductDetailsView view) {
        model = new ProductDetailsModel(view.getApplicationContext());
        this.view = view;
    }



    @Override
    public void loadProduct(String name) {
        Product product = model.getProduct(name);
        view.showProduct(product);
    }
}
