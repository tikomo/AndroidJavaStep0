package com.example.tips_extends;

/**
 * base class
 *
 *
 */
public class BaseClass {

    /**
     * コピーライト
     *
     * final指定、コピーライトは書き換え不可とする
     */
    public final String COPYLIGHT = "Copyright (c) xxxxxxxx Inc All rights reserved.";

    /**
     * バージョン番号
     */
    private String version = "1.0";

    /**
     * 作成者
     */
    private String author = "HogeHoge";


    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    protected String getVersion() {
        return this.version;
    }

    /**
     * バージョン番号
     *
     * @param str バージョン番号
     */
    protected void setVersion(String str) {
        this.version = str;
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    protected String getAuthor() {
        return this.author;
    }

    /**
     * 作成者
     *
     * @param str 作成者
     */
    protected void setAuthor(String str) {
        this.author = str;
    }

}
