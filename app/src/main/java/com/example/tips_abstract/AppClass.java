package com.example.tips_abstract;

/**
 *
 *
 *  final指定: このクラスは継承禁止
 *
 */
final public class AppClass extends AppBaseClass {

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    public String version() {
        return super.version();
    }

    /**
     * 作成者
     *
     * @return
     */
    public String author() {
        return super.author();
    }

}
