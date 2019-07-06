package srongklod_bangtamruat.p.newlive;

import android.app.TimePickerDialog;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Activity_timeline extends Fragment {

//    private String timeString;
//    private TextView timeTextView;
//    private int hourAnInt, minusAnInt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }//Main Class

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_timeline, container, false);
        return view;

    }

//    private void showTime(int hourAnInt,int minusAnInt) {
//
//        timeTextView = getView().findViewById(R.id.txtTime);
//        timeString = (hourAnInt) + ":" + (minusAnInt);
//        timeTextView.setText(timeString);
//
//    }
//    private void showTimeDialog() {
//        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(),
//                new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int inthour, int intMinus) {
//                     showTime(inthour,intMinus);
//                     setTime();
//                    }
//                },hourAnInt,minusAnInt,true);
//        timePickerDialog.show();
//    }
//
//    private void setTime() {
//        Calendar calendar = Calendar.getInstance();
//        hourAnInt = calendar.get(Calendar.HOUR_OF_DAY);
//        minusAnInt = calendar.get(Calendar.MINUTE);
//        showTime(hourAnInt,minusAnInt);
//
//    }

}//Main Class
