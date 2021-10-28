package com.example.uikotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      확인버튼이 눌리면? 이벤트를 달아주자.

        okBtn.setOnClickListener {
//            입력된 내용? : contentEdt 의 text 의 값 조회(get) 변수에 저장 해두자.

            val inputContent = contentEdt.text.toString()

//            저장해둔 입력값을 => 텍스트뷰의 내용으로 반영(set).

            resultTxt.text = inputContent

        }
    }
}