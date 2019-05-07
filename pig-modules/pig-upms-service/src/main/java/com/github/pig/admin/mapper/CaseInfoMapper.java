package com.github.pig.admin.mapper;

import com.github.pig.admin.model.dto.CaseDTO;
import com.github.pig.admin.model.entity.CaseInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lengleng
 * @since 2019-03-28
 */
@Repository
public interface CaseInfoMapper extends BaseMapper<CaseInfo> {

    Integer inserCaseInfo(CaseInfo caseInfo);

    CaseDTO selectCaseDTO(String guid);

    int selectCount(@Param("keyWord") String keyWord,@Param("userId") int userId);

    List<CaseInfo> selectPageByKey(@Param("current") int current, @Param("limit") int limit, @Param("keyWord") String keyWord,@Param("userId") Integer userId);

    Integer selectCountByName(@Param("name") String name,@Param("userId")int userId);

    List<CaseInfo> selectPageByName(@Param("current") int current,@Param("limit") int limit,@Param("name") String name,@Param("userId")int userId);

    Integer selectCountNoKey(int userId);

    List<CaseInfo> selectPageNoKey(@Param("current") int current, @Param("limit") int limit,@Param("userId")int userId);
}
