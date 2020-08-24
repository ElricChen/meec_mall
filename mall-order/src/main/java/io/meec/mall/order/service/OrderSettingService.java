package io.meec.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.meec.common.utils.PageUtils;
import io.meec.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:57:05
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

