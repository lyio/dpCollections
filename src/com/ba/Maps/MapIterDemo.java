package com.ba.Maps;


import java.util.*;

import static java.lang.System.*;

public final class MapIterDemo {
    public static final int MTR_NO = 5000001;

    public static void main(final String[] args) {
        final Map<Integer,Student> matrikelMap = new TreeMap<> ();
        final Map<String, Student> nachnameMap = new HashMap<>();
        Student s;

        // filling up maps
        s = new Student(MTR_NO, "Curie", "Marie", 19);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);

        s = new Student(5000002, "Merian","Maria-Sybillaw", 17);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);

        s = new Student(5000003, "Noether", "Emmi", 16);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);

        s = new Student(5000004, "Meilner", "Lise", 15);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);

        s = new Student(5000005, "Herschel", "Caroline", 20);
        matrikelMap.put(s.getMatrikelnr(), s);
        nachnameMap.put(s.getName(), s);

        ausgabenMarikelnr(matrikelMap);
        ausgabenNamen(nachnameMap);
    }

    private static void ausgabenNamen(final Map<String, Student> nachnameMap) {
        final Set<String> nachNameSet = nachnameMap.keySet();
        final Iterator<String> iterName = nachNameSet.iterator();

        out.println("Name (" + nachnameMap.getClass() + "):");

        // all keys
        while (iterName.hasNext()) {
            out.println("Nachname: " + iterName.next());
        }

        // Student with specific key
        out.println("Student mit Name " + "Merian " + "ist: " + nachnameMap.get("Merian"));
        out.println("Student mit Name " + "Herschel " + "ist: " + nachnameMap.get("Herschel"));

        out.println("'Alle Werte der Map:");
        for (final Student s : nachnameMap.values()) {
            out.println("Student: " + s);
        }
    }

    public static void ausgabenMarikelnr(final Map<Integer,Student> mp) {
        final Set<Integer> mtrikelSet = mp.keySet();
        final Iterator<Integer> iterMatrikel = mtrikelSet.iterator();

        out.println("Name (" + mp.getClass() + "):");

        // all keys
        while (iterMatrikel.hasNext()) {
            out.println("Matrikelnummer: " + iterMatrikel.next());
        }

        // Student with specific key
        out.println("Student mit Matrikelnummer " + MTR_NO + ": " + mp.get(MTR_NO));

        out.println("'Alle Werte der MarikelMp:");
        final Collection<Student> studentCollection = mp.values();
        final Iterator<Student> iterator = studentCollection.iterator();

        while (iterator.hasNext()) {
            out.println("Student: " + iterator.next());
        }
    }
}
