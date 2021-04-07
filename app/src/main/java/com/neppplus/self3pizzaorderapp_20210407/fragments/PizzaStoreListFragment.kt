package com.neppplus.self3pizzaorderapp_20210407.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.neppplus.self3pizzaorderapp_20210407.R
import com.neppplus.self3pizzaorderapp_20210407.datas.Store

class PizzaStoreListFragment : Fragment() {

    lateinit var mStoreList : ArrayList<Store>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mStoreList.add(Store("피자헛", "",""))
        mStoreList.add(Store("파파존스", "",""))
        mStoreList.add(Store("도미노피자", "",""))
        mStoreList.add(Store("미스터피자", "",""))


    }
}