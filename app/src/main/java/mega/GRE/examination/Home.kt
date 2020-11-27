package mega.GRE.examination

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class Home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var btn2: Button? = null
    var btn3: Button? = null
    var dem: Button? = null
    var btn90: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        btn2 = findViewById<View>(R.id.button) as Button
        btn3 = findViewById<View>(R.id.button3) as Button
        btn90= findViewById<View>(R.id.demo) as Button
        dem = findViewById<View>(R.id.demo) as Button
        dem!!.setOnClickListener { }
        btn2!!.setOnClickListener {
            val i = Intent(this@Home, MainActivitytab::class.java)
            startActivity(i)
        }
        btn90!!.setOnClickListener {
            val browserIntent3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gmUX4Brfqag&feature=youtu.be"))
            startActivity(browserIntent3)
        }

        btn3!!.setOnClickListener {
            val i1 = Intent(this@Home, University::class.java)
            startActivity(i1)
        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean { // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_settings) {
            val intent = Intent(this@Home, Settings::class.java)
            startActivity(intent)
            return true
        }
        if (id == R.id.Exit) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // Handle navigation view item clicks here.
        val id = item.itemId
        if (id == R.id.feedback) {
            val i1 = Intent(this@Home, Feedback::class.java)
            startActivity(i1)
            // Handle the camera action
        } else if (id == R.id.faqs) {
            val i2 = Intent(this@Home, Faqs::class.java)
            startActivity(i2)
        } else if (id == R.id.features) {
            val i3 = Intent(this@Home, Features::class.java)
            startActivity(i3)
        } else if (id == R.id.universities) {
            val i5 = Intent(this@Home, University::class.java)
            startActivity(i5)
        } else if (id == R.id.terms) {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.privacypolicygenerator.info/live.php?token=cmy9m6FaeOr6GQG69rrkMVDE4YAr2Mdw"))
            startActivity(browserIntent)
        } else if (id == R.id.privacy) {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.termsandconditionsgenerator.com/live.php?token=2PJ5fxQLXip3eC8tG14sUfFQkl0MmtIe"))
            startActivity(browserIntent)
        } else if (id == R.id.reasons) {
            val i8 = Intent(this@Home, Reasons::class.java)
            startActivity(i8)
        } else if (id == R.id.contact) {
            val i9 = Intent(this@Home, Contactus::class.java)
            startActivity(i9)
        }
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}