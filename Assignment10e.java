public class Assignment10e {
    public static void main(String[] args) {

        int number = 100;
        double value = 25.5;
        char letter = 'A';
        boolean flag = true;

        Integer intObj = number;
        Double doubleObj = value;
        Character charObj = letter;
        Boolean boolObj = flag;

        System.out.println("Autoboxing Demonstration");
        System.out.println("-----------------------");
        System.out.println("int to Integer: " + intObj);
        System.out.println("double to Double: " + doubleObj);
        System.out.println("char to Character: " + charObj);
        System.out.println("boolean to Boolean: " + boolObj);
    }
}
    