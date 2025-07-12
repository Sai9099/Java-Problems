public class InsertString {
    public static void main(String[] args) {
        String A = "Hello World!";
        String toString = "Java ";
        int position = 6; 

        
        StringBuilder sb = new StringBuilder(A);
        sb.insert(position, toString);

        
        System.out.println("Original String: " + A);
        System.out.println("Modified String: " + sb.toString());

    }
}
