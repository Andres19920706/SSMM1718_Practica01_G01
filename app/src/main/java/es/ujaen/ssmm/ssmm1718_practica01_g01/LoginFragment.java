package es.ujaen.ssmm.ssmm1718_practica01_g01;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

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
        View fragment = inflater.inflate(R.layout.fragment_login, container, false);
        Button conect =  (Button) fragment.findViewById(R.id.button_fragment_login_enviar); //Castin porque lo que delvuelve conect es un objet generico

        final EditText name = (EditText) fragment.findViewById(R.id.editText_login_user);

        conect.setOnClickListener(new View.OnClickListener(){
          //Lo que hacemos cuando se ulse
            String nombre = name.getText().toString();//Extraemos lo que hay dentro del
            //getContext donde se muestra.
            Toast.makeText(getContext(),"Hola"+nombre, Toast.LENGTH_LONG).show(); //Método estatico que permite mostrar mensajes en pantalla

        }); //Establecemos un evento a la pulsacion
        return fragment;
    }

}
