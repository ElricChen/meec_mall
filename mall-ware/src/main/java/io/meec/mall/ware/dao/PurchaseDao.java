package io.meec.mall.ware.dao;

import io.meec.mall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:58:42
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
