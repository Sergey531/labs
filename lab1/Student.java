package Labs.lab1;

public class Student {
    String surname;
    private Specialty specialty;
    private int yearOfAdmission;
    private int physicsGrade;
    private int mathsGrade;
    private int computerScienceGrade;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        if (yearOfAdmission>2016 && yearOfAdmission<2022){
            this.yearOfAdmission = yearOfAdmission;
        }
        else {
            System.out.println("Error with yearOfAdmission");
        }

    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        if (physicsGrade>0 && physicsGrade<101){
            this.physicsGrade = physicsGrade;
        }
        else {
            System.out.println("Error with physicsGrade");
        }
    }

    public int getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(int mathsGrade) {
        if (mathsGrade>0 && mathsGrade<101){
            this.mathsGrade = mathsGrade;
        }
        else {
            System.out.println("Error with mathsGrade");
        }
    }

    public int getComputerScienceGrade() {
        return computerScienceGrade;
    }

    public void setComputerScienceGrade(int computerScienceGrade) {
        if (computerScienceGrade>0 && computerScienceGrade<101){
            this.computerScienceGrade = computerScienceGrade;
        }
        else {
            System.out.println("Error with computerScienceGrade");
        }
    }

    public String toString(){
        return "surname: "+getSurname()+
                " specialty "+getSpecialty()+
                " yearOfAdmission: "+getYearOfAdmission()+
                " physicsGrade: "+getPhysicsGrade()+
                " mathsGrade: "+getMathsGrade()+
                " computerScienceGrade: "+getComputerScienceGrade();
    }
}


