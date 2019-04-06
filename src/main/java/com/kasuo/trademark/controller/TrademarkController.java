package com.kasuo.trademark.controller;

import com.kasuo.trademark.domain.Trademark;
import com.kasuo.trademark.service.TrademarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author douzhitong
 * @date 2019/4/6
 */
@RestController
@RequestMapping(value = "/v1/trademark")
public class TrademarkController {

    @Autowired
    private TrademarkService trademarkService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public List<Trademark> getList(@RequestParam String date, @RequestParam Integer num) {
        return trademarkService.findByDate(date, num);
    }

    @RequestMapping(value = "/getNextDate", method = RequestMethod.GET)
    public String getNextDate(@RequestParam String date) {
        return trademarkService.findNextDate(date);
    }
}
