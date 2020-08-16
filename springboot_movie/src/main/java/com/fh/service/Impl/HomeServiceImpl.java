package com.fh.service.Impl;

import com.fh.dao.HomeDao;
import com.fh.model.Home;
import com.fh.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

@Resource
 private HomeDao homeDao;

 @Override
 public List<Home> queryHomeList() {

  return homeDao.selectList(null);
 }
}
