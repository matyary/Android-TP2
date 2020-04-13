package Fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.utn.tp2.R

/**
 * A simple [Fragment] subclass.
 */
class Fragment3 : Fragment() {

    lateinit var text: TextView
    lateinit var view_f3: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view_f3 = inflater.inflate(R.layout.fragment_3, container, false)

        text = view_f3.findViewById(R.id.textView)

        return view_f3
    }

    override fun onStart() {
        super.onStart()

        text.setTextColor(Color.BLUE)
    }
}
