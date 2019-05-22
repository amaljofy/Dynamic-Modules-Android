package accubits.com.dynamic_feature_two

import accubits.com.dynamic_feature_two.constants.ViewConstants.CHAT_LEFT
import accubits.com.dynamic_feature_two.constants.ViewConstants.CHAT_RIGHT
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ModelAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val modelList = ArrayList<Model>()
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var viewHolder: RecyclerView.ViewHolder? = null
        val inflater = LayoutInflater.from(viewGroup.context)
        when (viewType) {
            CHAT_LEFT -> {
                val v1 = inflater.inflate(R.layout.chat_text_left_row, viewGroup, false)
                viewHolder = ViewHolderLeft(v1)
            }
            CHAT_RIGHT -> {
                val v2 = inflater.inflate(R.layout.chat_text_right_row, viewGroup, false)
                viewHolder = ViewHolderRight(v2)
            }
        }
        return viewHolder!!

    }

    override fun getItemCount(): Int {
        return modelList.size
    }


    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return when (modelList[position].isSend) {
            true ->  CHAT_RIGHT
            false -> CHAT_LEFT
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (modelList[position].isSend){
            true -> {
                (holder as ViewHolderRight).rightTxt.text = modelList[position].name
            }
            false -> {
                (holder as ViewHolderLeft).leftTxt.text = modelList[position].name
            }
        }
    }

    inner class ViewHolderLeft(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var leftTxt: TextView = itemView.findViewById<View>(R.id.leftTxt) as TextView
    }

    inner class ViewHolderRight(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rightTxt: TextView = itemView.findViewById<View>(R.id.rightTxt) as TextView
    }


    fun add(model: Model) {
        modelList.add(model)
        notifyItemInserted(modelList.size - 1)
    }

    fun getSize() : Int{
        return modelList.size
    }

    fun addAll(modelLst : List<Model>){
        for (result in modelLst) {
            add(result)
        }
    }


}