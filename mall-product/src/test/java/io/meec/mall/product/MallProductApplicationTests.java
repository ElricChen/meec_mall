package io.meec.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.meec.mall.product.entity.BrandEntity;
import io.meec.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class MallProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("测试数据123");
//        brandService.save(brandEntity);
//        brandService.updateById(brandEntity);
        log.info("保存成功");
        List<BrandEntity> brand_ids = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brand_ids.forEach(brandEntity1 -> {
            System.out.println("brandEntity1 >> " + brandEntity1);
        });
        if (true) {

        }
    }


    @Test
    void runs() {
        System.out.println(test2("5", "1", "9"));
        System.out.println(test2("5.0", "1", "9"));
        System.out.println(test2("5.0", "1.5", "9"));
        System.out.println(test2("1.0", "1.5", "9"));
    }

    boolean test2(String checkNum, String leftNum, String rightNum) {
        boolean result = false;
        Double transferC = Double.valueOf(checkNum);
        Double transferL = Double.valueOf(leftNum);
        Double transferR = Double.valueOf(rightNum);

        if (transferC > transferL && transferC < transferR) {
            result = true;
        }
        return result;


    }
}
