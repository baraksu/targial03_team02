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
        int len1 = str.length();
        String str1 = str.replace(" ","");
        int len2 = str1.length();
        int words = len1 - len2 + 1;
        if (words>3){
            System.out.println    

        }
    
        String word1 = "";
        String word2 = "";
        String word3 = "";
    public static String encryption(String str){
            
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

        str = str.replace('&','u');
        str = str.replace('@','a');
        str = str.replace('#','e');
        str = str.replace('1','i');
        str = str.replace('0','o');

        String movement = str.substring(0, words);
        str = str.substring(str.length() - words);
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
    }

}
