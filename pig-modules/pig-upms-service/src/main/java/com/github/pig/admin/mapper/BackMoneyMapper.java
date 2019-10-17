package com.github.pig.admin.mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.pig.admin.model.entity.BackMoney;
import com.github.pig.admin.model.entity.CaseInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BackMoneyMapper extends BaseMapper<BackMoney> {
    public List<BackMoney> selectByCard(@Param("card") String card);

    int selectCount(@Param("keyWord") String keyWord, @Param("bankname") String bankname, @Param("batchno") String batchno, @Param("ownerid") String ownerid);

    List<CaseInfo> selectPageByKey(@Param("current") int current, @Param("limit") int limit, @Param("keyWord") String keyWord, @Param("bankname") String bankname, @Param("batchno") String batchno, @Param("ownerid") String ownerid);

    Integer selectCountNoKey( @Param("bankname") String bankname, @Param("batchno") String batchno, @Param("ownerid") String ownerid);

    List<CaseInfo> selectPageNoKey(@Param("current") int current, @Param("limit") int limit, @Param("bankname") String bankname, @Param("batchno") String batchno, @Param("ownerid") String ownerid);

}