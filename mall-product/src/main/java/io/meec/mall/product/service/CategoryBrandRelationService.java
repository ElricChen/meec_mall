package io.meec.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.meec.common.utils.PageUtils;
import io.meec.mall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-23 22:27:37
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

