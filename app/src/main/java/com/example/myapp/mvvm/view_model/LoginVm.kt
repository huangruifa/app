package com.example.myapp.mvvm.view_model

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapp.mvvm.data.LoginBean
import com.example.myapp.mvvm.model.LoginModel
/*
* LoginViewModel
*
*   管理登录的数据以及处理登录相关逻辑
* */
class LoginVm: ViewModel() {

    private var loginModel = LoginModel()

    /*LiveData，使该数据可以被感知*/
    var loginBean = MutableLiveData<LoginBean>()
    var account: String ?= ""
    var pwd: String ?= ""

    fun doLogin() {
        if (account.isNullOrBlank() or pwd.isNullOrBlank()){
                    loginBean.value =loginModel.loginFail()
        }
        else{
            Handler().postDelayed(object : Runnable {
                override fun run() {
                    /*通知Activity刷新数据*/
                    loginBean.value = loginModel.login()

                }
            }, 1000)
        }

    }

}