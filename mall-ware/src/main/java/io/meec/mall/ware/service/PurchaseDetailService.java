package io.meec.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.meec.common.utils.PageUtils;
import io.meec.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:58:42
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

