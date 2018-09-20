package com.katou.megumi.controller;

import com.katou.megumi.service.BilibiliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author liang
 * @version 1.0
 * @email akiyama.wiy@gmail.com
 * @create 2018/9/18
 */
@Controller
@RequestMapping("/megumi")
public class BilibiliController {

    @Autowired
    private BilibiliService bilibiliService;

    @ResponseBody
    @RequestMapping("/getBilibiliRankingData")
    public List<Map<String, String>> getBilibiliRankData(HttpServletRequest request, HttpServletResponse response){

        String type = request.getParameter("type");
        String dayType = request.getParameter("dayType");

        return bilibiliService.getBilibiliRankData(type, dayType);
    }
}
