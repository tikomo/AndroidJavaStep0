package com.example.tips_class;

import android.util.Log;

/**
 *
 */
public class BaseClass {

    /**
     * デバッグログ用のTAG
     */
    final String TAG_NAME = "MY_TAG";

    /**
     * クラス名
     */
    private final String CLASS_NAME = "SampleClass";

    /**
     * メッセージ
     */
    public void message() {

        final String METHOD_NAME = "message";

        Log.d(TAG_NAME,String.format("CLASS:%s, METHOD:%s",CLASS_NAME, METHOD_NAME));
    }
}
