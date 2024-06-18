package com.akirachix.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
    class  Fibonacci(var numbers:List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
            val numberView = LayoutInflater.from(parent.context)
                .inflate(R.layout.name_list_xml,parent,false)
            return NumbersViewHolder(numberView)
        }

        override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
            holder.tvResult.text = numbers[position].toString()

        }

        override fun getItemCount(): Int {
            return numbers.size
        }

    }

    class NumbersViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
        val tvResult = numberView.findViewById<TextView>(R.id.tvResult)
    }