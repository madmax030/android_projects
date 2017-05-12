package com.skru.businesscomputer56.sklhalal.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MUHAMMAD on 4/4/2560.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_STAR = "MySQLiteDataBase.db";
    private static final int DATABASE_VERSION = 1;

    public MySQLiteHelper (Context context) {

        super(context, MySQLiteHelper.DATABASE_STAR, null, MySQLiteHelper.DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE blog (id INTEGER PRIMARY KEY AUTOINCREMENT, datail TEXT NOT NULL);");
        database.execSQL("CREATE TABLE review (id INTEGER PRIMARY KEY AUTOINCREMENT, datail TEXT NOT NULL);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
