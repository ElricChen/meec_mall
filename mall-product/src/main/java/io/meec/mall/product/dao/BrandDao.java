package io.meec.mall.product.dao;

import io.meec.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-23 22:27:37
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
