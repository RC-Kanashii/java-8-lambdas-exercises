package com.insightfullogic.java8.answers.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.insightfullogic.java8.answers.chapter3.MyQuestion2.countBandMembersInternal;
import static org.junit.Assert.assertEquals;

public class MyQuestion2Test {

    @Test
    public void solution() {
        assertEquals(4, countBandMembersInternal(Arrays.asList(SampleData.johnColtrane, SampleData.theBeatles).stream()));
    }

}
