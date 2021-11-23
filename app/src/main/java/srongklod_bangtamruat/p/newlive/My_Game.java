package srongklod_bangtamruat.p.newlive;

import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class My_Game extends Fragment {
    ImageView imageView1,imageView2;
    Button button;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        IMV();
        ButtonIMV();

    }//Method onActivityCreated

    private void IMV() {

        button = getView().findViewById(R.id.btn_control_imv2);
        imageView1 = getView().findViewById(R.id.imvGame1);

    }

    private void ButtonIMV() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.attack_000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_001);
                    }
                }, 300);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_002);
                    }
                },400);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_003);
                    }
                },500);

                Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_004);
                    }
                },600);

                Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_005);
                    }
                },700);

                Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_006);
                    }
                },800);

                Handler handler6 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_007);
                    }
                },900);

                Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_008);
                    }
                },1000);

                Handler handler8 = new Handler();
                handler8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_009);
                    }
                },1100);

            }
        });
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.my_game, container, false);
        return view;

    }//Method onCreateView

}//Main Class
