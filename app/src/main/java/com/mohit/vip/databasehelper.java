package com.mohit.vip;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class databasehelper extends SQLiteOpenHelper {

    static String DB_Name="form.db";
    static  int DB_Version =1;

    public  static  String Table_Name="Responses";
    public static  String ID_COL ="Id";
    public  static String NAME_COL="Name";
    public  static  String AGE_COL="Age";
    public static String GENDER_COL ="Gender";
    public static String EMAIL_COL ="Email_id";
    public static String MOB_COL ="Mobile";
    public static String COLLEGE_COL ="College";
    public static String YEAR_COL ="Year_of_Study";
    public static String AREA_COL ="Area of Expertise";
    public static String TECHS_COL ="Technologies";
    public static String WORKING_COL ="Specializations";
    public static String LINK_COL ="Linkedln_Profile";
    public static String FB_COL ="Facebook_Profile";
    public static String GIT_COL ="Github_Profile";
    public static String RESUME_COL ="Resume";
    public static String WHY_COL ="Why";
    public static String SHARE_COL ="Share";
    public static String ANY_COL ="Any";
    public static String REF_COL ="Ref";


    public static String query= "create table "+Table_Name+" (" +
            ""+ID_COL+" integer primary key autoincrement, " +
            ""+NAME_COL+" text, " +
            ""+AGE_COL+" integer, " +
            ""+GENDER_COL+" text, " +
            ""+EMAIL_COL+" text, " +
            ""+MOB_COL+" text, " +
            ""+COLLEGE_COL+" text, " +
            ""+YEAR_COL+" text, " +
            ""+AREA_COL+" text, " +
            ""+TECHS_COL+" text, " +
            ""+WORKING_COL+" text, " +
            ""+LINK_COL+" text, " +
            ""+FB_COL+" text, " +
            ""+GIT_COL+" text, " +
            ""+RESUME_COL+" text, " +
            ""+WHY_COL+" text, " +
            ""+SHARE_COL+" text, " +
            ""+ANY_COL+" text, " +
            ""+REF_COL+" text)";


    public databasehelper(@Nullable Context context) {
        super(context, DB_Name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(query);
        }
        catch (Exception ee){
            Log.e("ERROR",ee.toString());
        }
    }
    public boolean insertFeedback(in gf){
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(NAME_COL, gf.name);
            cv.put(AGE_COL, gf.age);
            cv.put(GENDER_COL, gf.gender);
            cv.put(EMAIL_COL, gf.email);
            cv.put(MOB_COL, gf.mob);
            cv.put(COLLEGE_COL, gf.college);
            cv.put(YEAR_COL, gf.year);
            cv.put(AREA_COL, gf.area);
            cv.put(TECHS_COL, gf.techs);
            cv.put(WORKING_COL, gf.working);
            cv.put(LINK_COL, gf.link);
            cv.put(FB_COL, gf.fb);
            cv.put(GIT_COL, gf.git);
            cv.put(RESUME_COL, gf.resume);
            cv.put(WHY_COL, gf.why);
            cv.put(SHARE_COL, gf.share);
            cv.put(ANY_COL, gf.any);
            cv.put(REF_COL, gf.ref);
            db.insert(Table_Name, null, cv);
        }catch (Exception ex){
            return false;
        }
        return  true;
    }

    public ArrayList<in> getAllFeedBack(){
        ArrayList<in> gList = new ArrayList<in>();
        try{
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor c =db.rawQuery("SELECT * FROM "+Table_Name,null);
            while (c.moveToNext()) {
                String name = c.getString(c.getColumnIndex(NAME_COL));
                int age = c.getInt(c.getColumnIndex(AGE_COL));
                String gender = c.getString(c.getColumnIndex(GENDER_COL));
                String email = c.getString(c.getColumnIndex(EMAIL_COL));
                String mob = c.getString(c.getColumnIndex(MOB_COL));
                String college = c.getString(c.getColumnIndex(COLLEGE_COL));
                String year = c.getString(c.getColumnIndex(YEAR_COL));
                String area = c.getString(c.getColumnIndex(AREA_COL));
                String techs = c.getString(c.getColumnIndex(TECHS_COL));
                String working = c.getString(c.getColumnIndex(WORKING_COL));
                String link = c.getString(c.getColumnIndex(LINK_COL));
                String fb = c.getString(c.getColumnIndex(FB_COL));
                String git = c.getString(c.getColumnIndex(GIT_COL));
                String resume = c.getString(c.getColumnIndex(RESUME_COL));
                String why = c.getString(c.getColumnIndex(WHY_COL));
                String share = c.getString(c.getColumnIndex(SHARE_COL));
                String any = c.getString(c.getColumnIndex(ANY_COL));
                String ref = c.getString(c.getColumnIndex(REF_COL));
                in fg = new in(name,mob,email,gender,age,college,year,area,techs,working,link,fb,git,resume,why,share,any,ref);
                gList.add(fg);
            }
        }catch(Exception ex){
            Log.e("ERROR",ex.toString());
        }
        return gList;



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
