package com.example.capri.mvprecyclertraining.Presenter;

import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.Model.Data;
import com.example.capri.mvprecyclertraining.Model.Item;

public class DetailsPresenter implements Contract.DetailsPresenter {

    private Contract.View detailView;

    public DetailsPresenter(Contract.View detailView) {
        this.detailView = detailView;
    }

    @Override
    public void onDetailsActivityCreated() {
        detailView.showItem();
    }
}
