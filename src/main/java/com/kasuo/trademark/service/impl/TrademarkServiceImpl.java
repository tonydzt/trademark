package com.kasuo.trademark.service.impl;

import com.kasuo.trademark.dao.crawler.TrademarkDao;
import com.kasuo.trademark.dao.trademark.AgentDao;
import com.kasuo.trademark.dao.trademark.ApplicantDao;
import com.kasuo.trademark.dao.trademark.TrademarkBaseinfoDao;
import com.kasuo.trademark.domain.Agent;
import com.kasuo.trademark.domain.Applicant;
import com.kasuo.trademark.domain.Trademark;
import com.kasuo.trademark.domain.TrademarkBaseinfo;
import com.kasuo.trademark.service.TrademarkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author douzhitong
 * @date 2019/3/24
 */
@Service
public class TrademarkServiceImpl implements TrademarkService {

    private static final Logger logger = LoggerFactory.getLogger(TrademarkServiceImpl.class);

    @Autowired
    private TrademarkDao trademarkDao;

    @Autowired
    private TrademarkBaseinfoDao trademarkBaseinfoDao;

    @Autowired
    private ApplicantDao applicantDao;

    @Autowired
    private AgentDao agentDao;

    @Override
    public List<Trademark> findByDate(String date, int num) {

        List<Trademark> trademarkList = new ArrayList<>();
        int whileTimes = 0;
        while (CollectionUtils.isEmpty(trademarkList) && whileTimes++ < 5) {
            List<TrademarkBaseinfo> trademarkBaseinfoList = trademarkBaseinfoDao.findPageByDate(date, 0, num);

            if (CollectionUtils.isEmpty(trademarkBaseinfoList)) {
                logger.info("{} no available data!", date);
                return trademarkList;
            }

            for (TrademarkBaseinfo trademarkBaseinfo : trademarkBaseinfoList) {

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                Applicant applicant = applicantDao.find(trademarkBaseinfo.getId());
                Agent agent = agentDao.find(trademarkBaseinfo.getAgentNo());

                Trademark trademark = new Trademark();
                trademark.setRegistrationNo(trademarkBaseinfo.getId());
                trademark.setCategory(trademarkBaseinfo.getType());
                trademark.setTrademark(trademarkBaseinfo.getTrademarkName());
                trademark.setDate(sdf.format(trademarkBaseinfo.getDate()));
                trademark.setApplicant(applicant == null ? "" : applicant.getApplicantNameCn());
                trademark.setAddress(applicant == null ? "" : applicant.getAddressCn());
                trademark.setAgent(agent == null ? "" : agent.getName());

                try {
                    trademarkDao.save(trademark);

                    if (trademark.getId() != null) {
                        trademarkList.add(trademark);
                    }
                } catch (Exception e) {
                    logger.error("failed to save trademark. trademark: {}", trademark, e);
                }
            }

            //更新is_use字段
            trademarkBaseinfoDao.updateUseStatus(trademarkBaseinfoList.stream().map(TrademarkBaseinfo::getId).collect(Collectors.toList()));
        }

        return trademarkList;
    }

    @Override
    public String findNextDate(String date) {

        TrademarkBaseinfo trademarkBaseinfo = trademarkBaseinfoDao.findNextDate(date);
        if (trademarkBaseinfo == null) {
            return "";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            return sdf.format(trademarkBaseinfo.getDate());
        }
    }
}
