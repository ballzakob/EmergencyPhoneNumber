package com.example.emergencyphonenumber.model;

import java.util.Locale;

public class PhoneItem {

    public final long _id;
    public final String title;
    public final String number;
    public final String image; //final คือ ห้ามใครแก้แล้วเด้อ

    public PhoneItem(long _id, String title, String number, String image) {
        this._id = _id;
        this.title = title;
        this.number = number;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "ชื่อ %s\nเบอร์โทร: %s",
                this.title,
                this.number);
    }
}
