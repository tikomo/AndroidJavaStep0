package com.example.tips;

import android.util.Log;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;


/**
 * サンプルクラス
 *
 *
 */
public class TipsClass {

    /**
     * デバッグログ用のTAG
     */
    private final String TAG_NAME = "MY_TAG";

    /**
     * クラス名
     */
    private final String CLASS_NAME = "SampleClass";

    /**
     * バージョン番号
     */
    private final String VERSION = "1.0";

    /**
     * 作成者
     */
    private final String AUTHOR = "HogeHoge";

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    public String version() {

        Log.d(CLASS_NAME,VERSION);

        return VERSION;
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    public String author() {

        Log.d(CLASS_NAME,AUTHOR);

        return AUTHOR;
    }

    /**
     * 動作確認
     */
    public void test() {

        Log.d(TAG_NAME, String.format("CLASS NAME = %s ----- START ----", CLASS_NAME));

        Log.d(TAG_NAME, "call debugLog");
        debugLog();

        Log.d(TAG_NAME, "call sampleString");
        sampleString();

        Log.d(TAG_NAME, "call sampleStringBuilder");
        sampleStringBuilder();

        Log.d(TAG_NAME, "call convert_num2string");
        convert_num2string();

        Log.d(TAG_NAME, "call convert_string2num");
        convert_string2num();

        Log.d(TAG_NAME, "call fnRandom");
        fnRandom();

        Log.d(TAG_NAME, "call fnIf");
        fnIf();

        Log.d(TAG_NAME, "call fnWhile");
        fnWhile();

        Log.d(TAG_NAME, "call fnSwitch");
        fnSwitch();

        Log.d(TAG_NAME, "call fnFor");
        fnFor();

        Log.d(TAG_NAME, "call fnArray");
        fnArray();

        Log.d(TAG_NAME, "call fnArrayList");
        fnArrayList();

        Log.d(TAG_NAME, "call arrayParam");
        arrayParam(new int[] {1,2,3,4,5});

        Log.d(TAG_NAME, "call arrayParam2");
        int[] arr1 = new int[] {6,7,8,9,10};
        int[] arr2 = arrayParam2(arr1);

        for (int idx = 0; idx < arr2.length; idx++) {
            Log.d(TAG_NAME, String.format("arr2[%d] = %d", idx, arr2[idx]));
        }




        Log.d(TAG_NAME, String.format("CLASS NAME = %s ----- END ----", CLASS_NAME));
    }

    /**
     * デバッグログの書き方
     *
     * String.format()
     */
    private void debugLog() {

        final String METHOD_NAME = "debugLog";

        Log.d(TAG_NAME, String.format("CLASS NAME = %s ----- START ----", METHOD_NAME));

        Log.i(TAG_NAME, "Hello World");
        Log.d(TAG_NAME, "Hello World");

        Log.d(TAG_NAME, String.format("CLASS NAME = %s ----- END ----", METHOD_NAME));

    }

    /**
     * 文字列連結　String
     */
    private void sampleString() {

        String str1 = "Hello";
        String str2 = str1 + " ";
        String str3 = str2 + "World";

        Log.d(TAG_NAME, str3);

    }

    /**
     * 文字列連結　StringBuilder
     */
    private void sampleStringBuilder() {

        StringBuilder strb1 = new StringBuilder();
        strb1.append("Hello");
        strb1.append(" ");
        strb1.append("World");

        Log.d(TAG_NAME, strb1.toString());
    }

    /**
     * 数値から文字列への変換
     */
    private void convert_num2string() {

        int val1 = 1;
        double val2 = 1.0;
        double val3 = 10 / val1;
        double val4 = 10 / val2;

        Log.d(TAG_NAME, String.valueOf(val1));  // 1
        Log.d(TAG_NAME, String.valueOf(val2));  // 1.0
        Log.d(TAG_NAME, String.valueOf(val3));  // 10.0
        Log.d(TAG_NAME, String.valueOf(val4));  // 10.0


        Log.d(TAG_NAME, Integer.toString(val1));  // 1
        Log.d(TAG_NAME, Double.toString(val2));  // 1.0
        Log.d(TAG_NAME, Double.toString(val3));  // 10.0
        Log.d(TAG_NAME, Double.toString(val4));  // 10.0

    }

    /**
     * 文字列から数値への変換
     */
    private void convert_string2num() {

        String str1 = "1";
        String str2 = "1.0";
        String str3 = "0.1";
        String str4 = "0.000001";

        int val1 = Integer.parseInt(str1);
        double val2 = Double.parseDouble(str2);
        double val3 = Double.parseDouble(str3);
        double val4 = Double.parseDouble(str4);

        Log.d(TAG_NAME, Integer.toString(val1));  // 1
        Log.d(TAG_NAME, Double.toString(val2));  // 1.0
        Log.d(TAG_NAME, Double.toString(val3));  // 0.1
        Log.d(TAG_NAME, Double.toString(val4));  // 1.0E-6

        BigDecimal bd1 = new BigDecimal(str4);   // import java.math.BigDecimal;
        Log.d(TAG_NAME, bd1.toString());        // 0.000001

        double val5 = 1.5 / 2;
        Log.d(TAG_NAME, Double.toString(val5));

        double val6 = 1.5 / 2.0;
        Log.d(TAG_NAME, Double.toString(val6));

    }

    /**
     * 乱数、MAX
     */
    private void fnRandom() {

        // 乱数
        for (int i = 0; i < 10; i++) {
            int val1 = new Random().nextInt(10); // 0 ... 9までの値を返す
            Log.d(TAG_NAME, Integer.toString(val1));
        }

        // MAX
        int val1 = 2;
        int val2 = 5;
        int val3 = Math.max(val1, val2);
        Log.d(TAG_NAME, String.format("MAX = %d", val3));

        int val4 = Math.min(val1, val2);
        Log.d(TAG_NAME, String.format("MIN = %d", val4));


    }

    /**
     * IF
     *
     * 文字列比較
     */
    private void fnIf() {

        boolean b1 = true;

        if (true == b1) {
            Log.d(TAG_NAME, "TRUE");
        } else {
            Log.d(TAG_NAME, "FALSE");
        }

        if (false == b1) {
            Log.d(TAG_NAME, "FALSE");
        } else {
            Log.d(TAG_NAME, "TRUE");
        }

        b1 = false;

        // こっちの書き方のが推奨っぽい
        if (b1) {
            Log.d(TAG_NAME, "TRUE");
        } else {
            Log.d(TAG_NAME, "FALSE");
        }

        // こっちの書き方のが推奨っぽい
        if (!b1) {
            Log.d(TAG_NAME, "FALSE");
        } else {
            Log.d(TAG_NAME, "TRUE");
        }

        String str = "Hello";
        if(str.equals("Hello")) {
            Log.d(TAG_NAME, "str は Hello");
        } else {
            Log.d(TAG_NAME, "str は Hello 以外");
        }

    }

    /**
     * While
     */
    private void fnWhile() {

        boolean b1 = true;
        int cnt = 0;

        while (b1) {

            if (cnt < 5) {
                Log.d(TAG_NAME, String.format("cnt = %d", cnt));
            } else {
                b1 = false;
            }

            cnt++;
        }
    }

    /**
     * Switch
     */
    private void fnSwitch() {

        int val1 = 10;

        switch(val1) {
            case 1:
                Log.d(TAG_NAME, String.format("case1) val1 = %d", val1));
                break;
            case 2:
                Log.d(TAG_NAME, String.format("case2) val1 = %d", val1));
                break;
            case 3:
                Log.d(TAG_NAME, String.format("case3) val1 = %d", val1));
                break;
            case 4:
            case 5:
            case 6:
                Log.d(TAG_NAME, String.format("case4,5,6) val1 = %d", val1));
                break;
            case 10:
                Log.d(TAG_NAME, String.format("case10) val1 = %d", val1));
                break;
            default:
                Log.d(TAG_NAME, String.format("case default) val1 = %d", val1));
                break;
        }
    }

    /**
     * For
     */
    private void fnFor() {

        // 乱数
        for (int idx = 0; idx < 10; idx++) {
            Log.d(TAG_NAME, String.format("idx = %d", idx));
        }

    }

    /**
     * 配列
     */
    private void fnArray() {

        int[] arr1 = new int[10];

        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx] = idx;
        }

        for (int idx = 0; idx < arr1.length; idx++) {
            Log.d(TAG_NAME, String.format("idx[%d] = %d", idx, arr1[idx]));
        }

        int[] arr2 = new int[] {1,2,3,4,5};
        for (int idx = 0; idx < arr2.length; idx++) {
            Log.d(TAG_NAME, String.format("idx[%d] = %d", idx, arr2[idx]));
        }

        int[] arr3 = {6,7,8,9,0};
        for (int idx = 0; idx < arr3.length; idx++) {
            Log.d(TAG_NAME, String.format("idx[%d] = %d", idx, arr3[idx]));
        }

        for (int n : arr3) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }

    }

    /**
     * 動的配列
     */
    private void fnArrayList() {

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);

        for (int n : arrInt) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }
    }

    /**
     * 配列を引数
     *
     * @param arr int型 配列
     */
    private void arrayParam(int[] arr) {

        for (int n : arr) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }
    }

    /**
     * 配列を引数
     *
     * @param arr int型 配列
     * @return int型 配列
     */
    private int[] arrayParam2(int[] arr) {

        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = idx + 100;
            Log.d(TAG_NAME, String.format("arr[%d] = %d", idx, arr[idx]));
        }

        return arr;
    }
}
