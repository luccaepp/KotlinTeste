package lucca.android.com.joguinho.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    private val fragments = LinkedHashMap<Fragment, String>()

    override fun getItem(position: Int): Fragment? {
        return fragments.keys.elementAt(position)
    }

    override fun getCount(): Int {
        return  fragments.keys.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragments[fragment] = title
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragments.values.elementAt(position)
    }
}