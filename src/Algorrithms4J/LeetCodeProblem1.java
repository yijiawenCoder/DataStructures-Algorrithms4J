package Algorrithms4J;

public class LeetCodeProblem1 {
    public static void main(String[] args) {


    }
    public int strStr(String haystack, String needle) {
        char[] stack = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for(int i = 0;i<=stack.length;i++){


                int j = 0;
                while(j<need.length&&stack[i]==need[0]){
                    j++;
                    i++;


                }
                if(j==need.length){
                    return i;
                }




        }

  return  -1;
    }

}
