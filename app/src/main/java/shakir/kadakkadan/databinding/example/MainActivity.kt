package shakir.kadakkadan.databinding.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun getUserApi(): User {
        return User(
            "SHAKIR", "28", "shakir", "Shakir", "emst.shakir@gmail.com"
        )
    }

}
