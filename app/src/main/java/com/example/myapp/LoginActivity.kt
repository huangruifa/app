package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.myapp.mvvm.data.LoginBean
import com.example.myapp.mvvm.view_model.LoginVm
import kotlinx.android.synthetic.main.login.*
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

//    lateinit 延迟加载
//    lateinit 只能修饰, 非kotlin基本类型
    private lateinit var vm: LoginVm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.login)

        vm = ViewModelProviders.of(this).get(LoginVm::class.java)

        btn_login.setOnClickListener {
            vm.account = et_account.text.toString().trim()
            vm.pwd = et_pwd.text.toString().trim()
            vm.doLogin()
        }
//        observer:检测变化
        vm.loginBean.observe(this, object : Observer<LoginBean> {
            override fun onChanged(t: LoginBean) {
                /*数据发生变化*/
                Toast.makeText(this@LoginActivity, t.message, Toast.LENGTH_LONG).show()
                /*页面跳转*/
                if(t.message == "登录成功"){
                    startActivity<HomeActivity>()
                }
            }
        })
    }
}