package srongklod_bangtamruat.p.newlive;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
public class Activity_timeline extends Fragment {

    private boolean statusABoolean = true;
    private EditText keyEditText;
    private TextView getEditText;
    private String keyString;
    private ImageView imageUpload;
    private Uri uri;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initialView();
        calcultestring();
        onClick();
        ImageonClick();
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
                    keyEditText.setText("");
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
        imageUpload = getView().findViewById(R.id.imvUpload);

    }

    @Override
    public void onActivityResult(int requestCode, final int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == getActivity().RESULT_OK) {

            statusABoolean = false;

            uri = data.getData();

            try {

                Bitmap bitmap = BitmapFactory
                        .decodeStream(getActivity().getContentResolver().openInputStream(uri));
                imageUpload.setImageBitmap(bitmap);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void ImageonClick() {
        imageUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "Please Choose Image"), 1);


            }
        });
    }
}//Main Class
