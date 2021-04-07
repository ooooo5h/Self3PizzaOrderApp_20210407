package com.neppplus.self3pizzaorderapp_20210407.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.neppplus.self3pizzaorderapp_20210407.R
import com.neppplus.self3pizzaorderapp_20210407.adapters.StoreListAdapter
import com.neppplus.self3pizzaorderapp_20210407.datas.Store
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment : Fragment() {

//    틀렸지
//    lateinit var mStoreList : ArrayList<Store>

    val mStoreList = ArrayList<Store>()

    lateinit var mStoreListAdapter : StoreListAdapter

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

        mStoreListAdapter = StoreListAdapter(activity!!, R.layout.store_list_item, mStoreList)
//        한 줄 더있는거 같은데
//        mainViewPager.adapter = mStoreListAdapter
//        또 틀렸지. 뷰페이저의 어댑터는 이미 연결해줬잖아
//        이제는 리스트뷰의 어댑터를 만들어주는 상황이니까
        storeListView.adapter = mStoreListAdapter


    }
}