package com.science.resource;

import com.alibaba.fastjson.JSON;
import com.science.resource.VO.RecType;
import com.science.resource.VO.Recommend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ScienceResourceProjectApplicationTests {
//    @Autowired
//    UserService userService;
    @Autowired
    private RestTemplate restTemplate;
    @Test
    void contextLoads() {
        String url="http://10.108.210.65:12348/?domain="+2+"&uid="+3+"&last="+1;
        String object = restTemplate.getForObject(url, String.class);
        Recommend recommend = JSON.parseObject(object, Recommend.class);
        List<String> recommendList = new ArrayList();
        for (Integer index : recommend.getResult()){
            url="http://10.108.210.65:5000/show_information?id="+index+"&area="+ RecType.getText(2);
            recommendList.add(restTemplate.postForObject(url,null, String.class));
        }
        List objList = new ArrayList();

        for(String temp : recommendList){
            System.out.println( temp);
//            String newString = temp.replaceAll("\\\\\"","\"");
//            newString = newString.replaceAll("\\\\\\\\","\\\\");
//            newString = newString.replaceAll("\"\\[","[");
//            newString = newString.replaceAll("\"\"","\"");
//            newString = newString.replaceAll("\\\\\"","\\\"");
//            newString = newString.replaceAll("\"\\{","{");
//            newString = newString.replaceAll("\\}\"","}");
//            //            objList.add(JSON.parseObject(temp));
//            JSON.parseObject(newString,Map.class);
//            objList.add(JSON.parseObject(newString,Map.class));
        }

//        System.out.println(recommend.toString());
//       User user = userService.getById(1);
//       System.out.println(user.toString());
    }

}
