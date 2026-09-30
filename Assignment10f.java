public class Assignment10f {
    public static void main(String[] args) {

        Integer intObj = 100;
        Double doubleObj = 25.5;
        Character charObj = 'A';
        Boolean boolObj = true;

        int number = intObj;
        double value = doubleObj;
        char letter = charObj;
        boolean flag = boolObj;

        System.out.println("Unboxing Demonstration");
        System.out.println("----------------------");
        System.out.println("Integer to int: " + number);
        System.out.println("Double to double: " + value);
        System.out.println("Character to char: " + letter);
        System.out.println("Boolean to boolean: " + flag);
    }
}