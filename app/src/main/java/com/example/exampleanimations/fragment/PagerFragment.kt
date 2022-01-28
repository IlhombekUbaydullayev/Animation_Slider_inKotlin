package com.example.exampleanimations.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.exampleanimations.R
import com.example.exampleanimations.model.PagerInfo

class PagerFragment : Fragment() {

    private val KEY: String = "the_key"

    fun newInstance(pagerInfo: PagerInfo): PagerFragment {
        val fragment = PagerFragment()

        val bundle = Bundle()
        bundle.putSerializable(KEY, pagerInfo)

        fragment.arguments = bundle
        return fragment
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_view, container, false)
        initViews(view)
        return view
    }


    private fun initViews(view: View) {
        val title = view.findViewById<TextView>(R.id.tv_title_page)
        val info = view.findViewById<TextView>(R.id.tv_info_page)

        val pagerInfo: PagerInfo = arguments?.getSerializable(KEY) as PagerInfo
        title.setText(pagerInfo.title)
        info.setText(pagerInfo.info)
    }

}