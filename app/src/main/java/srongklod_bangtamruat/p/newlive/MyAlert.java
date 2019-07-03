package srongklod_bangtamruat.p.newlive;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class MyAlert {

    private Context context;


    public MyAlert(Context context) {
        this.context = context;
    }



    public void ThisIsDialog(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}
