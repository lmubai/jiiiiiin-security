package cn.jiiiiiin.module.common.mapper.mngauth;

import cn.jiiiiiin.ManagerApp;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ManagerApp.class)
@Slf4j
public class InterfaceMapperTest {

    @Autowired
    private InterfaceMapper interfaceMapper;

    @Test
    public void selectByResourceId() {
        val itfSets = interfaceMapper.selectByResourceId(1062518178556526593L);
        assertNotNull(itfSets);
        log.debug("selectByResourceId", JSONObject.toJSONString(itfSets));
    }
}