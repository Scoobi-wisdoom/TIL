package workshop5;
 
public class Test06 {
    
    public static void main(String args[]) {
        String str = "LGcns";
        String upper = "";
        String lower = "";
        
        for(int i=0; i< str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                upper += str.charAt(i);
            }
            if(Character.isLowerCase(str.charAt(i))) {
                lower += str.charAt(i);
            }
        }
        
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(upper);
        System.out.println(lower);
        
    }
 
}