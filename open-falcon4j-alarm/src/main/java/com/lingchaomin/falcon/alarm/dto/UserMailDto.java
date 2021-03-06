package com.lingchaomin.falcon.alarm.dto;


import com.lingchaomin.falcon.common.redis.annotation.List;
import com.lingchaomin.falcon.common.redis.annotation.ListColumn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author minlingchao
 * @version 1.0
 * @date 2017/4/11 上午10:52
 * @description 邮件内容
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@List(key = "user:mail")
public class UserMailDto {

    /*
    优先级
     */
    @ListColumn
    private Integer priority;

    /**
     * 指标
     */
    @ListColumn
    private String metric;

    @ListColumn
    private String subject;

    /**
     * 短信内容
     */
    @ListColumn
    private String content;

    /**
     * 手机号
     */
    @ListColumn
    private String email;

    /**
     * 状态
     */
    @ListColumn
    private String status;

}
