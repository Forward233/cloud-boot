package com.dubbo.service;

import com.api.service.ByeService;
import org.apache.dubbo.rpc.service.GenericService;

import javax.annotation.Resource;

/**
 * @author: yhl
 * @DateTime: 2020/9/8 16:46
 * @Description:
 */
public class ByServiceImpl implements ByeService {
    @Resource(name = "byeService")
    private GenericService genericService;

    public void sayBye(){
        Object result = genericService.$invoke(
                "bye",
                new String[]{"java.lang.String"},
                new Object[]{"1234"});
        System.out.println(result);
    }

    @Override
    public String sayBye(String name) {
        Object result = genericService.$invoke(
                "bye",
                new String[]{"java.lang.String"},
                new Object[]{"1234"});
        return "result";
    }
}
