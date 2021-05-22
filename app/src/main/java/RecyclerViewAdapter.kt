package app.wataso_.watanabe.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val context:Context) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    val items: MutableList<CourseData> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_course_data_cell,parent,false)
            //LayoutInflater.from(context).inflate(R.layout.item_cource_data_cell, parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.charaImage.setImageResource(item.CharacterImageResource)
        holder.charaNameTextView.text = item.courseName
        holder.charaDetailTextView.text = item.description
    }

    fun addAll(items:List<CourseData>){

        this.items.addAll(items)
        notifyDataSetChanged()
    }



    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val charaImage: ImageView = view.findViewById(R.id.characterImageView)
        val charaNameTextView: TextView = view.findViewById(R.id.courseNameTextView)
        val charaDetailTextView: TextView = view.findViewById(R.id.descriptionTextView)
    }







}