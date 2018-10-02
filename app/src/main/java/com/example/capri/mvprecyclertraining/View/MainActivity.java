package com.example.capri.mvprecyclertraining.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.Presenter.MainPresenter;
import com.example.capri.mvprecyclertraining.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private RecyclerView recyclerView;
    private Contract.MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        specifyAdapter();
    }

    private void init() {
        mainPresenter = new MainPresenter(this);
        recyclerView = findViewById(R.id.list);
    }

    private void specifyAdapter() {
        // use a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // specify an adapter
        RecyclerAdapter adapter = new RecyclerAdapter(mainPresenter.getList());
        recyclerView.setAdapter(adapter);
    }

    // This method is for DetailsActivity
    @Override
    public void showItem() {
        // nothing to do
    }
}
