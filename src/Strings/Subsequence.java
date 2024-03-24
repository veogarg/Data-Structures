package Strings;

public class Subsequence {
    public static void main(String []args){
        String s1 = "geeksforgeeks";
        String s2 = "grges";

        int i =0, j=0;
        int s1len = s1.length();
        int s2len = s2.length();

        while(i<s1len && j<s2len){
            if(s2.charAt(j) == s1.charAt(i)){
                j++;
                i++;
            }else {
                i++;
            }
        }
        System.out.println(j==s2len);
    }
}
