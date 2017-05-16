package com.example.demo.mapper;

import com.example.demo.entity.Hierarchy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lsd on 2017-05-16.
 */
@Mapper
@Repository(value = "testMapper")
public interface TestMapper {

    List<Hierarchy> getAll();
}
