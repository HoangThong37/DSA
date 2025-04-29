package _150_interview_leetcode;

import java.util.*;

public class _380_Insert_Delete_GetRandom {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;

    public _380_Insert_Delete_GetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }

        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }

        int getValue = map.get(val);
        if(getValue < list.size() - 1) {
            list.set(getValue, list.get(list.size() - 1));
            map.put(list.get(list.size() - 1), getValue);
        }

        map.remove(val);
        list.remove(list.size() - 1);

        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
