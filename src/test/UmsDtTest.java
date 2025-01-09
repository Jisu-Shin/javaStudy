import main.ums.UmsDt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UmsDtTest {

    @Test
    void 날짜검증_없음(){
        String dt = "202409311722";
        UmsDt umsDt = new UmsDt(dt);
        assertEquals(false, umsDt.isValidDt(dt)); 
    }

    @Test
    void 날짜검증_있음(){
        String dt = "202410031722";
        UmsDt umsDt = new UmsDt(dt);
        assertEquals(true, umsDt.isValidDt(dt));
    }

}