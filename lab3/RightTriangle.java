package Labs.lab3;

import Labs.lab3.Triangle;

public class RightTriangle extends Triangle {
    public RightTriangle(int line1, int line2, int line3) {
        super(line1, line2, line3);
        if (isTriangle()) {

        }
        else{
            System.out.print("Its not triangle: ");
        }
    }

    public boolean isRightTriangle(){
        if (isTriangle()) {
            if ((getLine1() * getLine1() == getLine2() * getLine2() + getLine3() * getLine3()) || (getLine2() * getLine2() == getLine1() * getLine1() + getLine3() * getLine3()) || (getLine3() * getLine3() == getLine1() * getLine1() + getLine2() * getLine2())) {
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    public String toString(){
        /*
        String str;
        if (isRightTriangle()) {
            str="YES";
        }
        else {
            str="NO";
        }

         */
        return "line1: "+getLine1()+
                " line2: "+getLine2()+
                " line3: "+getLine3()+
                " angle1: "+angle1()+
                " angle2: "+angle2()+
                " angle3: "+angle3()+
                " P: "+perimetr()+
                " S: "+area()+
                " isRightTriangle: "+isRightTriangle();
    }

    public int getHypotenuse(){
        if (getLine1()>getLine2() && getLine1()>getLine3()){
            return getLine1();
        }
        if (getLine2()>getLine1() && getLine2()>getLine3()){
            return getLine2();
        }
        if (getLine3()>getLine1() && getLine3()>getLine2()){
            return getLine3();
        }
        return 0;
    }
}