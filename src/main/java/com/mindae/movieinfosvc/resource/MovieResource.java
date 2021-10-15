package com.mindae.movieinfosvc.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindae.movieinfosvc.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable ("movieId")String movieId) {
		System.out.println("getMovieInfo");
		return new Movie(movieId,"test movie name");
	}

}
