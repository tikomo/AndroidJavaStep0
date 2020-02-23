package com.example.tips_exception;

import android.util.Log;

/**
 *
 *
 */
public class ExceptionTest {

    /**
     * デバッグログ用のTAG
     */
    private final String TAG_NAME = "MY_TAG";

    /**
     * クラス名
     */
    private final String CLASS_NAME = "ExceptionTest";

    /**
     * 0除算例外を発生させる
     */
    public void exceptionTest1() {

        final String METHOD_NAME = "exceptionTest1";

        try {

            int val1 = 100 / 0;

        } catch(Exception e) {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));

        } finally {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));

        }

    }

    /**
     * 0除算例外を自身で発生させる
     */
    public void exceptionTest2() {

        final String METHOD_NAME = "exceptionTest2";

        try {

            throw new ArithmeticException("0で割ったときの例外を発生させる");

        } catch(Exception e) {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));

        }finally {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));

        }

    }

    /**
     * 0除算例外を自身で発生させる
     *
     * しかし、このメソッドではArithmeticException例外を処理しません
     * 呼び出し元で例外を処理してください
     */
    public void exceptionTest3() throws ArithmeticException {

        @SuppressWarnings("unused")
        final String METHOD_NAME = "exceptionTest2";

        @SuppressWarnings("unused")
        int val1 = 100 / 0;

    }

    /**
     * 0除算例外を自身で発生させる
     */
    public void exceptionTest4() {

        final String METHOD_NAME = "exceptionTest2";

        try {

            throw new Exception("例外を発生させる");

        } catch(Exception e) {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, e.getMessage()));

        }finally {

            Log.d(TAG_NAME, String.format("CLASS NAME = %s MEG:%s", CLASS_NAME, "finally"));

        }

    }

}
