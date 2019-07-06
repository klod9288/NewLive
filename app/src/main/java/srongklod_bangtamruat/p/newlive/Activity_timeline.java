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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class Activity_timeline extends Fragment {

    private boolean statusABoolean = true;
    private EditText keyEditText;
    private TextView getEditText;
    private String keyString;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initialView();
        calcultestring();
        onClick();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_timeline, container, false);
        return view;

    }

    private void onClick() {

        ImageButton imageButton = getView().findViewById(R.id.imvSendData);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keyString = keyEditText.getText().toString().trim();
                if (statusABoolean) {
                    getEditText.setText(keyString);
                }
            }
        });
    }

    private void calcultestring() {
        try {
            keyString = keyEditText.getText().toString().trim();
            getEditText.setText(keyString);

        } catch (Exception e) {

        }
    }

    private void initialView() {
        keyEditText = getView().findViewById(R.id.edtChat);
        getEditText = getView().findViewById(R.id.txtShowChat);

    }

}//Main Class
