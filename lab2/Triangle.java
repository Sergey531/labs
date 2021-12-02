package Labs.lab2;

public class Triangle {
    private int line1;
    private int line2;
    private int line3;

    public Triangle(int line1, int line2, int line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        if (isTriangle()) {

        }
        else{
            //this.line1=0;
            ///this.line2=0;
            //this.line3=0;
            System.out.print("Its not triangle: ");
        }
    }

    public int getLine1() {
        return line1;
    }
    public void setLine1(int line1) {
        this.line1 = line1;
    }
    public int getLine2() {
        return line2;
    }
    public void setLine2(int line2) {
        this.line2 = line2;
    }
    public int getLine3() {
        return line3;
    }
    public void setLine3(int line3) {
        this.line3 = line3;
    }

    boolean isNaN(double x){return x != x;}
    public boolean isTriangle(){
        if (isNaN(angle1()) || isNaN(angle2()) || isNaN(angle3()) ||
                angle1()==0 ||angle2()==0 || angle3()==0){
            return false;
        }
        if (line1+line2>line3 && line2+line3>line1 && line3+line1>line2 &&
                line1>0 && line2>0 && line3>0){
            return true;
        }
        else {
            return false;
        }
    }

    public double angle1(){
        //(b*b+c*c-a*a)/2bc;
        double c1 = (line2*line2+line3*line3-line1*line1);
        double c2 = (2*line2*line3);
        double c3 = c1/c2;
        // double cosA=(line2*line2+line3*line3-line1*line1)/(2*line2*line3);
        return Math.toDegrees(Math.acos(c3));
    }
    public double angle2(){
        //(a2+c2-b2)/2ac
        double c1 = (line1*line1+line3*line3-line2*line2);
        double c2 = (2*line1*line3);
        double c3 = c1/c2;
        //double cosB = ((line1*line1+line3*line3-line2*line2)/(2*line1*line3);
        return Math.toDegrees(Math.acos(c3));
    }
    public double angle3(){
        //(a2+b2-c2)/2ab
        double c1 = (line1*line1+line2*line2-line3*line3);
        double c2 = (2*line1*line2);
        double c3 = c1/c2;
        //double cosC = (line1*line1+line2*line2-line3*line3)/(2*line1*line2);
        return Math.toDegrees(Math.acos(c3));
    }

    public double perimetr(){
        return (line1+line2+line3);
    }

    public double area(){
        double p = (line1+line2+line3)/2;
        double S=Math.sqrt(p*(p-line1)*(p-line2)*(p-line3));
        return S;
    }

    public double getArea(){
        if (isNaN(area())){
            return 0;
        }
        return area();
    }

    public String toString(){
        return "line1: "+line1+
                " line2: "+line2+
                " line3: "+line3+
                " angle1: "+Math.round(angle1())+
                " angle2: "+Math.round(angle2())+
                " angle3: "+Math.round(angle3())+
                " P: "+Math.round(perimetr())+
                " S: "+Math.round(area());
    }


}
