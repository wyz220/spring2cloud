package com.wyz.feign;

import com.wyz.entity.Shoe;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ShoeFeignFactory implements FallbackFactory<ShoeFeign> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShoeFeignFactory.class);

    @Override
    public ShoeFeign create(Throwable throwable) {
        return new ShoeFeign() {
            @Override
            public Shoe getById(Long id) {
                LOGGER.debug("case =>",throwable);
                Shoe shoe = new Shoe();
                shoe.setShoeId(-1L);
                return shoe;
            }
        };
    }

}
