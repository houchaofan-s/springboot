package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fh.utils.DataTablePageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@TableName("t_movie")
public class Movie extends DataTablePageBean {
 @TableId(value = "mid",type = IdType.AUTO)
 private Integer mid;
 @TableField("name")
 private String name;
 @TableField("showTime")
 @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
 @JsonFormat(
  pattern = "yyyy-MM-dd HH:mm:ss",
  timezone = "GMT+8"
 )
 private Date showTime;
 @TableField("num")
 private Integer num;
 @TableField("price")
 private Integer price;
 @TableField("showHome")
 private String showHome;
 @TableField("imgUrl")
 private String imgUrl;

 public Integer getMid() {
  return mid;
 }

 public void setMid(Integer mid) {
  this.mid = mid;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Date getShowTime() {
  return showTime;
 }

 public void setShowTime(Date showTime) {
  this.showTime = showTime;
 }

 public Integer getNum() {
  return num;
 }

 public void setNum(Integer num) {
  this.num = num;
 }

 public Integer getPrice() {
  return price;
 }

 public void setPrice(Integer price) {
  this.price = price;
 }

 public String getShowHome() {
  return showHome;
 }

 public void setShowHome(String showHome) {
  this.showHome = showHome;
 }

 public String getImgUrl() {
  return imgUrl;
 }

 public void setImgUrl(String imgUrl) {
  this.imgUrl = imgUrl;
 }
}
