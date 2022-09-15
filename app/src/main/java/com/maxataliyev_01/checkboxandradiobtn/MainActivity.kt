package com.maxataliyev_01.checkboxandradiobtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import com.maxataliyev_01.checkboxandradiobtn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId=binding.rgMeat.checkedRadioButtonId
            val meat=findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese=binding.cbCheese.isChecked
            val onion=binding.cbOnion.isChecked
            val salad=binding.cbSalad.isChecked
            val orderString="You ordered a burger with:\n"+
                    "${meat.text}"+
                    (if(cheese) {"\ncheese" } else { "" })+
                    (if(onion) {"\nonion" } else { "" })+
                    (if(salad) {"\nsalad" } else { "" })

            binding.tvOrder.text=orderString
        }

    }
}