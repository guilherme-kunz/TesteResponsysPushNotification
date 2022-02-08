package guilherme.kunz.com.testeoracleresponsys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pushio.manager.PushIOManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PushIOManager.getInstance(applicationContext).registerApp()
    }
}