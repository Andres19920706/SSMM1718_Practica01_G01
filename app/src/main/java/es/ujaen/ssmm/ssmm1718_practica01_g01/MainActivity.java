package es.ujaen.ssmm.ssmm1718_practica01_g01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText name,pwd,dir,port;
    Button button1;
    LoginFragment mi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Mostrar fragment
    public void mostrarFragment(View v){






    }
    //Limpiar cajas de texto
    public void limpiarTexto(View v){
        /*
        //Ejemplo de compo pasar el cotenido de un EditText a un textView.
        EditText text1;
        TextView text2;
        text1 = (EditText) findViewById(R.id.inputName);
        text2 = (TextView) findViewById(R.id.labelName);

        String a = text1.getText().toString(); //Extremos el texto escrito
        text2.setText(a);
        */
        name = (EditText) findViewById(R.id.inputName);
        pwd = (EditText) findViewById(R.id.inputPwd);
        dir = (EditText) findViewById(R.id.inputDireccion);
        port = (EditText) findViewById(R.id.inputPuerto);

        name.setText("");
        pwd.setText("");
        dir.setText("");
        port.setText("");

    }
}
