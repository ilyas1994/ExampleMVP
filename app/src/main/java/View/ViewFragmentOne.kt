package View

import Presetner.DataClass
import Presetner.Presenter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.examplemvp.MainActivity
import com.example.examplemvp.R

const val EDIT_TEXT_ONE = "editOne"
const val EDIT_TEXT_TWO = "editTwo"
class ViewFragmentOne : Fragment() {
    lateinit var editTextOne: EditText
    lateinit var editTextTwo: EditText
    lateinit var buttonCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initsView()
        setOnclickListener()

    }
   private fun initsView(){
        editTextOne = view?.findViewById(R.id.editTextOne)!!
        editTextTwo = view?.findViewById(R.id.editTextTwo)!!
        buttonCalculate = view?.findViewById(R.id.buttonCalculate)!!
    }
    private fun setOnclickListener(){
        var mainActivity = (activity as MainActivity)
        var dataClass = DataClass.Companion
        buttonCalculate.setOnClickListener {
            if (editTextOne.text.isNotEmpty() && editTextTwo.text.isNotEmpty()){
               dataClass.mapk.put(EDIT_TEXT_ONE, editTextOne.text)
                dataClass.mapk.put(EDIT_TEXT_TWO, editTextTwo.text)
                mainActivity.switchFragment(ViewFragmentTwo())
            } else Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
        }
    }
}
