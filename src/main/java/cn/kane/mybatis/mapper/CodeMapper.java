package cn.kane.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kane.mybatis.domain.Code;
import cn.kane.mybatis.domain.CodeExample;

public interface CodeMapper {
    int countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Code record);

    int insertSelective(Code record);

    List<Code> selectByExampleWithBLOBs(CodeExample example);

    List<Code> selectByExample(CodeExample example);

    Code selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExampleWithBLOBs(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKeyWithBLOBs(Code record);

    int updateByPrimaryKey(Code record);
}