package enums;

import java.lang.reflect.Constructor;

public enum EmptyEnum {
    ;

    public static boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

enum EnumCompletelyEmpty {
    INSTANCE;
    int value;
    EnumCompletelyEmpty() {

    }


    private void setValue(int value) {

    }

    public static void main(String... args) throws Exception {
        EnumCompletelyEmpty singleton = EnumCompletelyEmpty.INSTANCE;
        String str = new String("some");
                Constructor[] constructor = str.getClass().getConstructors();
//                constructor.setAccessible(true);
//        EnumCompletelyEmpty singleton2 = (EnumCompletelyEmpty) constructor.newInstance();
//                if (singleton == singleton2) {
//                    System.out.println("Two objects are same");
//                } else {
//                    System.out.println("Two objects are not same");
//                }
//                singleton.value = 1;
//                singleton2.value = 2;
//                System.out.println(singleton.value);
//                System.out.println(singleton2.value);
            }
        }



class Test {
    public static void main(String[] args) {
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(1.0 / 0.0);
    }
}

