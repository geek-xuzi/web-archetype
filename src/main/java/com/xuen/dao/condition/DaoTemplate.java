package com.xuen.dao.condition;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author zheng.xu
 * @since 2017-06-29
 */
public interface DaoTemplate<T> {

    /**
     * 根据多条件查询
     *
     * @param condition
     * @return
     */
    List<T> query(Condition condition);

    /**
     * 根据对象主键删除对应的对象
     *
     * @param primaryKey 对象的
     */
    int delete(Condition primaryKey);

    /**
     * 保存对象到数据库表中
     *
     * @param t 要保存的对象
     */
    int insertOrUpdate(T t);

    /**
     * 对象修改
     *
     * @param t 修改的对象
     */
    int update(@Param("obj") T t);

    /**
     * 对象修改
     *
     * @param t 修改的对象
     */
    int updateByCondition(@Param("obj") T t, @Param("condition") Condition condition);

    /**
     * 返回count
     *
     * @param condition
     * @return
     */
    int count(Condition condition);

}
