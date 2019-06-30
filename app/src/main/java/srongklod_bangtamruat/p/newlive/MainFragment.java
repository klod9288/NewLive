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

import org.json.JSONArray;
import org.json.JSONObject;

public class MainFragment extends Fragment {

    public MainFragment() {
//      Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Register content

        registerContent();

//        LoginController
        loginController();

    }//Main Method

    private void loginController() {

        Button button = getActivity().findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText userEditText = getView().findViewById(R.id.edtUser);
                EditText passwordEditText = getView().findViewById(R.id.edtPassword);

                String user = userEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (user.isEmpty() || password.isEmpty()) {


                } else {

                    try {

                        GetUserWhereUserThead getUserWhereUserThead = new GetUserWhereUserThead(getActivity());
                        MyConstant myConstant = new MyConstant();

                        getUserWhereUserThead.execute(user,myConstant.toString());
                        String json = getUserWhereUserThead.get();


                        if (json.equals("null")) {


                        } else {

                            JSONArray jsonArray = new JSONArray(json);
                            JSONObject jsonObject = jsonArray.getJSONObject(0);

                            if (password.equals(jsonObject.getString("password"))) {

//                                Password True
                                getActivity().getSupportFragmentManager().beginTransaction()
                                        .replace(R.id.contentMainFragment, new RegisterFragment()).commit();

                            } else {
//                                Password false


                            }

                        }

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }

            }//Method onClick
        });

    }//Method loginController

    private void registerContent() {
        TextView textView = getView().findViewById(R.id.txtRegister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment, new RegisterFragment()).addToBackStack(null).commit();
            }
        });
    }//Method registerContent

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//      Inflater the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}//Main Class
