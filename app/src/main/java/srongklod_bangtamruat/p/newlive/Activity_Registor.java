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

public class Activity_Registor extends Fragment {
    private Button saveButton;
    private EditText idEditText, userEditText, passwordEditText;
    private String idString, userString, passwordString;
    private boolean inABoolean = true;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initiaView();
    }//Main Class

    private void initiaView() {
        saveButton = getView().findViewById(R.id.btnSave);
        idEditText = getView().findViewById(R.id.edtID);
        userEditText = getView().findViewById(R.id.edtUser);
        passwordEditText = getView().findViewById(R.id.edtPassword);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity__registor,container,false);
        return view;

    }
}//Main Class