package com.science.resource.service.impl;

import com.alibaba.fastjson.JSON;
import com.science.resource.VO.RecType;
import com.science.resource.VO.Recommend;
import com.science.resource.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RecommendServiceImpl implements RecommendService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List getRecommend(int domain,int uid,int last) {
        String url="http://10.112.205.250:12348/?domain="+domain+"&uid="+uid+"&last="+last;
        String uuidList = restTemplate.getForObject(url, String.class);
        Recommend recommend=JSON.parseObject(uuidList,Recommend.class);
        List recommendList = new ArrayList();
        for (Integer index : recommend.getResult()){
            url="http://10.112.205.250:5000/show_information?id="+index+"&area="+ RecType.getText(domain);
            recommendList.add(restTemplate.getForObject(url, String.class));
        }
        return recommendList;
    }
}
