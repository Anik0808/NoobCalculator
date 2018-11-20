package com.example.anik.noobcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    public static String first="";
    public static String sec="";
    public static String answer="";
    public static boolean change=true;
    public static String sign="";

      Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,clear,result;
      TextView display;
//    public  Button b1= findViewById(R.id.button1);
//    public  Button b2= findViewById(R.id.button2);
//    public  Button b3= findViewById(R.id.button3);
//    public  Button b4= findViewById(R.id.button4);
//    public  Button b5= findViewById(R.id.button5);
//    public  Button b6= findViewById(R.id.button6);
//    public  Button b7= findViewById(R.id.button7);
//    public  Button b8= findViewById(R.id.button8);
//    public  Button b9= findViewById(R.id.button9);
//    public  Button sum= findViewById(R.id.buttonsum);
//    public  Button sub= findViewById(R.id.buttonsub);
//    public  Button mul= findViewById(R.id.buttonmul);
//    public  Button div= findViewById(R.id.buttondiv);
//    public  Button clear= findViewById(R.id.buttonClear);
//    public  Button result= findViewById(R.id.buttonresult);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0= findViewById(R.id.button0);
        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4= findViewById(R.id.button4);
        b5= findViewById(R.id.button5);
        b6= findViewById(R.id.button6);
        b7= findViewById(R.id.button7);
        b8= findViewById(R.id.button8);
        b9= findViewById(R.id.button9);
        sum= findViewById(R.id.buttonsum);
        sub= findViewById(R.id.buttonsub);
        mul= findViewById(R.id.buttonmul);
        div= findViewById(R.id.buttondiv);
        clear= findViewById(R.id.buttonClear);
        result= findViewById(R.id.buttonresult);


        disableSings();


         display=findViewById(R.id.display);

         b0.setEnabled(false);

         b0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 setValue(0,change);
                 display.setText(answer);
                 check(change);

             }
         });


         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 setValue(1,change);
                 display.setText(answer);
                 b0.setEnabled(true);
                 check(change);
             }
         });

         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 setValue(2,change);
                 display.setText(answer);
                 b0.setEnabled(true);
                 check(change);
             }
         });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(3,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(4,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(5,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(6,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(7,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(8,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(9,change);
                display.setText(answer);
                b0.setEnabled(true);
                check(change);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer="";
                first="";
                sec="";
                sign="";
                change=true;
                display.setText("");
                disableSings();
                b0.setEnabled(false);
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="+";
                display.setText(sign);
                answer="";
                change=false;
                check(false);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="-";
                display.setText(sign);
                answer="";
                change=false;
                check(false);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="*";
                display.setText(sign);
                answer="";
                change=false;
                check(false);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="/";
                display.setText(sign);
                answer="";
                change=false;
                check(false);
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sec.length()!=0){
                    answer=calculation(sign,first,sec);
                    display.setText(answer);
                    answer="";
                    first="";
                    sec="";
                    change=true;
                    disableSings();
                }
                else {

                }

//                display.setText(" "+ first+" "+" "+ sign+" "+ sec+" " +answer+" ");
//                first=answer;
//                answer="";
//                sec="";
//                change=false;
//                enableSings();
            }
        });
        
    }

    public static void setValue(int value, boolean change){
        if (change){
            first+=value;

        }
        else {
            sec+=value;

        }

        answer+=value;


    }

    public void disableSings(){
        sub.setEnabled(false);
        sum.setEnabled(false);
        div.setEnabled(false);
        mul.setEnabled(false);

    }

    public void enableSings(){
        sub.setEnabled(true);
        sum.setEnabled(true);
        div.setEnabled(true);
        mul.setEnabled(true);
    }

    public void check(boolean change){
        if (change){
            enableSings();
        }
        else {
            disableSings();
        }
    }

    public static String calculation(String sign,String first, String sec){
        String answer="";
        try {
            switch (sign){
                case "+":
                    answer=String.valueOf(Integer.parseInt(first)+Integer.parseInt(sec));
                    break;

                case "-":
                    answer=String.valueOf(Integer.parseInt(first)-Integer.parseInt(sec));
                    break;


                case "*":
                    answer=String.valueOf(Integer.parseInt(first)*Integer.parseInt(sec));
                    break;

                case "/":
                    if ((Integer.parseInt(first)%Integer.parseInt(sec))==0){
                        answer=String.valueOf(Integer.parseInt(first)/Integer.parseInt(sec));
                    }
                    else {
                        float cal=Integer.parseInt(first);
                        cal=cal/Integer.parseInt(sec);
                        answer=String.valueOf(cal);
                    }

            }
        }
        catch (Exception e){
            answer= "ERROR!\nGO easy, It's a noob Calculator.";
        }

        return answer;
    }
}
