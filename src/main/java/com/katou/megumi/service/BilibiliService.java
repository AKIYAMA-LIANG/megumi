package com.katou.megumi.service;

import com.katou.megumi.entiy.BilibiliRankData;

import java.util.List;
import java.util.Map;

/**
 * @author liang
 * @version 1.0
 * @email akiyama.wiy@gmail.com
 * @create 2018/9/18
 */
public interface BilibiliService {

    public List<Map<String, String>> getBilibiliRankData(String type, String dayType);
}
