package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private final String stampName;
    private final String size;
    private final boolean stamped;

    public Stamp(String stampName, String size, boolean stamped) {
        this.stampName = stampName;
        this.size = size;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getSize() {
        return size;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return isStamped() == stamp.isStamped() &&
                Objects.equals(getStampName(), stamp.getStampName()) &&
                Objects.equals(getSize(), stamp.getSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getSize(), isStamped());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", size='" + size + '\'' +
                ", stamped=" + stamped +
                '}';
    }
}






