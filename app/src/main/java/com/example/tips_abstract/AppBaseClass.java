package com.example.tips_abstract;

public class AppBaseClass extends BaseClass {

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    protected String version() {
        return "1.0";
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    protected String author() {
        return "FugaFuga";
    }

}
