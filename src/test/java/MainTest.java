import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkIfIsVowel() {

        char ch1 = 'a';
        int sum = 0;

        switch (ch1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                sum++;
                break;
        }
        assertEquals(1,1);
    }

    @Test
    void checkIfIsNotVowel(){

        char ch2 = 'z';
        int sum = 0;

        switch (ch2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                sum ++;
                break;
        }
       assertEquals(0,0);
    }

}
