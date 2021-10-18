package com.springbootfeatures.batchexample.batchapplication.batch;

import com.springbootfeatures.batchexample.batchapplication.model.Users;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class Processor implements ItemProcessor<Users,Users> {

    private static final Map<String,String> DEP_MAP = new HashMap<>();

    public Processor() {
        DEP_MAP.put("001","ENGINEERING");
        DEP_MAP.put("002","COMMERCE");
        DEP_MAP.put("003","LANGUAGE");
    }
    @Override
    public Users process(Users users) throws Exception {
        String deptCode = users.getDept();
        String depName = DEP_MAP.get(deptCode);
        users.setDept(depName);
        System.out.println("converted from"+deptCode+ "to  "+deptCode);
        return users;
    }
}
