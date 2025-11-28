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
    public void testEncryption(){
        
        String result = Encryption.encryption("better computer science");
        assertEquals("t#rsc1#nc# b#tt#r c0mp&",result);
        
    }
    
}
