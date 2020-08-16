package com.fh.controller;


import com.alibaba.fastjson.JSON;
import com.fh.common.JsonData;
import com.fh.model.Home;
import com.fh.service.HomeService;
import com.fh.utils.RedisUse;
import com.fh.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.List;

@RestController
@RequestMapping("homeController")
public class HomeController {

 @Autowired
 private HomeService homeService;

 @RequestMapping("queryHomeList")
 @CrossOrigin
public JsonData queryHomeList(){

 String queryHomeList_hcf = RedisUse.get("queryHomeList_hcf");
 if(StringUtils.isEmpty(queryHomeList_hcf)==true){

  List<Home> shopDistrictLIst = homeService.queryHomeList();

  queryHomeList_hcf = JSON.toJSONString(shopDistrictLIst);

  RedisUse.set("queryHomeList_hcf", queryHomeList_hcf);
 }
return JsonData.getJsonSuccess(queryHomeList_hcf);
}


}
