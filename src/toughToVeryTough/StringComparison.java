package toughToVeryTough;

public class StringComparison {

    public static void main(String[] args) {
        System.out.println("hello world".equals("hello world"));     // true
        System.out.println("Hello world".equalsIgnoreCase("hello world"));   // true
        System.out.println("hello ".concat("world").trim().equals("hello world"));   // true
        System.out.println("hello ".concat(" world").trim().equals("hello world"));  // false
        System.out.println("hello world".compareTo("Hello world") < 0);              // false (compareTo compares Unicodes of characters: unicode of lower letter on 32 bigger then upper case level)
        System.out.println("Hello world".toLowerCase().equals("hello world"));       // true
        testEquals();
    }

    public static void testEquals() {
        String str = "good";
        char[] strChar = {'g','o', 'o', 'd'};

        String newStr = "";
        for (char c : strChar) {
            newStr += c;
        }

        System.out.println("Comparison by references: " + (newStr == str));
        System.out.println("Comparison by equity: " + (newStr.equals(str)));

//        System.out.println(new StringBuilder(str).reverse());
    }
}
