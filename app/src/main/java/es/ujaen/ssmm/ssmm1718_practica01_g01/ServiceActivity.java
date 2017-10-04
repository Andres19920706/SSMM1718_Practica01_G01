package es.ujaen.ssmm.ssmm1718_practica01_g01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ServiceActivity extends AppCompatActivity {
    //Constante
    public static final String PARAM_USER ="param_user"; //Viene bien para usarla
    public static final String PARAM_PORT ="param_port";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //Extremos los datos que le pasamos
        String user = getIntent().getStringExtra(PARAM_USER);
        //short port = getIntent().getShortExtra(PARAM_PORT,(short)600);
        Toast.makeText(this,"Hola "+user,Toast.LENGTH_SHORT).show();

        //faltaq instancia una clase

        //Mostramos en un textview
        TextView title = (TextView) findViewById(R.id.textView);
        title.setText("Hola "+user);
    }
}
