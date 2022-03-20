package equipo3.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnTacos : Button = findViewById(R.id.button_tacos)
        val btnCaldos : Button = findViewById(R.id.button_caldos)
        val btnAntojitos : Button = findViewById(R.id.button_antojitos)
        val btnTortas : Button = findViewById(R.id.button_tortas)
        val btnSopas : Button = findViewById(R.id.button_sopas)
        val btnDrinks : Button = findViewById(R.id.button_drinks)
        val btnEspecialidades : Button = findViewById(R.id.button_especialidades)
        val btnSides : Button = findViewById(R.id.button_sides)




    }
}