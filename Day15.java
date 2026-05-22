public class Day15 {
    public static void main(String[] args) {
       String s="HellO world";
      System.out.println(System.identityHashCode(s));

      System.out.println(s.length());


      System.out.println(s.charAt(0)); //H

      //to lower case 
      System.out.println(s.toLowerCase());

      //to upper case
      System.out.println(s.toUpperCase());

      String s1="hello world";
     String s2="Hello world";
     System.out.println(s1==s2); //true because of string pool

        String s3=new String("Hello world");
        String s4=new String("Hello world");
        System.out.println(s3==s4); //false because of heap memory

        System.out.println(s1.equals(s2)); //false because of content
        System.out.println(s3.equals(s4)); //true because of content    
        System.out.println(s1.equals(s3)); //false because of content


        //concate 
        String full=s1+" "+s2;
        System.out.println(full);

        //substirng 
        System.out.println(s1.substring(0,5)); //hello

        //contains
        System.out.println(s1.contains("world")); //true
        System.out.println(s1.contains("WORLD")); //false

        //replace 
        System.out.println(s1.replace("world", "java")); //hello java
        System.out.println(s1.replace("w","T"));

        //trim spaces
        String s5="   Hello world   ";
        System.out.println(s5.trim()); //Hello world

        //split
        String s7="Hello world java & programming";
        // String[] s6=s2.split(" ");
String[] s8 = s7.split(" &" );
for(String i:s8){
    System.out.print(i);

}

        // for(String i:s6){
        //     System.out.println(i);
        // }


        // for(int i=0;i<s1.length();i++){
        //     System.out.println(s1.charAt(i));
        // }


        //index
        // s7[0]='H'; //error because string is immutable
        // System.out.println(s7);

        System.out.println();
        char[] str =s2.toCharArray();
        System.out.println(str[7]); //o

        //index of
        System.out.println(s2.indexOf("o")); //4
        System.out.println(s2.indexOf("w")); //7


        



    }
    
}
 