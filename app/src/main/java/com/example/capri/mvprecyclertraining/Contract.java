package com.example.capri.mvprecyclertraining;

import com.example.capri.mvprecyclertraining.Model.Item;
import java.util.List;

public class Contract {

    public interface Model {
        List<Item> getItemsList();
    }

    public interface View {
        void showItem();
    }

    public interface RepositoryRowView {
        void setTitle(String title);
        void setPicture(int imageResourceId);
    }

    public interface MainPresenter {
        List<Item> getList();
      //  void onAttach();
      //  void onDetach();
    }

    public interface DetailsPresenter {
        void onDetailsActivityCreated();
    }
}
