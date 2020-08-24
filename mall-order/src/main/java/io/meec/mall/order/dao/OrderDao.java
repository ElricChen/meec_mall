package io.meec.mall.order.dao;

import io.meec.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:57:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
