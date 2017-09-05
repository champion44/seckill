package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/*
 *使用者角度设计接口
 * 方法定义粒度，1执行秒杀不应该减少库存 2参数越简单越好不应该是map 3return类型友好
 *抛出异常其实比return更好 有个异常包将异常定义完整
 */
public interface SeckillService {

    List<Seckill> getSeckillList();

    Seckill getById(long seckillId);
    /*
     *秒杀开启时输出秒杀接口地址
     *否则输出系统时间和秒杀时间
     */
    Exposer exportSeckillUrl (long seckillId);

    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException,SeckillCloseException,RepeatKillException;
}
