package com.kasuo.trademark.dao.crawler;

import com.kasuo.trademark.domain.Trademark;
import org.springframework.stereotype.Repository;

/**
 * @author douzhitong
 * @date 2019/4/5
 */
@Repository
public interface TrademarkDao {

    void save(Trademark trademark);
}
