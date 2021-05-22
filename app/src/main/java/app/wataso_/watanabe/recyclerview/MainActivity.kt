package app.wataso_.watanabe.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseData: List<CourseData> = listOf(
        CourseData(R.drawable.android, "Androidアプリプログラミングコース","いろんなアプリを作って、プログラミングを楽しもう！"),
        CourseData(R.drawable.animation,"アニメーションコース","頭の中で描いたストーリをアニメにしてみよう！"),
        CourseData(R.drawable.camera,"カメラ&フォトグラフコース","みんなに一目置かれる写真作品を作れるようになろう！")
    )




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(courseData)
    }
}