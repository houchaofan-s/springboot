package com.fh.service.Impl;

import com.fh.common.JsonData;
import com.fh.dao.MovieDao;
import com.fh.model.Movie;
import com.fh.model.vo.VoMovie;
import com.fh.service.MovieService;
import com.fh.utils.DataTableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

@Resource
 private MovieDao movieDao;

 @Override
 public DataTableResult queryMovieList(VoMovie voMovie) {
  Long count=movieDao.queryCount(voMovie);

  List<VoMovie> voMovieList= movieDao.queryMovieList(voMovie);

  DataTableResult dataTableResult=new DataTableResult(voMovie.getDraw(),count,count,voMovieList);
  return dataTableResult;
 }

 @Override
 public void deleteNum(Integer id) {

  movieDao.updateNum(id);
 }

 @Override
 public void addMovie(Movie movie) {
  movieDao.insert(movie);
 }


}
