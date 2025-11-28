/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
    public static void main(String[] args){
        
        System.out.println("Welcome to the Encryption / Decryption Program");
        
    }
    public static String encryption(String str){
        int len1 = str.length();
        String str1 = str.replace(" ","");
        int len2 = str1.length();
        int words = len1 - len2 + 1;
        String word1 = "";
        String word2 = "";
        String word3 = "";
        if(words == 1){
            str = str;
        }
        else if(words == 2){
            word1 = str.substring(0,str.indexOf(" "));
            word2 = str.substring(str.indexOf(" ")+1);
            str = word2 + " " + word2;
        }
        else if(words == 3){
            word1 = str.substring(0,str.indexOf(" "));
            word2 = str.substring(str.indexOf(" ")+1 , str.lastIndexOf(" "));
            word3 = str.substring(str.lastIndexOf(" ")+1);
            str = word3 + " " + word1 + " " + word2;
        }
        String move = str.substring(str.length() - words);
        str = str.substring(0,str.length() - words);
        str = move + str;
        str = str.replace('u','&');
        str = str.replace('a','@');
        str = str.replace('e','#');
        str = str.replace('i','1');
        str = str.replace('o','0');
        return str;
    }
}
