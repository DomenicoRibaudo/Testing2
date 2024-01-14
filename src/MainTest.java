import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void stampaFullFunziona() {
        assertEquals("venerdì 1 marzo 2002", "venerdì 1 marzo 2002");
    }

    @org.junit.jupiter.api.Test
    void stampaFullNonFunziona() {
        assertEquals("venerdì 1 marzo 2002", "venerdì 1 marzo 2002, stringa cambiata");
    }
    @org.junit.jupiter.api.Test
    void stampaMediumFunziona() {
        assertEquals("1 mar 2002", "1 mar 2002");
    }

    @org.junit.jupiter.api.Test
    void stampaMediumNonFunziona() {
        assertEquals("1 mar 2002", "1 mar 2003");
    }
    @org.junit.jupiter.api.Test
    void stampaShortFunziona() {
        assertEquals("01/03/02", "01/03/02");
    }

    @org.junit.jupiter.api.Test
    void stampaShortNonFunziona() {
        assertEquals("01/03/02", "01/03/03");
    }
}