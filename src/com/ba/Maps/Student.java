package com.ba.Maps;

import com.sun.istack.internal.NotNull;

public final class Student implements Comparable<Student> {

    private final int matrikelnr;

    private final String name;

    private final String vorname;

    private final int semester;

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public int getSemester() {
        return semester;
    }

    public Student(int matrikelnr, String name, String vorname, int semester) {
        this.matrikelnr = matrikelnr;
        this.name = name;
        this.vorname = vorname;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "(" + matrikelnr + ", "
                + name + ", " + vorname + ", " + semester + ")";
    }

    @Override
    public int compareTo(final @NotNull Student o) {
        return matrikelnr - o.matrikelnr;
    }

    @Override
    public boolean equals(final Object o) {
        boolean result = false;
        if (this == o) result = true;
        if (o == null || getClass() != o.getClass()) result = false;

        final Student student = (Student) o;

        if (matrikelnr != student.matrikelnr) result = false;

        return result;
    }

    @Override
    public int hashCode() {
        return matrikelnr;
    }
}
