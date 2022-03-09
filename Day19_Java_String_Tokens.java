import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer St = new StringTokenizer (s);
        int n = St.countTokens();
        System.out.println(n);
        for(int i=0;i<n;i++){ 
            System.out.println(St.nextToken());
        }
        scan.close();
    }
}

