package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyQuestion2 {

    public static int countBandMembersInternal(Stream<Artist> artistStream) {
        return artistStream.map(artist -> artist.getMembers().count())
                .reduce(0L, Long::sum)
                .intValue();
    }
}
