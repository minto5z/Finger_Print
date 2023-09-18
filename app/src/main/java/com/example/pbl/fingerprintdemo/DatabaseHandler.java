package com.example.pbl.fingerprintdemo;

import static com.example.pbl.fingerprintdemo.Constant.mRecordId;

import android.content.Context;


public class DatabaseHandler {

    Context mContext;

    public DatabaseHandler(Context context) {
        mContext = context;
        createTable();
    }

    public void createTable() {
        new Repository(mContext, new User()).create(mRecordId, true);
    }

}
