package salor.firstlab;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.*;
import android.widget.*;

public class FirstOne extends AppCompatActivity {
    //This is my very first app in Android Studio!!!
    //By Enkil (Arturo Salinas Ortiz A01335189)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstOne.this,SecondOne.class);
                startActivity(intent);
            }

        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstOne.this,ThirdOne.class);
                startActivity(intent);
            }

        });

    }
}
