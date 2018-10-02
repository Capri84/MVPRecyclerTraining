package com.example.capri.mvprecyclertraining.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

    private String title;
    private int imageResourceId;

    public Item(String title, int imageResourceId) {
        this.title = title;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // упаковываем объект в Parcel
    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(title);
        parcel.writeInt(imageResourceId);
    }

    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        // распаковываем объект из Parcel
        public Item createFromParcel(Parcel parcel) {
            return new Item(parcel);
        }

        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    private Item(Parcel parcel) {
        this.title = parcel.readString();
        this.imageResourceId = parcel.readInt();
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
