package Presetner

import View.ViewFragmentTwo
import androidx.fragment.app.Fragment

interface Contract {

    interface Presenter{
        fun onClickCalculate(): Int

    }

     interface View {
       fun switchFragmentTwo(fragment: Fragment): Fragment

    }
}