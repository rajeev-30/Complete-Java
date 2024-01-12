package METHODS;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Rajeev";
        System.out.println("Name: "+name);

        int value = name.length();
        System.out.println("Length: "+value);

        String lstring = name.toLowerCase();
        System.out.println("LowerCase: "+lstring);

        String ustring = name.toUpperCase();
        System.out.println("UpperCase: "+ustring);

        String nonTrimmed = "    Rajeev     ";
        System.out.println("NonTrimmed: "+nonTrimmed);
        System.out.println("Trimmed: "+nonTrimmed.trim());

        System.out.println("SubString: "+name.substring(2,5));      //"2" is Start Index, and "5" is End Index;

        System.out.println("Replace: "+name.replace("ee", "33"));   //"e" target, "3" is replacement;

        System.out.println("StartWith: "+name.startsWith("Ra"));

        System.out.println("EndsWith: "+name.endsWith("Ra"));

        System.out.println("Value of index no.2 is: " +name.charAt(2));

        System.out.println("Index no. of 'a' is: " +name.indexOf("a"));

        System.out.println("IgnoreCase: "+name.equalsIgnoreCase("rAjEev"));
    }
    
}
