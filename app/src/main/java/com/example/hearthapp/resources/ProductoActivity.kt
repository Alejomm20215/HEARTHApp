package com.example.hearthapp.resources

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.hearthapp.R
import com.example.hearthapp.UserScreenHome
import kotlinx.android.synthetic.main.activity_producto.*

class ProductoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto)

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.violet_clear)
        window.statusBarColor = this.resources.getColor(R.color.background)

        findViewById<Button>(R.id.sdg_3_btn4).setOnClickListener {
            intent = Intent(this, UserScreenHome::class.java)
            startActivity(intent)
        }

        val producto = intent.getSerializableExtra("producto") as Producto

        nombre_producto.text = producto.nombre
        detalles_producto.text = producto.description
        imagen.setImageResource(producto.image)
    }
}