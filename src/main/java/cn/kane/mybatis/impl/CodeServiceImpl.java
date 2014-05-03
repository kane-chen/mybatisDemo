/*
 * @(#)CodeServiceImpl.java	2014年2月14日
 *
 * @Company <Opportune Technology Development Company LTD.>
 */
package cn.kane.mybatis.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kane.mybatis.domain.Code;
import cn.kane.mybatis.mapper.CodeMapper;
import cn.kane.mybatis.service.CodeService;


/**
 * @Project <CL-Allocation tool>
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年2月14日>
 * @description 
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper codeMapper ;

    public int save(Code code) {
        if(null!=code){
            return codeMapper.insertSelective(code) ;
        }
        return 0;
    }

    public Code selectById(Long id) {
        if(null!=id){
            return codeMapper.selectByPrimaryKey(id) ;
        }
        return null;
    }

    public int update(Code code) {
        if(null!=code){
            return codeMapper.updateByPrimaryKey(code) ;
        }
        return 0;
    }

    public int delete(Long id) {
        if(null!=id){
            return codeMapper.deleteByPrimaryKey(id) ;
        }
        return 0;
    }

}
