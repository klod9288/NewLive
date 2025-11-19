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

    private boolean statusABoolean = true;
    String keyString;
    ImageView imageView1,imageView2,imageView3;
    Button button,button2;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        IMV();
        ButtonIMV();
        ButtonIMV2();

    }//Method onActivityCreated

    private void IMV() {

        button = getView().findViewById(R.id.btn_control_imv2);
        button2 = getView().findViewById(R.id.btn_right);

        imageView1 = getView().findViewById(R.id.imvGame1);
        imageView2 = getView().findViewById(R.id.imvGame2);
        imageView3 = getView().findViewById(R.id.imvGame3);

    }//Method IMV

    private void ButtonIMV() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.attack_000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_001);
                        imageView1.setImageDrawable(null);
                    }
                }, 300);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_002);
                    }
                },400);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_003);
                    }
                },500);

                Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_004);
                    }
                },600);

                Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_005);
                    }
                },700);

                Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_006);
                    }
                },800);

                Handler handler6 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_007);
                    }
                },900);

                Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_008);
                    }
                },1000);

                Handler handler8 = new Handler();
                handler8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.attack_009);
                        imageView3.setImageDrawable(null);
                    }
                },1100);

                Handler handler9 = new Handler();
                handler9.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_000);
                    }
                },1200);

            }
        });
    }//Method Btn imvView1

    private void ButtonIMV2() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2.setImageResource(R.drawable.run_000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView2.setImageResource(R.drawable.run_001);

                    }
                }, 300);
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
