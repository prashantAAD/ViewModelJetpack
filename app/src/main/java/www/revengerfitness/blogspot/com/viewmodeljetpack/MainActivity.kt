package www.revengerfitness.blogspot.com.viewmodeljetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
private lateinit var mainViewModel:MainViewModel
    private lateinit var txtCounter: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel= ViewModelProvider(this)[MainViewModel::class.java]
        txtCounter = findViewById(R.id.txtCounter)
        setText()
    }



    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }

    fun increment(v:View) {
        mainViewModel.increment()
        setText()
    }
}