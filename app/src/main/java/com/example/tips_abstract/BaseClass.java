package com.example.tips_abstract;

/**
 * base class
 *
 *
 */
abstract class BaseClass {

    /**
     * コピーライト
     *
     * final指定、コピーライトは書き換え不可とする
     */
    public final String COPYLIGHT = "Copyright (c) xxxxxxxx Inc All rights reserved.";

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    abstract String version();

    /**
     * 作成者
     *
     * @return 作成者
     */
    abstract String author();

}
