package accubits.com.dynamic_feature_two

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_dynamic_two.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_two)



        val modelList = ArrayList<Model>()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val  adapter = ModelAdapter()
        recyclerView.adapter = adapter
        adapter.addAll(modelList)


        sendBtn.setOnClickListener {
            var model = Model(editTxt.text.toString(),true)
            adapter.add(model)
            model = Model("Hello Amal",false)
            adapter.add(model)

            recyclerView.smoothScrollToPosition(adapter.getSize()-1)
        }

    }
}
