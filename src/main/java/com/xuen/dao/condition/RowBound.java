package com.xuen.dao.condition;

/**
 * @author yong.chen
 * @since 2016-11-14 9:43 PM
 */
public class RowBound {

    public final static int NO_ROW_OFFSET = 0;
    public final static int NO_ROW_LIMIT = 1000;
    public final static RowBound DEFAULT = new RowBound();

    private int offset;
    private int limit;

    public RowBound() {
        this.offset = NO_ROW_OFFSET;
        this.limit = NO_ROW_LIMIT;
    }

    public RowBound(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return " limit " + limit + " offset " + offset;
    }
}
