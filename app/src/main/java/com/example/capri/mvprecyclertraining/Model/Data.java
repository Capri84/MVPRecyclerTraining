package com.example.capri.mvprecyclertraining.Model;

import com.example.capri.mvprecyclertraining.ApplicationContextProvider;
import com.example.capri.mvprecyclertraining.Contract;
import com.example.capri.mvprecyclertraining.R;
import java.util.ArrayList;
import java.util.List;

public class Data implements Contract.Model {

    private static int[] pictureIds = {R.drawable.pict1, R.drawable.pict2, R.drawable.pict3, R.drawable.pict4,
            R.drawable.pict5, R.drawable.pict6, R.drawable.pict7};
    private String[] pictureTitles = ApplicationContextProvider.getContext().getResources().
            getStringArray(R.array.picture_names);

    public Data() {
        }

    public List<Item> getItemsList() {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < pictureIds.length; i++) {
            items.add(i, new Item(pictureTitles[i], pictureIds[i]));
        }
        return items;
    }
}