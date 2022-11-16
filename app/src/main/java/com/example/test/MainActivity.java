package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void CheckClick(View view){

        try {
            Spinner sp1 = findViewById(R.id.spinner1);
            Spinner sp2 = findViewById(R.id.spinner2);
            Spinner sp3 = findViewById(R.id.spinner3);
            Spinner sp4 = findViewById(R.id.spinner4);
            Spinner sp5 = findViewById(R.id.spinner5);
            Spinner sp6 = findViewById(R.id.spinner6);
            Spinner sp7 = findViewById(R.id.spinner7);
            Spinner sp8 = findViewById(R.id.spinner8);
            Spinner sp9 = findViewById(R.id.spinner9);
            Spinner sp10 = findViewById(R.id.spinner10);


            ArrayList list_user_answer = new ArrayList();
            list_user_answer.add(sp1.getSelectedItem().toString());
            list_user_answer.add(sp2.getSelectedItem().toString());
            list_user_answer.add(sp3.getSelectedItem().toString());
            list_user_answer.add(sp4.getSelectedItem().toString());
            list_user_answer.add(sp5.getSelectedItem().toString());
            list_user_answer.add(sp6.getSelectedItem().toString());
            list_user_answer.add(sp7.getSelectedItem().toString());
            list_user_answer.add(sp8.getSelectedItem().toString());
            list_user_answer.add(sp9.getSelectedItem().toString());
            list_user_answer.add(sp10.getSelectedItem().toString());

            ArrayList list_answer = new ArrayList();
            list_answer.addAll(Arrays.asList(new String[]{
                    "1861", "988", "Елизавета I", "6 августа 1945", "1949", "1991",
                    "Хз", "Бенджамин Франклин", "Кровавое воскресенье",
                    "Хотел больше свободного времени и помочь детям"}));

            int result = 0;
            for (int i=0; i<10; i++){
                Object answer = list_answer.get(i);
                if (list_user_answer.get(i).equals(list_answer.get(i)))
                    result++;
            }
            Intent intent = new Intent( this, Result_Activity1.class);
            intent.putExtra("user_result", ("Вы набрали: " + result+ " из 10")); startActivity(intent);
        }
        catch (Exception ex){
            Toast t = Toast.makeText(this,ex.getMessage(), Toast.LENGTH_LONG);
            t. show();
        }

    }
}