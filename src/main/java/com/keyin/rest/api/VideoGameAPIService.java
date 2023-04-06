package com.keyin.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "videogame", path = "videogame")
public interface VideoGameAPIService extends JpaRepository<VideoGame, Long> {
    public List<VideoGame> findByTitle(@Param("title")String title);
    public List<VideoGame> findByPublisher(@Param("publisher")String publisher);
    public List<VideoGame> findByPlatforms(@Param("platforms")String[] platforms);
}
