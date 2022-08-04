package org.example.collection;

import org.example.sms.Student;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();

        strings.add("Gayatri");
        strings.add("Gayatri");

        System.out.println("List = "+strings);

        Set<String> strings2 = new HashSet<String>();

        Set<Student> students = new HashSet<Student>();

        List<Student> strings1 = new ArrayList<Student>();

        Student student = new Student("Gayatri", 1, "Math", 2000);
        Student student1 = new Student("Sirisha", 2, "Science", 1998);
        Student student2 = new Student("Mahesh", 3, "Social", 1996);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        students.add(student);
        students.add(student1);
        students.add(student2);

        strings1.add(student);
        strings1.add(student1);
        strings1.add(student2);

        System.out.println("strings1 = "+strings1);
        System.out.println(students);

        strings2.add("Gayatri");
        strings2.add("Shirisha");
        strings2.add("Mahesh");

        System.out.println("Set = "+strings2);

        System.out.println("Set = "+strings1);

        Map<String, Student> map = new HashMap<String, Student>();

        map.put("Mahesh",student2);
        map.put("Gayatri", student);

        System.out.println(map.get("Shirisha"));
        System.out.println(map);
    }
}
