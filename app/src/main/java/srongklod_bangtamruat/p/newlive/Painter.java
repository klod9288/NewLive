package srongklod_bangtamruat.p.newlive;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class Painter extends Fragment {

    private ImageView imageView1, imageView2,imageView3;
    private Button button1,button2;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        IMV();
        ButtonIMV();
       // ButtonIMV2();
    }//Method

    public void IMV() {

        imageView1 = getView().findViewById(R.id.imageView1);
        imageView2 = getView().findViewById(R.id.imageView2);
        imageView3 = getView().findViewById(R.id.imageView3);
        button1 = getView().findViewById(R.id.btn);
        button2 = getView().findViewById(R.id.btn2);

    }//Method IMV

    private void ButtonIMV() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(R.drawable.attack_000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_000);
                        imageView3.setImageResource(R.drawable.swordsmanattack1);
                        imageView1.setImageDrawable(null);
                    }
                }, 300);

                Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_002);
                    }
                },400);

                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_003);
                    }
                },500);

                Handler handler3 = new Handler();
                handler3.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_004);
                    }
                },600);

                Handler handler4 = new Handler();
                handler4.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_005);
                    }
                },700);

                Handler handler5 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_006);
                    }
                },800);

                Handler handler6 = new Handler();
                handler5.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_007);
                    }
                },900);

                Handler handler7 = new Handler();
                handler7.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_008);
                    }
                },1000);

                Handler handler8 = new Handler();
                handler8.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView2.setImageResource(R.drawable.attack_009);
                        imageView2.setImageDrawable(null);
                    }
                },1100);

                Handler handler9 = new Handler();
                handler9.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageDrawable(null);
                    }
                }, 1200);

                Handler handler10 = new Handler();
                handler10.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView1.setImageResource(R.drawable.attack_000);
                    }
                },1400);

            }
        });
    }//Method Btn imgView1

    private void ButtonIMV2() {

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView3.setImageResource(R.drawable.swordsmanattack1);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView3.setImageResource(R.drawable.swordsmanattack1);
                        imageView3.setImageDrawable(null);
                    }
                },500);
            }
        });

    }//Method Btn imgView2

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_painter, container, false);

        return view;

    }//Method View
}//Class