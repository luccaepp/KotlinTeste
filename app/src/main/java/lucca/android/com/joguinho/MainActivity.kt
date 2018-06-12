package lucca.android.com.joguinho

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import lucca.android.com.joguinho.adapters.ViewPagerAdapter
import lucca.android.com.joguinho.frags.FragmentOne
import lucca.android.com.joguinho.frags.FragmentTwo

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener  {

    val CONTEXT: Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
        setupTabs()

    }

    fun setupTabs(){

    var tabLayout: TabLayout? = findViewById(R.id.tabLayout)
    var viewPager: ViewPager? = findViewById(R.id.pageViewer)

    var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

    adapter.addFragment(FragmentOne(), "One")
    adapter.addFragment(FragmentTwo(), "Two")


    viewPager?.setAdapter(adapter)
    tabLayout?.setupWithViewPager(viewPager)
    tabLayout?.setAnimation(null)


}

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_camera -> {
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

}