package com.keyin.rest.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class VideoGame {

    @Id
    @SequenceGenerator(name = "videogame_sequence", sequenceName = "videogame_sequence", allocationSize = 1, initialValue = 2)
    @GeneratedValue(generator = "videogame_sequence")

    private long id;
    private String title;
    private String publisher;
    private String[] platforms;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }
}
