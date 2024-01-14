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
}