package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_movie_showHome")
public class Home {
 @TableId(value = "hid",type = IdType.AUTO)
 private Integer hid;
 @TableField("hname")
 private String  hname;

 public Integer getHid() {
  return hid;
 }

 public void setHid(Integer hid) {
  this.hid = hid;
 }

 public String getHname() {
  return hname;
 }

 public void setHname(String hname) {
  this.hname = hname;
 }
}
