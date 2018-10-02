package com.example.capri.mvprecyclertraining.Presenter;
import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.Model.Data;
import com.example.capri.mvprecyclertraining.Model.Item;
import java.util.List;

public class MainPresenter implements Contract.MainPresenter {

    private Contract.View mainView;
    private Data data;

    public MainPresenter(Contract.View mainView) {
        this.mainView = mainView;
        this.data = new Data();
    }

    @Override
    public List<Item> getList() {
        return data.getItemsList();
    }
}
