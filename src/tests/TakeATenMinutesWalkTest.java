package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.TakeATenMinutesWalk;

import static org.junit.jupiter.api.Assertions.*;

class TakeATenMinutesWalkTest {

    @Test
    void isValid() {
        char[] inputOne = {'n', 'n', 'w', 'w', 'n', 's', 'e', 'e', 's', 's'};
        char[] inputTwo = {'n', 'n', 'w', 'w', 's', 's', 'e', 'e', 's', 's'};

        TakeATenMinutesWalk tenMinutesWalk = new TakeATenMinutesWalk();
        boolean actualOutputOne = tenMinutesWalk.isValid(inputOne);
        boolean actualOutputTwo = tenMinutesWalk.isValid(inputTwo);

        Assertions.assertTrue(actualOutputOne);
        Assertions.assertFalse(actualOutputTwo);
    }
}