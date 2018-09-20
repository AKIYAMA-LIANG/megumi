package com.katou.megumi.service.impl;

import com.katou.megumi.dao.BilibiliDAO;
import com.katou.megumi.entiy.BilibiliRankData;
import com.katou.megumi.service.BilibiliService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liang
 * @version 1.0
 * @email akiyama.wiy@gmail.com
 * @create 2018/9/18
 */
@Service("bilibiliService")
public class BilibiliServiceImpl implements BilibiliService{

    @Resource
    private BilibiliDAO bilibiliDAO;

    @Override
    public List<Map<String, String>> getBilibiliRankData(String type, String dayType) {

        List<BilibiliRankData> rankData = bilibiliDAO.getBilibiliRankData(type, dayType);

        List<Map<String, String>> dataList = new ArrayList<>();

        for (BilibiliRankData data: rankData) {
            Map<String, String> map = new HashMap<>();
            map.put("title", data.getTitle());

            dataList.add(map);
        }
        return dataList;
    }
}
