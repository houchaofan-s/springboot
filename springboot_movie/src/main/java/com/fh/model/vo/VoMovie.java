package com.fh.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fh.utils.DataTablePageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class VoMovie extends DataTablePageBean {

 private Integer mid;

 private String name;
 @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
 @JsonFormat(
  pattern = "yyyy-MM-dd HH:mm:ss",
  timezone = "GMT+8"
 )
 private Date showTime;

 private Integer num;

 private Integer price;

 private String showHome;

 private String imgUrl;

 private String isTicket;

 public String getIsTicket() {
  return isTicket;
 }

 public void setIsTicket(String isTicket) {
  this.isTicket = isTicket;
 }

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
