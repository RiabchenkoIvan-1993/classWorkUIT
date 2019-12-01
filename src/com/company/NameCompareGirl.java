package com.company;

import java.util.Comparator;

public class NameCompareGirl implements Comparator<Girl> {
    @Override
    public int compare(Girl girl, Girl t1) {
        return girl.name.compareTo(t1.name);
    }
}
