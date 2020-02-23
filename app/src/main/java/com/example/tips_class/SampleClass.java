package com.example.tips_class;

/**
 * クラスの構成サンプル
 *
 *
 */
public class SampleClass {

    /**
     * バージョン番号
     */
    private static final String VERSION = "1.0";

    /**
     * 作成者
     */
    private static final String AUTHOR = "HogeHoge";


    // クラス変数
    int aaa;
    int bbb;

    /**
     * コンストラクタ
     */
    public SampleClass() {

        aaa = 100;
        bbb = 200;
        this.aaa = 300;
        this.bbb = 400;

    }

    /**
     * コンストラクタ
     *
     * @param a 引数の説明を記載
     * @param b 引数の説明を記載
     */
    public SampleClass(int a, int b) {

        aaa = a;
        bbb = b;
        this.aaa = a;
        this.bbb = b;

    }

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    static public String version() {

        return VERSION;
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    static public String author() {

        return AUTHOR;
    }

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    public String version_instance() {

        return this.VERSION;
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    public String author_instance() {

        return this.AUTHOR;
    }
}
