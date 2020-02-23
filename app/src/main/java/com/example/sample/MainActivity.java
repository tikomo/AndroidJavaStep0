package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.shisokuenzan.R;
import com.example.tips_class.ChildA;
import com.example.tips_class.ChildB;
import com.example.tips_exception.ExceptionTest;
import com.example.tips_extends.AppClass;
import com.example.tips.TipsClass; // 別パッケージのクラスを呼び出す為に

public class MainActivity extends AppCompatActivity {

    /**
     * デバッグログ用のTAG
     */
    private final String TAG_NAME = "MY_TAG";

    /**
     * クラス名
     */
    private final String CLASS_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // クリック時の処理
                Log.d(TAG_NAME, "BUTTON1 onClick!");

                // --------------------------------------------------
                // 基本的な文法の確認
                // --------------------------------------------------
                {
                    debugMsg("----- 基本的な文法の確認 -----");
                    TipsClass tipsClass = new TipsClass();

                    debugMsg(tipsClass.version());
                    debugMsg(tipsClass.author());
                    tipsClass.test();
                }

                // --------------------------------------------------
                // クラスの構造の確認
                // --------------------------------------------------
                {
                    debugMsg("----- クラスの構造の確認 -----");
                    AppClass appClass = new AppClass("1.0", "FugaFuga");

                    debugMsg(appClass.COPYLIGHT);
                    debugMsg(appClass.version());
                    debugMsg(appClass.author());

                    // appClass.COPYLIGHT = "Hello World"; <- finalで指定しているので書き換え不可能
                }

                // --------------------------------------------------
                // クラスの継承の確認
                // --------------------------------------------------
                {
                    com.example.tips_class.BaseClass[] arr1 = new com.example.tips_class.BaseClass[3];
                    arr1[0] = new ChildA();
                    arr1[1] = new ChildB();
                    arr1[2] = new ChildA();

                    for (com.example.tips_class.BaseClass wk1 : arr1) {
                        wk1.message();
                    }

                    for (int idx = 0; idx < arr1.length; idx++) {
                        arr1[idx].message();
                    }
                }

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // クリック時の処理
                Log.d(TAG_NAME, "BUTTON2 onClick!");

                // --------------------------------------------------
                // 例外テスト
                // --------------------------------------------------
                ExceptionTest exceptionTest = new ExceptionTest();

                Log.d(TAG_NAME, "Call exceptionTest.exceptionTest1");
                try {
                    exceptionTest.exceptionTest1();
                } catch(Exception e) {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));
                }finally {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));
                }

                Log.d(TAG_NAME, "Call exceptionTest.exceptionTest2");
                try {
                    exceptionTest.exceptionTest2();
                } catch(Exception e) {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));
                }finally {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));
                }

                Log.d(TAG_NAME, "Call exceptionTest.exceptionTest3");
                try {
                    exceptionTest.exceptionTest3();
                } catch(Exception e) {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));
                }finally {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEsG:%s", CLASS_NAME, "finally"));
                }

                Log.d(TAG_NAME, "Call exceptionTest.exceptionTest4");
                try {
                    exceptionTest.exceptionTest4();
                } catch(Exception e) {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));
                }finally {
                    Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));
                }




            }
        });
    }

    /**
     * デバッグメッセージを出力する
     *
     * @param msg メッセージ
     */
    private void debugMsg(String msg) {

        Log.d(TAG_NAME, msg);

    }
}
