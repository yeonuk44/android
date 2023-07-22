// 무조건 포함되는 package 파일. 계층 구조를 나타냅니다.
package com.example.helloworld


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.ui.theme.HelloWorldTheme

// MainActivity는 ComponentActivity 클래스를 상속받고 있다.
class MainActivity : ComponentActivity() { // MainActivity -> ComponentActivity -> Activity
    // MainActivity의 생명주기가 실행되는 가장 첫 번째 콜백함수이다.
    override fun onCreate(savedInstanceState: Bundle?) {
        /**
         * Info
         * onCreate() 함수에는 savedInstanceState라는 매개변수가 존재한다.
         * 이는 특정한 상황에서 Activity가 종료될 때 Bundle에 값을 저장하기 위함이다.
         * 특정한 상황의 예: 화면 방향 변경, 메모리 부족으로 인한 앱 종료 등
         * Bundle 타입은 여러 데이터 타입의 박스 같은 느낌이라고 생각하면 된다. 여러 데이터가 들어오면 맵핑을 한다.
         * 별 다른 세팅을 해주지 않으면 savedInstanceState의 값이 Null로 리턴된다.
         */
        super.onCreate(savedInstanceState)

        setContent {
            HelloWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("yeonuk")
                    setContentView(R.layout.activity_yeonuk)


                }
            }
        }

        settingButton()
    }

    fun settingButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }
}

