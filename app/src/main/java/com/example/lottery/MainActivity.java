package com.example.lottery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private TextView[] g1= new TextView[6];
    private int[] g1n = {R.id.g1_num1,R.id.g1_num2,R.id.g1_num3,R.id.g1_num4,R.id.g1_num5,R.id.g1_num6};
    private TextView[] g2= new TextView[6];
    private int[] g2n = {R.id.g2_num1,R.id.g2_num2,R.id.g2_num3,R.id.g2_num4,R.id.g2_num5,R.id.g2_num6};
    private TextView[] g3= new TextView[6];
    private int[] g3n = {R.id.g3_num1,R.id.g3_num2,R.id.g3_num3,R.id.g3_num4,R.id.g3_num5,R.id.g3_num6};
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        for (int i =0; i<g1.length; i++){
            g1[i] = findViewById(g1n[i]);
            g1[i].setText("-");
        }
        for (int i =0; i<g2.length; i++){
            g2[i] = findViewById(g2n[i]);
            g2[i].setText("-");
        }
        for (int i =0; i<g3.length; i++){
            g3[i] = findViewById(g3n[i]);
            g3[i].setText("-");
        }
    }

    public void lottery(View view){
        int[] nums1 = createLottery();
        for (int i=0;i< g1.length;i++){
            g1[i].setText(""+ nums1[i]);
        }
        int[] nums2 = createLottery();
        for (int i=0;i< g2.length;i++){
            g2[i].setText(""+ nums2[i]);
        }
        int[] nums3 = createLottery();
        for (int i=0;i< g2.length;i++){
            g3[i].setText(""+ nums3[i]);
        }
    }

    private int[] createLottery(){
        HashSet<Integer> nums = new HashSet<>();
        while (nums.size()<6){
            nums.add((int)(Math.random()*49+1));
        }
        int i =0; int[] ret = new int[6];
        for (Integer num :nums){
            ret[i] = num;
            i++;
        }
        return ret;
    }

}