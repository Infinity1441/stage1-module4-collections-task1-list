package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            String bir = String.valueOf(i+1);
            if (sourceList.size()>2&&((i+1)%3==0||(bir.charAt(0)=='1'&&bir.length()>1))){
                arrayList.add(sourceList.get(i));
                arrayList.add(sourceList.get(i));
            }
        }
        return arrayList;
    }
}