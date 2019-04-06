package com.kasuo.trademark.service;

import com.kasuo.trademark.domain.Trademark;
import com.kasuo.trademark.domain.TrademarkBaseinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author douzhitong
 * @date 2019/3/24
 */
public interface TrademarkService {

    /**
     * 根据日期查询商标信息
     *
     * @param date 日期
     * @param num  数量
     * @return 商标信息
     */
    List<Trademark> findByDate(String date, int num);

    /**
     * 查询下一天
     * @param date 日期
     * @return 下一天
     */
    String findNextDate(@Param("date") String date);
}
