package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Movie;
import com.fh.model.vo.VoMovie;

import java.util.List;

public interface MovieDao extends BaseMapper<Movie> {

 Long queryCount(VoMovie voMovie);


 List<VoMovie> queryMovieList(VoMovie voMovie);

 void updateNum(Integer id);
}
