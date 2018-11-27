package com.example.alumno.ejemplo09_navigationdraweryfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.alumno.ejemplo09_navigationdraweryfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToolsFragment extends Fragment {

    private Context contexto;
    private EditText txtUsuario;
    private EditText txtPwd;
    private Button btnLogin;


    public ToolsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_import, container, false); // Sustituimos esta linea ...
        View rootView = inflater.inflate(R.layout.fragment_tools, container, false); // ... por esta otra

        txtUsuario = rootView.findViewById(R.id.txtUsuario);
        txtPwd = rootView.findViewById(R.id.txtPwd);
        btnLogin = rootView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsuario.getText().toString().equals("progresa@progresa.com") && (txtPwd.getText().toString().equals("progresa"))){
                                        
                }
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
