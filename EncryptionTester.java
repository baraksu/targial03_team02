import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
    @Test
    public void testEncryption1(){
        
        String result = Encryption.encryption("better computer science");
        assertEquals("t#rsc1#nc# b#tt#r c0mp&",result);
        
    }
    @Test
    public void testEncryption2(){
        
        String result = Encryption.encryption("buga buga buga");
        assertEquals("&g@b&g@ b&g@ b",result);
        
    }
    @Test
    public void testEncryption3(){
        
        String result = Encryption.encryption("shimi bigi zili");
        assertEquals("1g1z1l1 sh1m1 b",result);
        
    }
    @Test
    public void testEncryption4(){
        
        String result = Encryption.encryption("yonatan klein");
        assertEquals("@nkl#1n y0n@t",result);
        
    }
    @Test
    public void testEncryption5(){
        
        String result = Encryption.encryption("lionel");
        assertEquals("ll10n#",result);
        
    }
    @Test
    public void decription1(){
        
        String result = Encryption.decription("ll10n#");
        assertEquals("lionel",result);
        
    }
    @Test
    public void decription2(){
        
        String result = Encryption.decription("@nkl#1n y0n@t");
        assertEquals("yonatan klein",result);
        
    }
    @Test
    public void decription3(){
        
        String result = Encryption.decription("1g1z1l1 sh1m1 b");
        assertEquals("shimi bigi zili",result);
        
    }
    @Test
    public void decription4(){
        
        String result = Encryption.decription("t#rsc1#nc# b#tt#r c0mp&");
        assertEquals("better computer science",result);
        
    }
    @Test
    public void decription5(){
        
        String result = Encryption.decription("&g@b&g@ b&g@ b");
        assertEquals("buga buga buga",result);
        
    }
    @Test
    public void wordNum1(){
        
        int result = Encryption.wordNum("bugi bobm");
        assertEquals(2,result);
        
    }
    @Test
    public void wordNum2(){
        
        int result = Encryption.wordNum("shuki the king");
        assertEquals(3,result);
        
    }
    @Test
    public void wordNum3(){
        
        int result = Encryption.wordNum("malo big");
        assertEquals(2,result);
        
    }
    @Test
    public void wordNum4(){
        
        int result = Encryption.wordNum("nadai");
        assertEquals(1,result);
        
    }
    @Test
    public void wordNum5(){
        
        int result = Encryption.wordNum("bili mikio");
        assertEquals(2,result);
        
    }
    
}
