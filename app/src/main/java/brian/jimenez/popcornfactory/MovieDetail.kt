package brian.jimenez.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        var bundle: Bundle? = intent.extras

        var title: String? = bundle!!.getString("title")
        var image: Int? = bundle!!.getInt("image")
        var header: Int? = bundle!!.getInt("header")
        var sinopsis: String? = bundle!!.getString("sinopsis")

        var descriptionTitle: TextView = findViewById(R.id.FilmNameDescription) as TextView
        var descriptionHeader: ImageView = findViewById(R.id.FilmImageDescription) as ImageView
        var descriptionSinopsis: TextView = findViewById(R.id.FilmSinopsisDescription) as TextView

        if (bundle != null) {
            descriptionTitle.setText(title)
            if (header != null) {
                descriptionHeader.setImageResource(header)
            }
            descriptionSinopsis.setText(sinopsis)
        }
    }
}