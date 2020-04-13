package Fragments

import Entities.Login
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.utn.tp2.R

/**
 * A simple [Fragment] subclass.
 */
class Fragment2 : Fragment() {

    lateinit var logueo: Login
    lateinit var loqueo_aux: Array<String>
    lateinit var view_f2: View
    lateinit var user_f2: EditText
    lateinit var pass_f2: EditText
    lateinit var btn_f2_to_f3: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view_f2 = inflater.inflate(R.layout.fragment_2, container, false)

        user_f2 = view_f2.findViewById(R.id.editText_user_f2)
        pass_f2= view_f2.findViewById(R.id.editText_pass_f2)
        btn_f2_to_f3 = view_f2.findViewById(R.id.button_f2_to_f3)

        return view_f2
    }

    override fun onStart() {
        super.onStart()

        lateinit var usuario2: String
        lateinit var clave2: String

        btn_f2_to_f3.setOnClickListener {

            val user = user_f2.getText() .toString()
            val pass = pass_f2.getText().toString()

            Fragment2Args.fromBundle(arguments!!).copy(usuario2, clave2)
            if (user == usuario2 && pass == clave2) {
                Fragment2Directions.actionFragment2ToFragment3()
                view_f2.findNavController().navigate(R.id.action_fragment2_to_fragment3)
            }
            else{
                Snackbar.make(view_f2, "Error de inicio de sesión", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}






