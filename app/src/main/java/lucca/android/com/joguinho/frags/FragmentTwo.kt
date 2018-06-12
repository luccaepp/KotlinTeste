package lucca.android.com.joguinho.frags

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import lucca.android.com.joguinho.R

/**
 * Created by lucca on 12/06/2018.
 */

class FragmentTwo : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val root = inflater.inflate(R.layout.fragmenttwo , container, false)

        return root
    }

}