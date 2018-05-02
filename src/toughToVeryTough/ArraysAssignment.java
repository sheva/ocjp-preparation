package toughToVeryTough;

public class ArraysAssignment {

    public static final void main(String [] args) {
        int [] a = {1,2,3,4};
        int [] b = {4,3,2,1};

        System.out.println( a [ (a=b)[3] ] );       /// ---> prints 2
    }


}
