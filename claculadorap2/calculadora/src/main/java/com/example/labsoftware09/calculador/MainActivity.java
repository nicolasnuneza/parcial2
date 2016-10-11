package com.example.labsoftware09.calculador;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.prmja.http.prmja_com;

import java.io.IOException;
import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {
    private TextView tV;
    double a,b;
    String op;
    private Button igual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV=(TextView) findViewById(R.id.textV);
        tV.setText("0");
    igual=(Button) findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(tV.getText().toString());
                try {
                    server_post(a,b,op);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
    public void server_post(double a,double b, String op) throws IOException {
        String res = "";
        try {
            String[] params = {"a", ""+a, "b", ""+b,"o",op};
            //Http Get Method
            res = prmja_com.Post("http://162.243.64.94/dm.php", params);
            tV.setText(res);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    public void resta(View v){
        a=Double.parseDouble( tV.getText().toString());
        op="res";
        tV.setText("0");

    }

    public void multiplicacion(View v){
        a=Double.parseDouble( tV.getText().toString());
        op="mul";
        tV.setText("0");


    }

    public void division(View v){
        a=Double.parseDouble( tV.getText().toString());
        op="div";
        tV.setText("0");


    }
    public void suma(View v){
        a=Double.parseDouble( tV.getText().toString());
        op="sum";
        tV.setText("0");

    }

    public void punto(View v){

        tV.setText(tV.getText()+".");

    }

    public void num_1(View v){
        if(tV.getText()=="0"){
            tV.setText("1");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"1");
        }

    }

    public void num_2(View v){
        if(tV.getText()=="0"){
            tV.setText("2");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"2");
        }

    }

    public void num_3(View v){
        if(tV.getText()=="0"){
            tV.setText("3");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"3");
        }

    }

    public void num_4(View v){
        if(tV.getText()=="0"){
            tV.setText("4");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"4");
        }

    }

    public void num_5(View v){
        if(tV.getText()=="0"){
            tV.setText("5");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"5");
        }

    }

    public void num_6(View v){
        if(tV.getText()=="0"){
            tV.setText("6");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"6");
        }

    }

    public void num_7(View v){
        if(tV.getText()=="0"){
            tV.setText("7");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"7");
        }

    }

    public void num_8(View v){
        if(tV.getText()=="0"){
            tV.setText("8");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"8");
        }

    }

    public void num_9(View v){
        if(tV.getText()=="0"){
            tV.setText("9");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"9");
        }

    }

    public void num_0(View v){
        if(tV.getText()=="0"){
            tV.setText("0");
        }else if(tV.getText()!="0"){
            tV.setText(tV.getText()+"0");
        }

    }

    public void onClickLimpia(View miView)
    {
        a=0.0;
        b=0.0;
        TextView tv = (TextView) findViewById(R.id.textV) ;
        tv.setText("");
    }
}
