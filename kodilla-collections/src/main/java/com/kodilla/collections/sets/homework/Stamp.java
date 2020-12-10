package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String size;
    private String validation;

    public Stamp(String stampName, String size, String validation) {
        this.stampName = stampName;
        this.size = size;
        this.validation = validation;
    }
    public String getStampName(){
        return stampName;
    }
    public String getSize(){
        return size;
    }
    public String getValidation(){
        return validation;
    }
    @Override public boolean equals(Object o) {
        if (o == this) {
            return true;}
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return CharSequence.compare(stamp.stampName, stampName) == 0
                && CharSequence.compare(stamp.size, size) == 0
                && CharSequence.compare(stamp.validation, validation) == 0;
    }

    @Override public int hashCode() {
        return Objects.hash(stampName, size, validation);
    }
    @Override
    public String toString(){
        return "Stamp{" + "stamp name='" + stampName + '\'' + ", stamp size='"
                + size + '\'' + ", validated/not validated=" + validation + '}';
    }
}
