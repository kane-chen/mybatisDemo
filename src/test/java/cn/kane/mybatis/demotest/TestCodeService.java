/*
 * @(#)TestCodeService.java	2014年1月6日
 *
 * @Company <Opportune Technology Development Company LTD.>
 */
package cn.kane.mybatis.demotest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kane.mybatis.domain.Code;
import cn.kane.mybatis.service.CodeService;



/**
 * @Project <CL-Allocation tool>
 * @version <1.0>
 * @Author  <Administrator>
 * @Date    <2014年1月6日>
 * @description 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_test.xml")
public class TestCodeService extends TestBase {

    @Autowired
    private CodeService codeService ;
    
    private Long id = 1l ;
    
    @Before//should run once before every test-case
//    @BeforeClass should run once with multi-testcase,but setup-method must be static
    public void setup(){
        logger.debug("----------setup----------");
        Code code = new Code();
        code.setId(id);
        code.setCode("000000000000000000001");
        code.setPasword("ppppppppppppppppppppppppppp");
        code.setSpId(1);
        code.setRemark("ddddescription");
        int result = codeService.save(code);
        Assert.assertEquals(1, result);
    }
    
    @Test
    public void testSave(){
        logger.debug("--------------save-------------");
    }
    
    @Test
    public void testSelect(){
        Code code = codeService.selectById(id) ;
        Assert.assertNotNull(code);
    }
    
    @Test 
    public void testUpdate(){
        Code code = codeService.selectById(id) ;
        String codeStr = "ccccccccccccccccc" ;
        code.setCode(codeStr);
        int result = codeService.update(code);
        Assert.assertEquals(1, result);
        code = codeService.selectById(code.getId()) ;
        Assert.assertEquals(codeStr, code.getCode());
    }
    
    @After//should run once after every test-case
//    @AfterClass //should run once within multi-testcase,but teardown-method must be static
    public void teardown(){
        logger.debug("----------teardown----------");
        int result = codeService.delete(id) ;
        Assert.assertEquals(1, result);
    }
    
}
