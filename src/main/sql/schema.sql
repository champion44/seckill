CREATE DATABASE seckill;

use seckill;

CREATE TABLE seckill(
seckill_id BIGINT NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
name varchar(120) NOT NULL COMMENT '商品名称',
number INT NOT  NULL COMMENT '库存数量',
create_time TIMESTAMP NOT  NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
start_time TIMESTAMP NOT  NULL COMMENT '秒杀开启时间',
end_time TIMESTAMP NOT  NULL COMMENT '秒杀结束时间',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)
) ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

INSERT INTO
seckill(name,number,start_time,end_time)
VALUES
('1000元秒杀iPhone6',100,'2017-09-04 00:00:00','2017-09-05 00:00:00'),
('40元秒杀iPhone7',100,'2017-09-04 00:00:00','2017-09-05 00:00:00'),
('100元秒杀Mac6',100,'2017-09-04 00:00:00','2017-09-05 00:00:00'),
('400元秒杀iPad6',100,'2017-09-04 00:00:00','2017-09-05 00:00:00');

CREATE TABLE success_killed(
seckill_id bigint NOT NULL COMMENT '秒杀商品id',
user_phone bigint NOT NULL COMMENT '用户手机号',
state tinyint NOT NULL DEFAULT -1 COMMENT '状态表示：-1：无效 0：成功 1：已经支付',
create_time TIMESTAMP NOT NULL COMMENT '创建时间',
PRIMARY KEY (seckill_id,user_phone),
KEY idx_create_time(create_time)
) ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表'

mysql -urooot -p