package BASICS;

public class String_method {
    public static void main(String[] args) {
        String  s = "Rajeev Kushwaha" ;
        System.out.println("String: " +s);
        System.out.println("String Length: " +s.length());
        System.out.println("Upper case: " +s.toUpperCase());
        System.out.println("Lower Case: " +s.toLowerCase());
        System.out.println("Is String cointains - Kush - : " +s.contains("Kush"));
        System.out.println("Value of index no.2 is: " +s.charAt(2));
        System.out.println("Is String end with 'ha': " +s.endsWith("ha"));
        System.out.println("Index no. of 'j' is: " +s.indexOf("j"));
    }
    
}
