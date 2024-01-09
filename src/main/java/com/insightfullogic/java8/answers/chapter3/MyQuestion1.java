package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyQuestion1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (a, b) -> a + b);
    }

    public static List<String> artistAndNationality(Stream<Artist> artistStream) {
        return artistStream.map(artist -> artist.getName() + ": " + artist.getNationality())
                .collect(Collectors.toList());
    }

    public static List<Album> noMoreThan3Songs(Stream<Album> albumStream) {
        return albumStream.filter(album -> album.getTrackList().size() <= 3)
                .collect(Collectors.toList());
    }
}
