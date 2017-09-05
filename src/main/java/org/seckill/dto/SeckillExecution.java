package org.seckill.dto;

import org.seckill.entity.SuccessKilled;

/*
 *封装秒杀执行后的结果
 */
public class SeckillExecution {

    private long seckilled;

    private int state;

    private String stateInfo;

    private SuccessKilled successKilled;

    public long getSeckilled() {
        return seckilled;
    }

    public void setSeckilled(long seckilled) {
        this.seckilled = seckilled;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckilled, int state, String stateInfo, SuccessKilled successKilled) {
        this.seckilled = seckilled;
        this.state = state;
        this.stateInfo = stateInfo;
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckilled, int state, String stateInfo) {
        this.seckilled = seckilled;
        this.state = state;
        this.stateInfo = stateInfo;
    }
}
