package es.ujaen.ssmm.ssmm1718_practica01_g01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.ujaen.ssmm.ssmm1718_practica01_g01.packageUsuario.ConnectionUserData;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param_ip";
    private static final String ARG_PARAM2 = "param_port";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;


    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param ip Parameter 1.
     * @param port Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String ip, int port) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, ip);
        args.putInt(ARG_PARAM2, port);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Método que crea el fragmento
     * @param savedInstanceState Paquete con parametros.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1); //Para la ip
            mParam2 = getArguments().getInt(ARG_PARAM2); //Para el puerto
        }
    }

    /**
     * Método que crea la vista (Layout)
     * @param inflater
     * @param container Vista donde me lo muestre
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_login, container, false); //ESTO PUEDE GENERAR UNA EXCEPCION

        //Obtenemos los datos introducios por el usuario
        Button conect =  (Button) fragment.findViewById(R.id.buttonOkLoggin); //Castin porque lo que delvuelve conect es un objet generico

        final EditText name = (EditText) fragment.findViewById(R.id.inputName);
        final EditText pass = (EditText) fragment.findViewById(R.id.inputPwd);
        final EditText dir = (EditText) fragment.findViewById(R.id.inputDireccion);
        final EditText puerto = (EditText) fragment.findViewById(R.id.inputPuerto);

        //Evento de pulsación del boton "conectar"
        conect.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Lo que hacemos cuando se ulse
                String user = name.getText().toString();//Extraemos lo que hay dentro del getContext donde se muestra.
                String pwd  = pass.getText().toString();
                String ip = dir.getText().toString();
                short port;
                try{
                    port = Short.parseShort(puerto.getText().toString());
                }catch(java.lang.NumberFormatException io){
                    port = 6000; //Por por defecto
                }

                //Guardamos
                ConnectionUserData data = new ConnectionUserData(user,pwd,ip,port);

                //Mensaje al usuario
                Toast.makeText(getContext(),"Hola "+user+" "+pwd+" "+ip+" ("+port+")", Toast.LENGTH_LONG).show(); //Método estatico que permite mostrar mensajes en pantalla

                //Llamamos a una actividad meidante un intent (intencón)
                Intent nueva = new Intent(getActivity(),ServiceActivity.class);//El contexto desde donde llamo y la actividad que queiro

                //Pasamso los datos antes de iniciar l
                nueva.putExtra(ServiceActivity.PARAM_USER,data.getUser()); //ETIQUETA, DATA
                nueva.putExtra("param_pwd",data.getPwd()); //ETIQUETA, DATA
                nueva.putExtra("param_ip",data.getConnectionIP()); //ETIQUETA, DATA
                nueva.putExtra("param_port",data.getConnectionPort()); //ETIQUETA, DATA

                //agrego la actividad
                startActivity(nueva); //Pone en segundo plano la MainActivity y muestra la neuva actividad.

            }


        }); //Establecemos un evento a la pulsacion
        return fragment;
    }

}
