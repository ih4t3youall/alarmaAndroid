package ar.com.sourcesistemas.alarma;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by juan.m.lequerica on 10/11/2016.
 */

public class MainActivity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button buton = (Button)findViewById(R.id.button2);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Le boton 2", Toast.LENGTH_SHORT).show();
            }
        });





    }
}


