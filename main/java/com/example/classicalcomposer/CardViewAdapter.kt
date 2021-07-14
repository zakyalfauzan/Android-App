package com.example.classicalcomposer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdapter(private val listComposer: ArrayList<Composer>): RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {

    private lateinit var mListener: onItemClickListener

    interface onItemClickListener{
        abstract fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cardview_composer, viewGroup, false)
        return CardViewViewHolder(view,mListener)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val composer = listComposer[position]

        Glide.with(holder.itemView.context)
            .load(composer.photo)
            .apply(RequestOptions().override(50, 220))
            .into(holder.imgPhoto)

        holder.tvName.text = composer.name
        holder.tvYear.text = composer.year
        holder.tvSonata.text = composer.sonata
        holder.tvDetail.text = composer.detail
    }

    override fun getItemCount(): Int {
        return listComposer.size
    }

    inner class CardViewViewHolder(itemView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_composer_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_composer_name)
        var tvYear: TextView = itemView.findViewById(R.id.tv_composer_year)
        var tvSonata: TextView = itemView.findViewById(R.id.tv_composer_sonata)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_composer_detail)
        var cvComposer: CardView = itemView.findViewById(R.id.cv_composer)

        init {
            itemView.setOnClickListener{
                listener.onItemClick(adapterPosition)
            }
        }
    }
}

