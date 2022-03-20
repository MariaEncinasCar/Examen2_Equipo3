package equipo3.examen

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

var productos = ArrayList<Product>()

class ProductosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)
        productos.clear()

        val extras = intent.extras
        var listView : ListView = findViewById(R.id.listProductos)
        if(extras != null){
            val value = extras.getString("type")
            print(value)
            when(value){
                "tacos"  -> agregarTacos()
                "sopas"  -> agregarSopas()
                "antojitos"  -> agregarAntojitos()
                "especialidades"  -> agregarEspecialidades()
                "caldos"  -> agregarCaldos()
                "combinations"  -> agregarCombinations()
                "tortas"  -> agregarTortas()
                "sides"  -> agregarSides()
                "drinks"  -> agregarBebidas()
                else -> agregarTacos()
            }
        }
        var adaptador: AdaptadorProductos = AdaptadorProductos(this, productos)
        listView.adapter = adaptador


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

    fun agregarAntojitos(){
        productos.add(Product(
            R.string.quesadilla.toString(),
            R.drawable.quesadillas,
            R.string.quesadilla_desc.toString(),
            4.75
        ))

        productos.add(Product(
            R.string.huaraches.toString(),
            R.drawable.huarache,
            R.string.huaraches_desc.toString(),
            9.87

        ))

        productos.add(Product(
            R.string.gringas.toString(),
            R.drawable.gringa,
            R.string.gringas_desc.toString(),
            6.47
        ))

        productos.add(Product(
            R.string.sincronizadas.toString(),
            R.drawable.sincronizada,
            R.string.sincronizadas_desc.toString(),
            6.99
        ))

        productos.add(Product(
            R.string.sopes.toString(),
            R.drawable.sopes,
            R.string.sopes_desc.toString(),
            3.39

        ))

        productos.add(Product(
            R.string.tostadas.toString(),
            R.drawable.tostada,
            R.string.tostadas_desc.toString(),
            3.55

        ))
    }

    fun agregarEspecialidades(){

    }

    fun agregarCaldos(){

    }

    fun agregarCombinations(){

    }

    fun agregarTortas(){

    }

    fun agregarSides(){

    }

    fun agregarBebidas(){

    }

    private class AdaptadorProductos: BaseAdapter {
        var productos = ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, productos: ArrayList<Product>){
            this.productos = productos
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return productos.size
        }

        override fun getItem(p0: Int): Any {
            return productos.get(p0)
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var prod = productos[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)

            var imagen = vista.findViewById(R.id.imagenProducto) as ImageView
            var nombre = vista.findViewById(R.id.nombreProducto) as TextView
            var desc = vista.findViewById(R.id.descripcionProducto) as TextView
            var precio = vista.findViewById(R.id.precioProducto) as TextView

            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista

        }


    }

}