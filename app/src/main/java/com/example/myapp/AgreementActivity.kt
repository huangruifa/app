package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AgreementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.agreement)
        val text_view: TextView = findViewById(R.id.text_view2)
        val string ="欢迎您申请使用广州xxx网络科技（下列简称为“xxx”）提供的服务。请您（下列简称为“用户”）仔细阅读以下全部内容。如用户不同意本服务条款任意内容，请勿注册或使用xxx服务。本《协议》描述xxx公司与用户之间关于“xxx”服务相关方面的权利义务。如用户在注册流程点击“注册”，即表示用户与xxx公司已达成协议，自愿接受本服务条款的所有内容（注：xxx所有终端均适用）。此后，用户不得以未阅读本服务条款内容作任何形式的抗辩。\n" +
                "\n" +
                "“用户”是指注册、登录、使用、浏览xxxAPP的个人或组织。本《协议》可由xxx公司随时更新，更新后的协议条款一旦公布即代替原来的协议条款，恕不再另行通知，用户可在xxxAPP上查阅最新版协议条款。在xxx公司修改协议条款后，如果用户不接受修改后的条款，请立即停止使用xxx公司提供的服务，用户继续使用xxx公司提供的服务将被视为已接受了修改后的协议。\n" +
                "\n" +
                "一、服务保护条款\n" +
                "1.考虑到xxx公司产品服务的重要性，用户同意:\n" +
                " (1)提供及时、详尽及准确的个人资料。\n" +
                " (2)不断更新注册资料，符合及时、详尽准确的要求。所有原始键入的资料将引用为注册资料。\n" +
                "\n" +
                "\n" +
                "\n"
        text_view.setText(string)
    }
}