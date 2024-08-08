import main.UmsDt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UmsDtTest {

    @Test
    void isValidDt(){
        String dt = "20240931";
        UmsDt umsDt = new UmsDt();
        assertEquals(false, umsDt.isValidDt(dt));
    }

}