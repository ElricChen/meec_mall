package io.meec.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

// import org.apache.shiro.authz.annotation.RequiresPermissions;
//import io.meec.mall.member.feign.MallProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.meec.mall.member.entity.MemberEntity;
import io.meec.mall.member.service.MemberService;
import io.meec.common.utils.PageUtils;
import io.meec.common.utils.R;

import javax.annotation.Resource;


/**
 * 会员
 *
 * @author ElricChen
 * @email ElricChen@gmail.com
 * @date 2020-08-24 23:55:59
 */
@RefreshScope // Nacos配置中心动态加载
@RestController
@RequestMapping("member/member")
public class MemberController {

    @Value("${users.name}")
    private String userName;
    @Value("${users.age}")
    private String userAge;

    @Autowired
    private MemberService memberService;

//    @Resource
//    MallProductService mallProductService;

    @RequestMapping("/mlist")
    public R mlist(){
        System.out.println("userName: "+userName);
        System.out.println("userAge: "+userAge);
        return R.ok().put("username",userName).put("userage",userAge);
//        return mallProductService.list();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
