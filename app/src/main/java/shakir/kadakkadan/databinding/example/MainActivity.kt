package shakir.kadakkadan.databinding.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import shakir.kadakkadan.databinding.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = getUserApi()
    }


    fun getUserApi(): User {
        return User(
            "SHAKIR", "28", "shakir", "Shakir", "emst.shakir@gmail.com"
        )
    }

}
