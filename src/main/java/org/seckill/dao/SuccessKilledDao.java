package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

    /**
     *  @Author champion
     *  @Date 2017/9/5 11:31
     *  @Param
     *  @Return
     *  插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     *  @Author champion
     *  @Date 2017/9/5 11:29
     *  @Param
     *  @Return
     *  携带秒杀产品对象实体
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
