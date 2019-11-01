package ru.rzn.sbt.javaschool.lesson6.map;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getCountMap() {

        Map<Integer, Integer> resultMap;
        CountMap<Integer> countMap1 = Solution.getCountMap();
        resultMap = countMap1.toMap();
        assertTrue(resultMap.isEmpty());

        try {
            countMap1.add(null);
            fail("NPE expected");
        } catch (NullPointerException e) {

        }
        try {
            countMap1.remove(null);
            fail("NPE expected");
        } catch (NullPointerException e) {

        }
        try {
            countMap1.getCount(null);
            fail("NPE expected");
        } catch (NullPointerException e) {

        }
        try {
            countMap1.addAll(null);
            fail("NPE expected");
        } catch (NullPointerException e) {

        }
        try {
            countMap1.toMap(null);
            fail("NPE expected");
        } catch (NullPointerException e) {

        }

        countMap1.add(10);
        countMap1.add(10);
        countMap1.add(5);
        countMap1.add(6);
        countMap1.add(5);
        countMap1.add(10);

        System.out.println(countMap1);

        resultMap = countMap1.toMap();
        assertEquals(resultMap.size(), 3);
        assertEquals(resultMap.get(5).intValue(), 2);
        assertEquals(resultMap.get(6).intValue(), 1);
        assertEquals(resultMap.get(10).intValue(), 3);
        for(Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
            assertEquals(entry.getValue().intValue(), countMap1.getCount(entry.getKey()));
        }

        countMap1.remove(10);
        countMap1.remove(6);

        resultMap = countMap1.toMap();
        assertEquals(resultMap.size(), 2);
        assertEquals(resultMap.get(5).intValue(), 2);
        assertEquals(resultMap.get(10).intValue(), 2);
        for(Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
            assertEquals(entry.getValue().intValue(), countMap1.getCount(entry.getKey()));
        }

        CountMap countMap2 = Solution.getCountMap();
        countMap2.add(12);
        countMap2.add(12);
        countMap2.add(4);
        countMap2.add(6);
        countMap2.add(5);
        countMap2.add(3);

        countMap1.addAll(countMap2);
        countMap1.toMap(resultMap);
        assertEquals(resultMap.size(), 6);
        assertEquals(resultMap.get(3).intValue(), 1);
        assertEquals(resultMap.get(4).intValue(), 1);
        assertEquals(resultMap.get(5).intValue(), 3);
        assertEquals(resultMap.get(6).intValue(), 1);
        assertEquals(resultMap.get(10).intValue(), 2);
        assertEquals(resultMap.get(12).intValue(), 2);
        for(Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
            assertEquals(entry.getValue().intValue(), countMap1.getCount(entry.getKey()));
        }

    }
}