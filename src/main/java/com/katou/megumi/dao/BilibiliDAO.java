package com.katou.megumi.dao;

import com.katou.megumi.entiy.BilibiliRankData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liang
 * @version 1.0
 * @email akiyama.wiy@gmail.com
 * @create 2018/9/18
 */
public interface BilibiliDAO {

    public List<BilibiliRankData> getBilibiliRankData(@Param("type") String type,
                                                      @Param("dayType") String dayType);
}
