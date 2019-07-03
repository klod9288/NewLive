package srongklod_bangtamruat.p.newlive;

import android.content.Context;
import android.content.Intent;
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

import org.json.JSONArray;
import org.json.JSONObject;

public class MainFragment extends Fragment {


    public MainFragment() {
//      Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        LoginController
        SignInController();

//        Register Content
        RegisterContent();


    }//Main Method

    private void RegisterContent() {

        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment, new RegisterFragment()).addToBackStack(null).commit();
            }
        });

    }

    private void SignInController() {

        Button button = getActivity().findViewById(R.id.btnSignIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText userEditText = getView().findViewById(R.id.edtUserMain);
                EditText passwordEditText = getView().findViewById(R.id.edtPasswordMain);

                String user = userEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (user.equals("nameUser")||password.equals("12345")) {

                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.contentMainFragment,new ToolbarSlide()).commit();

                }

            }
        });

    }//Method SignIn

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}//Main Class
