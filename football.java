import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.contains("1111111")||str.contains("0000000"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
