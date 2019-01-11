package com.shawn.respository;

import com.shawn.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Shawn
 * @Date: 2019/1/10 19:33
 */
public interface GirlRepository extends JpaRepository <Girl,Integer>{

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
