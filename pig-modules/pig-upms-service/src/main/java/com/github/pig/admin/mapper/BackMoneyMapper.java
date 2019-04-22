package com.github.pig.admin.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.admin.model.entity.BackMoney;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BackMoneyMapper extends BaseMapper<BackMoney> {
    public List<BackMoney> selectByCard(@Param("card") String card);
}