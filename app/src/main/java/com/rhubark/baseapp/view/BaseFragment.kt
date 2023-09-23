package com.rhubark.baseapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.rhubark.baseapp.viewmodel.BaseViewModel


class BaseFragment : Fragment() {

    private lateinit var fragmentActivity: FragmentActivity
    private lateinit var viewModel: BaseViewModel

    fun setupBaseFragment(viewModel: BaseViewModel, fragmentActivity: FragmentActivity) {
        this.viewModel = viewModel
        this.fragmentActivity = fragmentActivity

       // initObservers()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}