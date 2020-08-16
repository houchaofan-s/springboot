package com.fh.service;

import com.fh.model.Movie;
import com.fh.model.vo.VoMovie;
import com.fh.utils.DataTableResult;

public interface MovieService {
 DataTableResult queryMovieList(VoMovie voMovie);

 void deleteNum(Integer id);

 void addMovie(Movie movie);
}
