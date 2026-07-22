import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = new char[a.length()];
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>'Z'){
                b[i]=(char)(a.charAt(i)-('a'-'A'));
            }
            else{
                b[i]=(char)(a.charAt(i)+('a'-'A'));
            }
        }
        System.out.println(b);
    }
}