package com.ashxhuman.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@Document(collection="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins="*")
public class Movie {
    @Id
    private ObjectId _id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private List<String> genres;
    private String poster;
    private List<String> backdrops;

    //manual ref relationship
    //Stores only id of reviews and reviews will be in seperated collection
    @DocumentReference
    private List<Review> reviewIds;
}
