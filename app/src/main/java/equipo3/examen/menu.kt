package equipo3.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTacos : Button = findViewById(R.id.button_tacos) as Button
        val btnCaldos : Button = findViewById(R.id.button_caldos) as Button
        val btnAntojitos : Button = findViewById(R.id.button_antojitos) as Button
        val btnTortas : Button = findViewById(R.id.button_tortas) as Button
        val btnSopas : Button = findViewById(R.id.button_sopas) as Button
        val btnDrinks : Button = findViewById(R.id.button_drinks) as Button
        val btnEspecialidades : Button = findViewById(R.id.button_especialidades) as Button
        val btnSides : Button = findViewById(R.id.button_sides) as Button

        btnTacos.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","tacos")
            startActivity(intent)
        }

        btnCaldos.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","caldos")
            startActivity(intent)
        }

        btnAntojitos.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","antojitos")
            startActivity(intent)
        }

        btnTortas.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","tortas")
            startActivity(intent)
        }

        btnSopas.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","sopas")
            startActivity(intent)
        }

        btnDrinks.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","drinks")
        }

        btnEspecialidades.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","especialidades")
        }

        btnSides.setOnClickListener {
            var intent:Intent = Intent(this, ProductosActivity::class.java).putExtra("type","sides")
        }

    }
}