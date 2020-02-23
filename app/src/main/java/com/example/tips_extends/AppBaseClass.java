package com.example.tips_extends;

/**
 * Application Base class
 *
 * 
 */
public class AppBaseClass extends BaseClass {

    /**
     * コンストラクタ
     *
     * @param version バージョン番号
     * @param author 作成者
     */
    protected AppBaseClass() {
        this.setVersion("1.0");
        this.setAuthor("dummy");
    }

    /**
     * コンストラクタ
     *
     * @param version バージョン番号
     * @param author 作成者
     */
    protected AppBaseClass(String version, String author) {
        this.setVersion(version);
        this.setAuthor(author);
    }

    /**
     * バージョン番号
     *
     * @return バージョン番号
     */
    protected String version() {
        return this.getVersion();
    }

    /**
     * 作成者
     *
     * @return 作成者
     */
    protected String author() {
        return this.getAuthor();
    }

}
