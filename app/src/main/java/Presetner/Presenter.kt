package Presetner

import Model.Calculate
import View.EDIT_TEXT_ONE
import View.EDIT_TEXT_TWO
import View.ViewFragmentTwo
import android.app.Activity
import androidx.fragment.app.Fragment
import com.example.examplemvp.MainActivity

class Presenter: Contract.Presenter, Contract.View {
    override fun onClickCalculate(): Int {
        val dataClass = DataClass.Companion
        val edit1 = dataClass.mapk[EDIT_TEXT_ONE]
        val edit2 = dataClass.mapk[EDIT_TEXT_TWO]
        var model = Calculate()
        var res = model.result(edit1.toString().toInt(), edit2.toString().toInt())
        return res

    }

    override fun switchFragmentTwo(fragment: Fragment): Fragment {
        return fragment
    }

}