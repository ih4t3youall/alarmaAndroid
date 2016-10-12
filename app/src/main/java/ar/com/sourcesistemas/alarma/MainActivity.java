package ar.com.sourcesistemas.alarma;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Set;

import static android.R.attr.action;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter blueadApter;

    private Set<BluetoothDevice> pairedDevices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = this;


        Button btnBlue = (Button)findViewById(R.id.btnBlue);
        Button toggleButton = (Button)findViewById(R.id.toggleButton);


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //blueadApter = BluetoothAdapter.getDefaultAdapter();
                Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(turnOn, 0);



            }
        });













        //Intent intent = new Intent(context, MainActivity2.class);
        //startActivity(intent);









    }
}
