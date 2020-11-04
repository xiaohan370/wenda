package com.nowcoder.async;


/**
 * @Description:
 * @Author: 小韩同学
 * @Date: 2020/11/4
 */
public enum EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3);

    private int value;
    EventType(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
