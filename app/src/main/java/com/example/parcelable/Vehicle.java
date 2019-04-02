package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {
    public String brand;
    public int kilometers;

    public Vehicle (String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }
    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    protected Vehicle(Parcel in) {
        brand = in.readString();
        kilometers = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(brand);
        dest.writeInt(kilometers);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };


}
