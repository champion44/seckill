package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

    /**
     *  @Author champion
     *  @Date 2017/9/5 11:30
     *  @Param
     *  @Return
     *  如果影响行数>1 表示更新记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
