package equipo3.examen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

var productos = ArrayList<Product>()

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        productos.clear()
    }


    fun agregarTacos(){
        productos.add(Product(
            R.string.tacoT.toString(),
            R.drawable.tacos,
            R.string.tacoT_desc.toString(),
            2.35
        ))

        productos.add(Product(
            R.string.tacoP.toString(),
            R.drawable.tacos,
            R.string.tacoP_desc.toString(),
            2.35
        ))
    }

    fun agregarSopas(){
        productos.add(Product(
            R.string.pozole.toString(),
            R.drawable.pozole,
            R.string.pozole_desc.toString(),
            5.99

        ))

        productos.add(Product(
            R.string.menudo.toString(),
            R.drawable.menudo,
            R.string.menudo_desc.toString(),
            5.99

        ))


        productos.add(Product(
            R.string.caldoRes.toString(),
            R.drawable.caldores,
            R.string.caldoRes_desc.toString(),
            5.99

        ))

        productos.add(Product(
            R.string.caldoCamaron.toString(),
            R.drawable.caldocamaron,
            R.string.caldoCamaron_desc.toString(),
            10.69

        ))

        productos.add(Product(
            R.string.sopaMariscos.toString(),
            R.drawable.sopamariscos,
            R.string.sopaMariscos_desc.toString(),
            15.75

        ))

        productos.add(Product(
            R.string.coctelCamaron.toString(),
            R.drawable.coctelcamaron,
            R.string.coctelCamaron_desc.toString(),
            13.50

        ))



    }
}