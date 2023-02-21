package brian.jimenez.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class PaymentResumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_resume)
        var bundle: Bundle? = intent.extras

        var title: String? = bundle!!.getString("name")
        var image: Int? = bundle!!.getInt("image")
        var seat: Int? = bundle!!.getInt("id")

        val imageMovie = findViewById<ImageView>(R.id.FilmImagePayment)
        val titleMovie = findViewById<TextView>(R.id.FilmNamePayment)
        val clientName = findViewById<EditText>(R.id.clientName)
        val seatMovie = findViewById<TextView>(R.id.selectedSeat)

        titleMovie.text = title
        if (image != null) {
            imageMovie.setImageResource(image)
        }
        seatMovie.text = " $seat"
        val backButton: Button = findViewById(R.id.buttonCatalog)

        backButton.setOnClickListener {
            if (clientName == null) {
                Toast.makeText(this, "Please fill Name section", Toast.LENGTH_LONG).show()
            } else {
                var intent = Intent(this, MovieDetail::class.java)
                intent.putExtra("title", title)
                intent.putExtra("name", clientName.text)
                intent.putExtra("seat", seat)
                startActivity(intent)
            }
        }

    }
}