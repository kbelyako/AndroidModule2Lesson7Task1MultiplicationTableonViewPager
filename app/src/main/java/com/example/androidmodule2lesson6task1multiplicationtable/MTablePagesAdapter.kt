package com.example.androidmodule2lesson6task1multiplicationtable

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
class MTablePagesAdapter (val mTPages:ArrayList<MTablePage>,val fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return mTPages.size
    }

    override fun getItem(position: Int): Fragment {
       // Log.d("mylog","Get method"+" for position="+position+" title="+mTPages[position].title+'\n'+"Table="+'\n'+mTPages[position].table)
        return PageFragment.newInstance(mTPages[position].title,mTPages[position].table)
    }

}




