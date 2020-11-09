package com.example.myapp.mvvm.model

import com.example.myapp.mvvm.data.LoginBean

/*处理登录逻辑*/
class LoginModel{
    fun login(): LoginBean {
        return LoginBean(1,"登录成功")
    }
    fun loginFail():LoginBean{
        return LoginBean(2,"登录失败")
    }
}