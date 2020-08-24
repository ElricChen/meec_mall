package io.meec.mall.coupon.dao;

import io.meec.mall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:10:32
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}
