package Labs.lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student first = new Student();
        first.setSurname("Smith");
        first.setSpecialty(Specialty.AT);
        first.setYearOfAdmission(2000);
        first.setPhysicsGrade(100);
        first.setMathsGrade(90);
        first.setComputerScienceGrade(80);
        students.add(first);

        Student second = new Student();
        first.setSurname("Johnson");
        first.setSpecialty(Specialty.AI);
        first.setYearOfAdmission(2018);
        first.setPhysicsGrade(60);
        first.setMathsGrade(90);
        first.setComputerScienceGrade(99);
        students.add(second);

        Student third = new Student();
        first.setSurname("Williams");
        first.setSpecialty(Specialty.AC);
        first.setYearOfAdmission(1990);
        first.setPhysicsGrade(80);
        first.setMathsGrade(95);
        first.setComputerScienceGrade(65);
        students.add(third);

        Student fourth = new Student();
        first.setSurname("Brown");
        first.setSpecialty(Specialty.AT);
        first.setYearOfAdmission(2021);
        first.setPhysicsGrade(100);
        first.setMathsGrade(94);
        first.setComputerScienceGrade(81);
        students.add(fourth);

        Student fifth = new Student();
        first.setSurname("Davis");
        first.setSpecialty(Specialty.AD);
        first.setYearOfAdmission(2017);
        first.setPhysicsGrade(101);
        first.setMathsGrade(93);
        first.setComputerScienceGrade(70);
        students.add(fifth);


        Student sixth = new Student();
        sixth.setSurname("Lopes");
        sixth.setSpecialty(Specialty.AT);
        sixth.setYearOfAdmission(2018);
        sixth.setPhysicsGrade(99);
        sixth.setMathsGrade(75);
        sixth.setComputerScienceGrade(69);
        students.add(sixth);


        //System.out.println(first.toString());

        System.out.println("Students in 3+ course:");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getYearOfAdmission()<2020 && students.get(i).getYearOfAdmission()!=0){
                System.out.println(students.get(i).toString());
            }

        }



    }
}
