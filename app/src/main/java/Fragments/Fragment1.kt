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
class Fragment1 : Fragment() {

    lateinit var view_f1: View
    lateinit var user_f1: EditText
    lateinit var pass_f1: EditText
    lateinit var btn_new_user: Button
    lateinit var btn_f1_to_f2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view_f1 = inflater.inflate(R.layout.fragment_1, container, false)

        user_f1 = view_f1.findViewById(R.id.editText_user_f1)
        pass_f1 = view_f1.findViewById(R.id.editText_pass_f1)
        btn_new_user = view_f1.findViewById(R.id.button_f1)
        btn_f1_to_f2 = view_f1.findViewById(R.id.button_f1_to_f2)

        return view_f1
    }

    override fun onStart() {
        super.onStart()

        btn_new_user.setOnClickListener {

            val user = user_f1.getText().toString()
            val pass = pass_f1.getText().toString()

            if ( user != " " && pass != "  ") {
                val action2 = Fragment1Directions.actionFragment1ToFragment2(user,pass)
                view_f1.findNavController().navigate(action2)
            }
            else{
                Snackbar.make(view_f1, "Datos incompletos", Snackbar.LENGTH_LONG).show()
            }
        }

        btn_f1_to_f2.setOnClickListener {
            view_f1.findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
    }
}
