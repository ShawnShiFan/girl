package com.shawn.Service;

import com.shawn.domain.Girl;
import com.shawn.respository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Shawn
 * @Date: 2019/1/11 16:04
 */

@Service
public class GirlService {
       @Autowired
       private GirlRepository girlRepository;
        @Transactional     //事务管理：回滚等性质
        public  void insertTwo(){  //实现同时插入两条数据，有一条失败就都不插入
            Girl girlA = new Girl();
            girlA.setCupSize("A");
            girlA.setAge(18);
            girlRepository.save(girlA);

            Girl girlB = new Girl();
            girlB.setCupSize("BB");
            girlB.setAge(19);
            girlRepository.save(girlB);
        }


}
