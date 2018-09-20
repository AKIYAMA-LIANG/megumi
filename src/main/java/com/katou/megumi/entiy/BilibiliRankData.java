package com.katou.megumi.entiy;

import lombok.Data;

import java.sql.Timestamp;

/**
 * bilibili排行榜实体类
 *
 * @author liang
 * @version 1.0
 * @email akiyama.wiy@gmail.com
 * @create 2018/9/17
 */
@Data
public class BilibiliRankData {

    private Integer id;

    private String day;

    private String type;

    private String dayType;

    private String title;

    private Integer rank;

    private Timestamp timestamp;
}
