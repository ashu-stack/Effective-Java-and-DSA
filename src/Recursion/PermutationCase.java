package Recursion;

public class PermutationCase {

    public static void main(String[] args) {
        String s = "ab";
        solve("", s);
    }

    private static void solve(String op, String ip) {
        if(ip.isEmpty()){
            System.out.println(op.toString());
            return;
        }
        Character ch = ip.charAt(0);
        solve(op + ch, ip.substring(1));
        solve(op + Character.toUpperCase(ch), ip.substring(1) );
        return;
    }
}
