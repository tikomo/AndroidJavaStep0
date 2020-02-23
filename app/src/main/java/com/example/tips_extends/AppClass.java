package com.example.tips_extends;

/**
 *
 *
 *  final指定: このクラスは継承禁止
 *
 */
final public class AppClass extends AppBaseClass {

    /**
     * コンストラクタ
     */
    public AppClass() {

        super();
    }

    /**
     * コンストラクタ
     *
     * @param version バージョン番号
     * @param author 作成者
     */
    public AppClass(String version, String author) {

        super(version,author);

    }

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
