package es.ujaen.ssmm.ssmm1718_practica01_g01;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import es.ujaen.ssmm.ssmm1718_practica01_g01.packageUsuario.ConnectionUserData;


public class MainActivity extends AppCompatActivity {

    EditText name,pwd,dir,port;
    Button button1;
    LoginFragment mi;

    private String datosVolatiles = "Hola";
    private TextView volatil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Guardar datos para cambios de estados (un giro produce un cambio de estadio)

        //Comprobamos si hay datos guardados
        if(savedInstanceState != null){ //Al inicar la aplicaicón por primera vez es nulo, cuando cambia de estado ya no es nulo
            datosVolatiles= savedInstanceState.getString("volatil",datosVolatiles); //Nombre del parametro y un valor por defecto, en caso de que no este
                        //Si hay algo en "volatil" se lo asigna a datosVolatiles, en caso contrario, mantiene el valor de datosVolatiles

        }

        volatil = (TextView) findViewById(R.id.volatil); //Le damos un valor a volatil, cuando se inica la aplicacion
        volatil.setText(datosVolatiles);
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

    //Salir de la app
    public void salir(View v){
        //https://www.youtube.com/watch?v=-Qy3sQt5McQ
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    //Al pulsar sobre el titulo
    public void onclic (View vista){
        datosVolatiles = datosVolatiles.toUpperCase(); //Ponemos el contenido en Mayuscula,
                                                    //al girar la pantalla se desace este cambio, dado que esta en memoria.
        volatil.setText(datosVolatiles);

    }

    //resumido a pausdo
    @Override //Indica que es un metodo declarado en la clase padre
    protected void onSaveInstanceState(Bundle outState){
        //Este método permite guardarda datos
        super.onSaveInstanceState(outState);
        
        outState.putString("volatil",datosVolatiles); //Guardamos el valor de "volatil" que es un TexView en un Bundle antes de cambiar de estado
                    //En caso de "volatil" ser null, le asigna un valor por defecto que es volatil.
    }


    //Conecptos
    //Diseño alternativo -> permite ajustar a las direfentes pantallas.
}
