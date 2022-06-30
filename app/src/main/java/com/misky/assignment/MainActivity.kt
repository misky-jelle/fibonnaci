package com.Misky.assigment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.misky.assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList= displayFabonacciNumbers(100)
        println(numberList)
        binding.rcvFibonaci.layoutManager=LinearLayoutManager(this)
        binding.rcvFibonaci.adapter= Numbers_list(numberList)

    }

    fun displayFabonacciNumbers(numbers:Int): List<Int> {
        var list= ArrayList<Int>()
        var lower_limit =1
        var first_num = 0
        var second_num = 1
        while (lower_limit<=numbers){
            print(first_num)
            val sum = first_num + second_num
            first_num = second_num
            second_num = sum
            lower_limit ++
            list+=sum
        }
        return  list
    }
}
