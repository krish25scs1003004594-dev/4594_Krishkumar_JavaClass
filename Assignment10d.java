public class Assignment10d {
    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
        float floatValue = 50.5f;
        double doubleValue = 60.5;
        char charValue = 'A';
        boolean booleanValue = true;

        Byte byteWrapper = byteValue;
        Short shortWrapper = shortValue;
        Integer intWrapper = intValue;
        Long longWrapper = longValue;
        Float floatWrapper = floatValue;
        Double doubleWrapper = doubleValue;
        Character charWrapper = charValue;
        Boolean booleanWrapper = booleanValue;

        System.out.println("Primitive and Wrapper Variables");
        System.out.println("--------------------------------");

        System.out.println("byte      : " + byteValue + " -> " + byteWrapper);
        System.out.println("short     : " + shortValue + " -> " + shortWrapper);
        System.out.println("int       : " + intValue + " -> " + intWrapper);
        System.out.println("long      : " + longValue + " -> " + longWrapper);
        System.out.println("float     : " + floatValue + " -> " + floatWrapper);
        System.out.println("double    : " + doubleValue + " -> " + doubleWrapper);
        System.out.println("char      : " + charValue + " -> " + charWrapper);
        System.out.println("boolean   : " + booleanValue + " -> " + booleanWrapper);
    }
}

