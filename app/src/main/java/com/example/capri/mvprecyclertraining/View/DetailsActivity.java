package com.example.capri.mvprecyclertraining.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.Presenter.DetailsPresenter;
import com.example.capri.mvprecyclertraining.Model.Item;
import com.example.capri.mvprecyclertraining.R;

public class DetailsActivity extends AppCompatActivity implements Contract.View {

    private TextView title;
    private ImageView picture;
    private Item currentItem;
    private Contract.DetailsPresenter detailsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
        detailsPresenter.onDetailsActivityCreated();
    }

    private void init() {
        title = findViewById(R.id.current_title);
        picture = findViewById(R.id.current_image);
        currentItem = getIntent().getParcelableExtra(Item.class.getSimpleName());
        detailsPresenter = new DetailsPresenter(this);
    }

    @Override
    public void showItem() {
        title.setText(currentItem.getTitle());
        picture.setImageResource(currentItem.getImageResourceId());
    }
}
