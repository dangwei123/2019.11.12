给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
num1 和num2 的长度都小于 5100.
num1 和num2 都只包含数字 0-9.
num1 和num2 都不包含任何前导零。
你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-strings
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public String addStrings(String num1, String num2) {
        String s="";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry!=0){
            int c1=(i>=0?num1.charAt(i)-'0':0);
            int c2=(j>=0?num2.charAt(j)-'0':0);
            int c3=c1+c2+carry;
                carry=c3/10;
                s=(c3%10)+s;
          i--;
          j--;
        }
        return s;
    }
}

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。
class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char c1=s.charAt(left);
            char c2=s.charAt(right);
            boolean b1=(c1>='A'&&c1<='Z')||(c1>='a'&&c1<='z');
            boolean b2=(c2>='A'&&c2<='Z')||(c2>='a'&&c2<='z');
            boolean b3=(c1>='0'&&c1<='9');
            boolean b4=(c2>='0'&&c2<='9');
            if((b1&&b2)||(b3&&b4)){
                boolean b5=((int)Math.abs((int)c1-(int)c2))==32;
                boolean b6=((int)Math.abs((int)c1-(int)c2))==0;
                if(b6||b5){
                    left++;
                    right--;
                    continue;
                }else{
                    return false;
                }
            }
            if((b1&&b4)||(b2&&b3)){
                return false;
            }
            if((!b1)&&(!b3)){
                left++;
            }if((!b2)&&(!b4)){
                right--;
            }         
          
        }
        return true;
    }
}

给定一组字符，使用原地算法将其压缩。压缩后的长度必须始终小于或等于原数组长度。
数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
在完成原地修改输入数组后，返回数组的新长度。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/string-compression
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int compress(char[] chars) {
        int count=0;
        int l=0;
       for(int r=0;r<=chars.length;r++){
           if(r==chars.length||chars[r]!=chars[l]){
               chars[count++]=chars[l];
           if(r-l>1){
               for(char c:String.valueOf(r-l).toCharArray()){
                   chars[count++]=c;
               }
           }
           l=r;
           }
       }
       return count;
    }
}
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
class Solution {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){

            if(arr[i]==' '||i==s.length()-1){
                if(i!=s.length()-1){
                     r=i-1;
                }else{
                    r=i;
                }
               
                while(l<r){
                    char tmp=arr[l];
                   arr[l++]=arr[r];
                   arr[r--]=tmp;
                }
                l=i+1;
            }
        }
        return new String(arr);
    }
}
