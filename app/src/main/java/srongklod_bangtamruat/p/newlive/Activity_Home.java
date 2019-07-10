package srongklod_bangtamruat.p.newlive;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Home extends Fragment {

    private Button button;
    private EditText userEditText;
    private EditText passwordEditText;
    private String userString;
    private String passwordString;
    private TextView AdminTextView, RegisterTextView;
    private boolean intABoolean = true;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initialView();
        controller();
        ControllerAdmin();
        ControllerRegister();
    }//Main Class

    private void ControllerRegister() {
        RegisterTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ContentMain, new Activity_Registor()).addToBackStack(null).commit();
            }
        });
    }

    private void initialView() {
        button = getView().findViewById(R.id.btnSignIn);
        userEditText = getView().findViewById(R.id.edtUserMain);
        passwordEditText = getView().findViewById(R.id.edtPasswordMain);
        AdminTextView = getView().findViewById(R.id.txtAdmin);
        RegisterTextView = getView().findViewById(R.id.txtRegister);
    }

    private void controller() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                if (userString.equals("user") || passwordString.equals("12345")) {
                    getActivity().getSupportFragmentManager()
                            .beginTransaction().replace(R.id.ContentMain, new Activity_timeline())
                            .addToBackStack(null).commit();
                }
            }

        });
    }//Controller Button

    private void ControllerAdmin() {


        AdminTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.ContentMain, new Admin_Fragment()).addToBackStack(null).commit();
            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity__home, container, false);
        return view;

    }//Method onCreateView
}//Main Class
