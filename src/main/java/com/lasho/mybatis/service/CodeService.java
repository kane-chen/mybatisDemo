package com.lasho.mybatis.service;

import com.lasho.mybatis.domain.Code;


/**
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年2月14日>
 * @description 
 */
public interface CodeService {

    int save(Code code) ;
    
    Code selectById(Long id) ;
    
    int update(Code code) ;
    
    int delete(Long id) ;
    
}
