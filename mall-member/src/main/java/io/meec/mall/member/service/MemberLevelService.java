package io.meec.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.meec.common.utils.PageUtils;
import io.meec.mall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:55:59
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

