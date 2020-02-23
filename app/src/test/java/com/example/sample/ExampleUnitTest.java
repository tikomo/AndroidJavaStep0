package com.example.sample;

import android.util.Log;

import com.example.tips.TipsClass;
import com.example.tips_unittest.CalcClass;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    /**
     * デバッグログ用のTAG
     */
    private final String TAG_NAME = "MY_TAG";

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_func1() {
        CalcClass calcClass = new CalcClass();
        assertEquals(4, calcClass.add(2,2));
    }

    @Test
    public void test_TipsClass() {
        // ここに作成したクラスのUnitテストを記述する
        assertEquals(4, 2 + 2);
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