package com.xuen.dao.condition;

import java.io.Serializable;

/**
 *
 * @author yong.chen
 * @date 2016-11-13 5:09 PM
 */
public class Sort implements Serializable {

    private static final long serialVersionUID = 6113764947252019255L;

    public enum Order {
        ASC, DESC
    }

    private String name;
    private Order order;

    public static Sort of(String filed, Order order) {
        return new Sort(filed, order);
    }

    public static Sort of(String filed) {
        return new Sort(filed);
    }

    public Sort(String column) {
        this(column, Order.ASC);
    }

    public Sort(String name, Order order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return name + " " + order;
    }
}
