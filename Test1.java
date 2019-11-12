编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
class Solution {
    public String reverseVowels(String s) {
        if(s.equals("")){
            return "";
        }
       char[] arr=s.toCharArray();
       int l=0;
       int r=s.length()-1;
       while(l<r){
           boolean b1=arr[l]=='a'||arr[l]=='e'||arr[l]=='i'||arr[l]=='o'||arr[l]=='u'||
           arr[l]=='A'||arr[l]=='E'||arr[l]=='I'||arr[l]=='O'||arr[l]=='U';
            boolean b2=arr[r]=='a'||arr[r]=='e'||arr[r]=='i'||arr[r]=='o'||arr[r]=='u'||
           arr[r]=='A'||arr[r]=='E'||arr[r]=='I'||arr[r]=='O'||arr[r]=='U';
           while(l<r&&(!b1)){
               l++;
                 b1=arr[l]=='a'||arr[l]=='e'||arr[l]=='i'||arr[l]=='o'||arr[l]=='u'||
           arr[l]=='A'||arr[l]=='E'||arr[l]=='I'||arr[l]=='O'||arr[l]=='U';
           }
           while(l<r&&(!b2)){
               r--;
               b2=arr[r]=='a'||arr[r]=='e'||arr[r]=='i'||arr[r]=='o'||arr[r]=='u'||
           arr[r]=='A'||arr[r]=='E'||arr[r]=='I'||arr[r]=='O'||arr[r]=='U';
           }
           if(l<r){
               char tmp=arr[l];
               arr[l++]=arr[r];
               arr[r--]=tmp;
           }
       }
       return new String(arr);
    }
}

给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的
位置发生反转。
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int left=0;
        int right=S.length()-1;
        while(left<right){
           boolean b1=((arr[left]>='A'&&arr[left]<='Z')||(arr[left]>='a'&&arr[left]<='z'));
           while(left<right&&!b1){
               left++;
               b1=((arr[left]>='A'&&arr[left]<='Z')||(arr[left]>='a'&&arr[left]<='z'));
           }
        boolean b2=((arr[right]>='A'&&arr[right]<='Z')|| (arr[right]>='a'&&arr[right]<='z'));
            while(left<right&&!b2){
                right--;
                b2=((arr[right]>='A'&&arr[right]<='Z')|| (arr[right]>='a'&&arr[right]<='z'));
            }
            if(left<right){
                char tmp=arr[left];
                arr[left++]=arr[right];
                arr[right--]=tmp;
            }
        }
        return new String(arr);
    }
}

