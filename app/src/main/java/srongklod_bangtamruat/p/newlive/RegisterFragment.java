package srongklod_bangtamruat.p.newlive;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterFragment extends AppCompatActivity  {

    private SQLiteHelper mSQLite;
    private SQLiteDatabase mDB;
    private EditText userEditText;
    private EditText passwordEditText;
    private EditText idEditText;

    private int _id = -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        mSQLite = SQLiteHelper.getInstance(this);
        idEditText = findViewById(R.id.edtID);
        userEditText = findViewById(R.id.edtUser);
        passwordEditText = findViewById(R.id.edtPassword);

//        SaveController
        saveController();

    }//Main Method

    @Override
    public void onStart() {
        super.onStart();

        Intent intent = getIntent();
        String id = intent.getStringExtra("_id");
        if (id == null) {
            return;
        } else {

            _id = Integer.valueOf(id);
        }

        String sql =
                "SELECT * FROM important_dat " +
                        "WHERE _id = " + _id;

        mDB = mSQLite.getReadableDatabase();
        Cursor cursor = mDB.rawQuery(sql, null);
        cursor.moveToNext();
        idEditText.setText(cursor.getString(1));
        userEditText.setText(cursor.getString(2));
        passwordEditText.setText(cursor.getString(3));

        cursor.close();
    }//Method onStart

    private void saveController() {

        Button button = findViewById(R.id.btnSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addImportantDay();
            }
        });
    }//Method saveController

    private void addImportantDay() {

        int id = Integer.valueOf(idEditText.getText().toString());
        String userString = userEditText.getText().toString().trim();
        String passwordString = passwordEditText.getText().toString().trim();

        if (!isDataComplete(id, userString, passwordString)) {

            return;
        }
        if (_id == -1) {

            insert(id,userString,passwordString);

        } else {

            update(id,userString,passwordString);
        }


    }//Method addImportDay

    private void insert(int id,String userString,String passwordString) {

        MyAlert myAlert = new MyAlert(getParent());
        String sql =
                "INSERT INTO important_day(id,userStr,passwordStr)"+
                        "VALUES(?,?,?)";

        String[] args = {id+"",userString,passwordString};
        mDB = mSQLite.getWritableDatabase();
        mDB.execSQL(sql,args);
        myAlert.ThisIsDialog("Up to you","Save Success");
    }

    private void update(int id,String userString,String passwordString) {

        MyAlert myAlert = new MyAlert(getParent());
        String sql =
                "UPDATE important_day " +
                        "SET id = ?, userString = ?, passwordString = ? " +
                        "WHERE _id = ? ";

        String[] args = {id+"",userString+"",passwordString+""};
        mDB = mSQLite.getWritableDatabase();
        mDB.execSQL(sql,args);
        myAlert.ThisIsDialog("รอสักคู่กำลังบันทึก","Save Success");
    }

    private boolean isDataComplete(int disPlayID, String disPlayUser,String disPlaypassword) {

        MyAlert myAlert = new MyAlert(getParent());
        if (disPlayID < 0) {
            myAlert.ThisIsDialog("ต้องมากกว่า 0 เท่านั้น","ลองใหม่อีกครั้ง");
            return false;
        }

        if (disPlayUser.equals("")||disPlaypassword.equals("")) {
            myAlert.ThisIsDialog("มีความว่างเปล่า","จงลงไป ชื่อของคุณนั่นและ");
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}//Main Class
