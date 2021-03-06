package com.example.admin.yournotemygrade.purepackagesupport.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    ///////////////////////////////
    //This is your SQLiteHeler ///
    //Handle all about SQLite ///
    //Using Variables to ReUse///
    ///////////////////////////

    //
    // This is Default Variables change it in use
    ////////////////////////////////////////////
    public static int DATABASE_VER=1;
    public static String DATABASE_NAME=" My Note Database ";
    public static String DATA_TABLE_NAME="Notes";
    public static String DATA_MODEL_ID="Id";
    public static String DATA_MODEL_TITLE="Title";
    public static String DATA_MODEL_CONTENT="Content";
    ///////////////////////////////////////////
    //CREATE TABLE QUERY
    /////////////////////////////////////////
    //EDIT THIS QUERY IN USE     \/\/\/   //
    ///////////////////////////////////////
    public String CREATE_TABLE="CREATE TABLE "+ DATA_TABLE_NAME +"( "+
                                DATA_MODEL_ID+" TEXT PRIMARY KEY, "+
                                DATA_MODEL_TITLE+" TEXT,"+
                                DATA_MODEL_CONTENT+" TEXT )";

    ////////////////////////////////////////
    //Constructor
    ///////////////////////////////////////
    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VER);
    }
    /////////////////////////////////////

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ DATA_TABLE_NAME);
        onCreate(db);
    }
}
