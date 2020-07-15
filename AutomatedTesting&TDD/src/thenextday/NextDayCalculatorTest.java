package thenextday;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing")
    void checkNextDay112018(){
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing")
    void checkNextDay3112018(){
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing")
    void checkNextDay3042018(){
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing")
    void checkNextDay2822018(){
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing")
    void checkNextDay2922020(){
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing")
    void checkNextDay(){
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.findNextDay( day, month,year);
        assertEquals(expected,result);
    }
}