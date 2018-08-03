package co.ntx.firstkotiln

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    var tv : TextView = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.text1)
        tv.text = ("hello world!")
    }

    private fun init(){

    }

    fun a(a : Int, b : Int) : Int{
        return a + b
    }
}
