package com.fh.controller;


import com.fh.common.JsonData;
import com.fh.model.Movie;
import com.fh.model.vo.VoMovie;
import com.fh.service.MovieService;
import com.fh.utils.DataTableResult;
import com.fh.utils.FilesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("movieController")
public class MovieController {

 @Autowired
 private MovieService movieService;

 @CrossOrigin
 @RequestMapping("queryMovieList")
 public DataTableResult queryMovieList(VoMovie voMovie){

  DataTableResult dataTableResult= movieService.queryMovieList(voMovie);

  return dataTableResult;
 }

 @CrossOrigin
 @RequestMapping("deleteNum")
 public JsonData deleteNum(Integer id){
  movieService.deleteNum(id);
  return JsonData.getJsonSuccess("购买成功");
 }

 @CrossOrigin
 @RequestMapping("uploadAvatar")
 public Map<String,Object> uploadAvatar(
  @RequestParam("img") MultipartFile multipartFile, HttpServletRequest request){
  Map<String,Object> result = new HashMap<String, Object>();

  try {
   File file = FilesUtils.readFiles(multipartFile);

   String s = FilesUtils.fileUpload(file);

   result.put("success",true);
   result.put("filePath", s);


  } catch (Exception e) {
   result.put("success",false);
   e.printStackTrace();
  }
  return result;
 }


 @RequestMapping("addMovie")
 @CrossOrigin
 public JsonData addMovie(Movie movie){
  movieService.addMovie(movie);

  return JsonData.getJsonSuccess("添加成功");
 }


}
