package com.svalero.aasfrpm.contract;

import com.svalero.aasfrpm.domain.Product;

public interface ProductDetailsContract {

    interface Model {
        Product getProduct(String name);
    }

    interface View {
        void showProduct(Product product);
    }

    interface Presenter {
        void loadProduct(String name);
    }
}
