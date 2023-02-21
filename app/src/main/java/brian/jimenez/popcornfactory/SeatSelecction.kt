package brian.jimenez.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class SeatSelecction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selecction)


        val titleBar: TextView = findViewById(R.id.titleSeat)

        var bundle: Bundle? = intent.extras
        var title: String? = bundle!!.getString("name")
        var image: Int? = bundle!!.getInt("image")

        titleBar.text = (title)

        var positionMovie: Int = -1

        var button01: RadioButton = findViewById(R.id.seat01)
        var button02: RadioButton = findViewById(R.id.seat02)
        var button03: RadioButton = findViewById(R.id.seat03)
        var button04: RadioButton = findViewById(R.id.seat04)
        var button05: RadioButton = findViewById(R.id.seat05)
        var button06: RadioButton = findViewById(R.id.seat06)
        var button07: RadioButton = findViewById(R.id.seat07)
        var button08: RadioButton = findViewById(R.id.seat08)
        var button09: RadioButton = findViewById(R.id.seat09)
        var button10: RadioButton = findViewById(R.id.seat10)
        var button11: RadioButton = findViewById(R.id.seat11)
        var button12: RadioButton = findViewById(R.id.seat12)
        var button13: RadioButton = findViewById(R.id.seat13)
        var button14: RadioButton = findViewById(R.id.seat14)
        var button15: RadioButton = findViewById(R.id.seat15)
        var button16: RadioButton = findViewById(R.id.seat16)
        var button17: RadioButton = findViewById(R.id.seat17)
        var button18: RadioButton = findViewById(R.id.seat18)
        var button19: RadioButton = findViewById(R.id.seat19)
        var button20: RadioButton = findViewById(R.id.seat20)


        button01.setOnClickListener {
            positionMovie = 1
        }

        button02.setOnClickListener {
            positionMovie = 2
        }

        button03.setOnClickListener {
            positionMovie = 3
        }

        button04.setOnClickListener {
            positionMovie = 4
        }

        button05.setOnClickListener {
            positionMovie = 5
        }

        button06.setOnClickListener {
            positionMovie = 6
        }

        button07.setOnClickListener {
            positionMovie = 7
        }

        button08.setOnClickListener {
            positionMovie = 8
        }

        button09.setOnClickListener {
            positionMovie = 9
        }

        button10.setOnClickListener {
            positionMovie = 10
        }

        button11.setOnClickListener {
            positionMovie = 11
        }

        button12.setOnClickListener {
            positionMovie = 12
        }

        button13.setOnClickListener {
            positionMovie = 13
        }

        button14.setOnClickListener {
            positionMovie = 14
        }

        button15.setOnClickListener {
            positionMovie = 15
        }

        button16.setOnClickListener {
            positionMovie = 16
        }

        button17.setOnClickListener {
            positionMovie = 17
        }

        button18.setOnClickListener {
            positionMovie = 18
        }

        button19.setOnClickListener {
            positionMovie = 19
        }

        button20.setOnClickListener {
            positionMovie = 20
        }

        val row1: RadioGroup = findViewById(R.id.row1)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)

        var rb: RadioButton? = null

        row1.setOnCheckedChangeListener{
                group, checkedId ->

            if(checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)

                rb = findViewById<View>(checkedId) as RadioButton
            }
        }

        row2.setOnCheckedChangeListener{
                group, checkedId ->

            if(checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
                rb = findViewById<View>(checkedId) as RadioButton
            }
        }

        row3.setOnCheckedChangeListener{
                group, checkedId ->

            if(checkedId > -1){
                row1.clearCheck()
                row2.clearCheck()
                row4.clearCheck()

                row3.check(checkedId)
                rb = findViewById<View>(checkedId) as RadioButton
            }
        }

        row4.setOnCheckedChangeListener{
                group, checkedId ->

            if(checkedId > -1){
                row1.clearCheck()
                row2.clearCheck()
                row3.clearCheck()

                row4.check(checkedId)
                rb = findViewById<View>(checkedId) as RadioButton
            }
        }

        val confirm: Button = findViewById(R.id.confirmButton)

        confirm.setOnClickListener {

            rb!!.isEnabled = false

            Toast.makeText(this, "Enjoy the movie", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent(this, PaymentResumeActivity::class.java)

            intent.putExtra("id", positionMovie)
            intent.putExtra("name", title)
            intent.putExtra("image", image)

            this.startActivity(intent)
        }

    }

}