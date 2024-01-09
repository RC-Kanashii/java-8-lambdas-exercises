package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class MyQuestion1Test {

    @Test
    public void a() {
        int result = com.insightfullogic.java8.answers.chapter3.MyQuestion1.addUp(Stream.of(1, 2, 3, 4));
        assertEquals(10, result);
    }

    @Test
    public void b() {
        List<String> res = com.insightfullogic.java8.answers.chapter3.MyQuestion1.artistAndNationality(SampleData.threeArtists());
        res.forEach(System.out::println);
    }

    @Test
    public void c() {
        List<Album> res = com.insightfullogic.java8.answers.chapter3.MyQuestion1.noMoreThan3Songs(
                Stream.of(SampleData.aLoveSupreme, SampleData.sampleShortAlbum, SampleData.manyTrackAlbum)
        );
        res.stream().map(Album::getName).forEach(System.out::println);
    }
}
