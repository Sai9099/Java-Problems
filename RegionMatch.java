public class RegionMatch{
    public static void main(String[] args) {
        String str1 = "hello java";
        String str2 = "welcome to java";

        
        int start1 = 6;  
        int start2 = 11; 
        int length = 4;  

       
        boolean match = str1.regionMatches(start1, str2, start2, length);

        
        System.out.println("Do the regions match? " + match);
    }
}
