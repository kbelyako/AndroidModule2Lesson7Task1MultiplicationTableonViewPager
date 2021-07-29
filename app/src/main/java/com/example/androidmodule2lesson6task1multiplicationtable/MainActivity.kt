package com.example.androidmodule2lesson6task1multiplicationtable
/*
ДЗ. Задание 1. Легкое
Переделать таблицу умножения из прошлого урока на ViewPager, чтобы можно было
слайдить вправо, влево и открывались разные таблицы умножения.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTPages= arrayListOf<MTablePage>()
    //    for (i in 0..mTPages.size-1){
    //       Log.d("mylog","title="+mTPages[i].title+'\n'+"Table="+'\n'+mTPages[i].table)
    //    }

         for (i in 1..10){
            mTPages.add(MTablePage(i))
         }

        //vpViewPager.adapter=MTtableAdapter(mTPages,supportFragmentManager)

        vpViewPager.adapter=MTablePagesAdapter(mTPages,supportFragmentManager)

    }


}