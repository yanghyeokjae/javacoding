package exam_operation;

public class IncreaseDecreaseOperatorExample {
    static void main(String[] args){

        int x=10, y=10, z;
        System.out.println("---------------------");
        x++; // x-> 10 ++->11
        ++x; // ++->12 x->12
        System.out.println("x= " + x); //x->12

        System.out.println("---------------------");
        y--; // y-> 10 --->9
        --y; // --->8 y->8
        System.out.println("y= " + y); //y->8

        System.out.println("---------------------");
        z= x++; // x->12 z->12 ++->12
        System.out.println("z= " + z); //z->12
        System.out.println("x= " + x); //x->13

        System.out.println("---------------------");
        z= ++x + y++; // ++->14 x->14 +y->22 z->22
        System.out.println("z= " + z); //z-> 22
        System.out.println("x= " + x); //x-> 14
        System.out.println("y= " + y); //y-> 9

    }
}
