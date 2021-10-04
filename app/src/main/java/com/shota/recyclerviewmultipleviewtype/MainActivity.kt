package com.shota.recyclerviewmultipleviewtype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.LinearLayoutManager
import shota.recyclerviewmultipleviewtype.R


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timelineRecyclerViewAdapter = TimelineRecyclerViewAdapter(getPostDataList())
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = timelineRecyclerViewAdapter
    }

    private fun getPostDataList() : List<PostData> {

        val postList = mutableListOf<PostData>()

        for (i in 1..5) {
            val postData1 = PostData(userName = "შოთა იასაშვილი", timeStamp = "10:23 PM, 5 oct 2021", userProfilePhotoUrl = "https://i.imgur.com/L3J7Oge.jpg", postDescription = ". ერთხელ ბოშა მოვიდა და მითხრა რომ ჩემს ხელზე იმკითხავებდა. მე უარი ვუთხარი, კონფიდენციალური ინფორმაციაათქო", postImageUrl = "https://gdb.rferl.org/5BBF428D-AEB3-4BFE-8C76-BDD22C63C21A_w1597_n_r1_st.jpg")
            val postData2 = PostData(userName = "ნელსონა", timeStamp = "9:52 AM, 4 oct 2021", userProfilePhotoUrl = "https://i.imgur.com/zmJP4JM.png", postDescription = "\t\n" +
                    "ყოველთვის შეუძლებლად მიგაჩნია, სანამ გააკეთებ. -[ნელსონ მანდელა", postImageUrl = "")
            val postData3 = PostData(userName = "ვაჟა-ფშაველა", timeStamp = "1:49 PM, 9 Sep 2019", userProfilePhotoUrl = "https://i.imgur.com/KvKTla7.png", postDescription = " \n" +
                    "აზრი სწორი და შრომა მედგარი, ბედნიერების მოსაპოვებლად ერთი სახსარი მხოლოდ ეგ არი.\n" + "\n", postImageUrl = "https://i.imgur.com/L0X8CWb.jpg")

            postList.add(postData1)
            postList.add(postData2)
            postList.add(postData3)
        }

        return postList
    }
}
