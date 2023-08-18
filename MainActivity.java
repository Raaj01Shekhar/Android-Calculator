package com.example.sci_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView e1,e2;
    Float a,b;
    int c, n=0;
    double d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(TextView)findViewById(R.id.rslt);
        e2=(TextView)findViewById(R.id.dtl);

    }

    static float fact(float a)
    {
        float i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn0:
                e1.setText(e1.getText()+"0");
                e2.setText(e2.getText()+"0");
                break;

            case R.id.btn00:
                e1.setText(e1.getText()+"00");
                e2.setText(e2.getText()+"00");
                break;

            case R.id.btn1:
                e1.setText(e1.getText()+"1");
                e2.setText(e2.getText()+"1");
                break;

            case R.id.btn2:
                e1.setText(e1.getText()+"2");
                e2.setText(e2.getText()+"2");
                break;

            case R.id.btn3:
                e1.setText(e1.getText()+"3");
                e2.setText(e2.getText()+"3");
                break;

            case R.id.btn4:
                e1.setText(e1.getText()+"4");
                e2.setText(e2.getText()+"4");
                break;

            case R.id.btn5:
                e1.setText(e1.getText()+"5");
                e2.setText(e2.getText()+"5");
                break;

            case R.id.btn6:
                e1.setText(e1.getText()+"6");
                e2.setText(e2.getText()+"6");
                break;

            case R.id.btn7:
                e1.setText(e1.getText()+"7");
                e2.setText(e2.getText()+"7");
                break;

            case R.id.btn8:
                e1.setText(e1.getText()+"8");
                e2.setText(e2.getText()+"8");
                break;

            case R.id.btn9:
                e1.setText(e1.getText()+"9");
                e2.setText(e2.getText()+"9");
                break;

            case R.id.btn_dml:
                e1.setText(e1.getText()+".");
                e2.setText(e2.getText()+".");
                break;

            case R.id.btn_e:
                e1.setText(e1.getText()+"2.718282");
                e2.setText(e2.getText()+"2.718282");
                break;

            case R.id.btn_pi:
                e1.setText(e1.getText()+"3.141593");
                e2.setText(e2.getText()+"3.141593");
                break;

            case R.id.btn_f:
                e1.setText(e1.getText()+"1.618034");
                e2.setText(e2.getText()+"1.618034");
                break;

            case R.id.btn_add:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"+");
                n=1;
                break;

            case R.id.btn_sub:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"-");
                n=2;
                break;

            case R.id.btn_mul:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"*");
                n=3;
                break;

            case R.id.btn_div:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"/");
                n=4;
                break;

            case R.id.btn_pct:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"%");
                n=5;
                break;

            case R.id.btn_nn:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"^");
                n=6;
                break;

            case R.id.btn_sqr:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"^2");
                n=7;
                break;

            case R.id.btn_qb:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"^3");
                n=8;
                break;

            case R.id.btn_sqrt:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(sqrt)");
                n=9;
                break;

            case R.id.btn_cbrt:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(cbrt)");
                n=10;
                break;

            case R.id.btn_fact:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"!");
                n=11;
                break;

            case R.id.btn_eo:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(E/O)");
                n=12;
                break;

            case R.id.btn_prm:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(Prime)");
                n=13;
                break;

            case R.id.btn_sod:
                c=Integer.parseInt(e1.getText()+"");
                c=Integer.parseInt(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(SoD)");
                n=14;
                break;

            case R.id.btn_arm:
                c=Integer.parseInt(e1.getText()+"");
                c=Integer.parseInt(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(AS)");
                n=15;
                break;

            case R.id.btn_pldrm:
                c=Integer.parseInt(e1.getText()+"");
                c=Integer.parseInt(e2.getText()+"");
                e1.setText(null);
                e2.setText(e2.getText()+"(Pldrm)");
                n=16;
                break;

            case R.id.btn_sin:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("sin("+d+")");
                n=17;
                break;

            case R.id.btn_cos:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("cos("+d+")");
                n=18;
                break;

            case R.id.btn_tan:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("tan("+d+")");
                n=19;
                break;

            case R.id.btn_sec:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("sec("+d+")");
                n=20;
                break;

            case R.id.btn_cosec:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("cosec("+d+")");
                n=21;
                break;

            case R.id.btn_cot:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("cot("+d+")");
                n=22;
                break;

            case R.id.btn_tanh:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText("tanh("+d+")");
                n=23;
                break;

            case R.id.btn_atanh:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=24;
                break;

            case R.id.btn_log:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=25;
                break;

            case R.id.btn_alog:
                d=Double.parseDouble(e1.getText()+"");
                d=Double.parseDouble(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=26;
                break;

            case R.id.btn_npr:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=27;
                break;

            case R.id.btn_ncr:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=28;
                break;

            case R.id.btn_nrootm:
                a=Float.parseFloat(e1.getText()+"");
                a=Float.parseFloat(e2.getText()+"");
                e1.setText(null);
                e2.setText(null);
                n=29;
                break;

            case R.id.btn_eq:

            case R.id.btn_ans:

                if (n==1){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(a+b+"");
                    n=0;
                }

                else if (n==2){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(a-b+"");
                    n=0;
                }

                else if (n==3){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(a*b+"");
                    n=0;
                }

                else if (n==4){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(a/b+"");
                    n=0;
                }

                else if (n==5){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText((a/b)*100+"");
                    n=0;
                }

                else if (n==6){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(Math.pow(a,b)+"");
                    n=0;
                }

                else if (n==7){
                    e1.setText(Math.pow(a,2)+"");
                    // e1.setText(a*a+"");          (or we can use it too)
                    n=0;
                }

                else if (n==8) {
                    e1.setText(Math.pow(a, 3) + "");
                    // e1.setText(a*a*a+"");          (or we can use it too)
                    n = 0;
                }

                else if (n==9) {
                    e1.setText(Math.sqrt(a) + "");
                    n = 0;
                }

                else if (n==10) {
                    e1.setText(Math.cbrt(a) + "");
                    n = 0;
                }

                else if (n==11) {
                    int c=1;
                    for(int i=1; i<=a; i++){
                        c=c*i;
                    }
                    e1.setText(c+"");
                    n = 0;
                }

                else if (n==12) {
                    if(a%2==0){
                        e1.setText("Even Number");
                    }
                    else{
                        e1.setText("Odd Number");
                    }
                    n = 0;
                }

                else if (n==13) {
                    int i,flag=0;
                    float m=0;
                    m=a/2;
                    if (a==0||a==1){
                        e1.setText("Not Prime Number");
                    }
                    else{
                        for (i=2; i<=m; i++){
                            if(a%i==0){
                                e1.setText("Not Prime Number");
                                flag=1;
                                break;
                            }
                        }
                        if (flag==0){
                            e1.setText("Prime Number");
                        }
                    }
                    n = 0;
                }

                else if (n==14) {
                    int d,s=0;
                    while(c>0){
                        d=c%10;
                        s=s+d;
                        c=c/10;
                    }
                    e1.setText(s+"");
                    n = 0;
                }

                else if (n==15){
                    int o,r,result=0,x=0;
                    o=c;
                    for (; o!=0; o=o/10, ++x);
                    o=c;
                    for (; o!=0; o=o/10){
                        r=o%10;
                        result +=Math.pow(r,x);
                    }
                    if(result==c){
                        e1.setText("Yes");
                    }
                    else{
                        e1.setText("No");
                    }
                    n=0;
                }

                else if (n==16){
                    int rem,sum=0,temp;
                    temp=c;
                    while (c>0){
                        rem=c%10;
                        sum=(sum*10)+rem;
                        c=c/10;
                    }
                    if(temp==sum){
                        e1.setText("Yes");
                    }
                    else{
                        e1.setText("No");
                    }
                    n=0;
                }

                else if(n==17){
                    double rad=Math.toRadians(d);
                    double sinval=Math.sin(rad);
                    e1.setText(sinval+"");
                    n=0;
                }

                else if(n==18){
                    double rad=Math.toRadians(d);
                    double cosval=Math.cos(rad);
                    e1.setText(cosval+"");
                    n=0;
                }

                else if(n==19){
                    double rad=Math.toRadians(d);
                    double tanval=Math.tan(rad);
                    e1.setText(tanval+"");
                    n=0;
                }

                else if(n==20){
                    double rad=Math.toRadians(d);
                    double secval=1/Math.sin(rad);
                    e1.setText(secval+"");
                    n=0;
                }

                else if(n==21){
                    double rad=Math.toRadians(d);
                    double cosecval=1/Math.cos(rad);
                    e1.setText(cosecval+"");
                    n=0;
                }

                else if(n==22){
                    double rad=Math.toRadians(d);
                    double cotval=1/Math.tan(rad);
                    e1.setText(cotval+"");
                    n=0;
                }

                else if(n==23){
                    double rad=Math.toRadians(d);
                    double tanhval=Math.tanh(rad);
                    e1.setText(tanhval+"");
                    n=0;
                }

                else if(n==24){
                    e=Double.parseDouble(e1.getText()+"");
                    double atanhval=Math.atan2(d, e);
                    e1.setText(atanhval+"");
                    e2.setText(d+"atanh("+e+")");
                    n=0;
                }

                else if(n==25){
                    e=Double.parseDouble(e1.getText()+"");
                    e1.setText(Math.log(d)/Math.log(e)+" ");
                    e2.setText("log"+e+"("+d+")");
                    n=0;
                }

                else if(n==26){
                    e=Double.parseDouble(e1.getText()+"");
                    e1.setText(Math.pow(d,e)+" ");
                    e2.setText("antilog"+d+"("+e+")");
                    n=0;
                }

                else if(n==27){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText((fact(a)/fact(a-b))+" ");
                    e2.setText(a+"(P)"+b);
                    n=0;
                }

                else if(n==28){
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(fact(a)/(fact(b)*fact(a-b))+" ");
                    e2.setText(a+"(C)"+b);
                    n=0;
                }

                else if (n==29) {
                    b=Float.parseFloat(e1.getText()+"");
                    e1.setText(Math.pow(a, 1/b) + "");
                    e2.setText(b+"th rt("+a+")");
                    n = 0;
                }

                else{
                    e1.setText(null);
                    e2.setText(null);
                }
                break;

            case R.id.btn_str:
                e1.setText("0");
                e2.setText("0");
                break;

            case R.id.btn_cl:
                if (n==0){
                    e1.setText(null);
                    e2.setText(null);
                }
                break;
        }
    }
}