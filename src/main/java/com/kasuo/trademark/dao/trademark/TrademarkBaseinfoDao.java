package com.kasuo.trademark.dao.trademark;

import com.kasuo.trademark.domain.TrademarkBaseinfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author douzhitong
 * @date 2019/1/7
 */
@Repository
public interface TrademarkBaseinfoDao {

    /**
     * 根据日期查询商标基本信息
     *
     * @param date   日期
     * @param offset 偏移量
     * @param limit  每页数量
     * @return 商标基本信息
     */
    List<TrademarkBaseinfo> findPageByDate(@Param("date") String date, @Param("offset") int offset, @Param("limit") int limit);

    /**
     * 更新is_use状态
     *
     * @param ids ids
     */
    void updateUseStatus(@Param("ids") List<Integer> ids);

    /**
     * 查询下一天
     * @param date 日期
     * @return 下一天
     */
    TrademarkBaseinfo findNextDate(@Param("date") String date);
}
