package io.meec.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.meec.common.utils.PageUtils;
import io.meec.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-23 22:27:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

