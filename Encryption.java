import java.util.Scanner;
public class Encryption
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");
        int choose = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter up to 3 words sentence");
        String str = scanner.nextLine();
        int words = wordNum(str);
        if(choose == 1){
            str = encryption(str);
            System.out.println("The encrypted sentence: "+str);
        }
        else if(choose == 2){
            str = decription(str);
            System.out.println("The decrypted sentence: "+str);
        }
        else{
            System.out.println(choose+" is not a valid choice");}
        if (words > 3){
            System.out.println("Error - there are more than 3 words");
        }
        
    }
    public static String encryption(String str){
        String word1 = "";
        String word2 = "";
        String word3 = ""; 
        int words = wordNum(str);
        if(words == 1){
            str = str;
        }
        else if(words == 2){
            word1 = str.substring(0,str.indexOf(" "));
            word2 = str.substring(str.indexOf(" ")+1);
            str = word2 + " " + word1;
        }
        else if(words == 3){
            word1 = str.substring(0,str.indexOf(" "));
            word2 = str.substring(str.indexOf(" ")+1 , str.lastIndexOf(" "));
            word3 = str.substring(str.lastIndexOf(" ")+1);
            str = word3 + " " + word1 + " " + word2;
        }
        String movement = str.substring(str.length() - words);
        str = str.substring(0,str.length() - words);
        str = movement + str;
        str = str.replace('u','&');
        str = str.replace('a','@');
        str = str.replace('e','#');
        str = str.replace('i','1');
        str = str.replace('o','0');
        return str;
    }
    public static String decription(String str){
        String word1 = "";
        String word2 = "";
        String word3 = "";
        int words = wordNum(str);
        str = str.replace('&','u');
        str = str.replace('@','a');
        str = str.replace('#','e');
        str = str.replace('1','i');
        str = str.replace('0','o');

        String movement = str.substring(0, words);
        str = str.substring(words);
        str = str+movement;

        if(words == 1){
            str = str;
        }
        else if(words == 2){
            word2 = str.substring(0,str.indexOf(" "));
            word1 = str.substring(str.indexOf(" ")+1);
            str = word1 + " " + word2;
        }
        else if(words == 3){
            word3 = str.substring(0,str.indexOf(" "));
            word1 = str.substring(str.indexOf(" ")+1 , str.lastIndexOf(" "));
            word2 = str.substring(str.lastIndexOf(" ")+1);
            str = word1 + " " + word2 + " " + word3;
        }
        return str;
    }
    
        public static int wordNum(String str){
        int len1 = str.length();
        String str1 = str.replace(" ","");
        int len2 = str1.length();
        int words = len1 - len2 + 1;
        return words;
    }
}
