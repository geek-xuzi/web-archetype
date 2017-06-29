package com.xuen.dao.condition;

/**
 *  where条件后面的符号
 * @author yong.chen
 * @date 2016-11-19 10:59 PM
 */
public enum Symbol {
    GREATER(" > "),
    EQUALS(" = "),
    NOT_EQUALS(" != "),
    LESS(" < "),
    GREATER_EQUALS(" >= "),
    LESS_EQUALS(" <= "),
    LIKE(" like ")
    ;

    private String tag;

    Symbol(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
