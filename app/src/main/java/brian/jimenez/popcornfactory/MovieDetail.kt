package brian.jimenez.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val bundle = intent.extras



        var title: String? = bundle!!.getString("title")
        var image: Int? = bundle!!.getInt("image")
        var header: Int? = bundle!!.getInt("header")
        var sinopsis: String? = bundle!!.getString("sinopsis")
        var id = -1
        var ns = 0
        title = ""


        var descriptionTitle: TextView = findViewById(R.id.movie_title_detail) as TextView
        var descriptionHeader: ImageView = findViewById(R.id.movie_header) as ImageView
        var descriptionSinopsis: TextView = findViewById(R.id.movie_summary) as TextView
        var seatLeft: TextView = findViewById(R.id.seatsLeft) as TextView
        var buyTicketsButton: Button = findViewById(R.id.buyTickets)




        if (bundle != null) {
            ns = bundle.getInt("numberSeats")
            title = bundle.getString("titulo")
            if (header != null) {
                descriptionHeader.setImageResource(header)
            }
            descriptionTitle.setText(title)
            descriptionSinopsis.setText(sinopsis)
            seatLeft.setText("$ns seat avalible")
            id = bundle.getInt("pos")
        }


        if(ns==0){
            buyTicketsButton.isEnabled = false
        } else {
            buyTicketsButton.isEnabled = true
            buyTicketsButton.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelecction::class.java)

                intent.putExtra("id", id)
                intent.putExtra("name", title)

                this.startActivity(intent)

        }


        }

    }
}