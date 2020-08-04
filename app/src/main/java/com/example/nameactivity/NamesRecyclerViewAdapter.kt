package com.example.nameactivity
import android.support.v7.widget.RecyclerView
import android.view.*
import android.widget.Adapter
import kotlinx.android.synthetic.main.activity_main.view.*
import org.w3c.dom.NameList


class NamesRecyclerViewAdapter (val namesList: List<String>) :
        RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_name_item, parent, false)
            return NamesViewHolder(itemView)
        }
        override fun getItemCount(): Int {
            return namesList.size
        }
        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
            holder.rowView.tvName.text = namesList[position]
        }
        class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
    }