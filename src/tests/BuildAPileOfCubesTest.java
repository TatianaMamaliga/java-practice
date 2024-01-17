package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.BuildAPileOfCubes;

import static org.junit.jupiter.api.Assertions.*;

class BuildAPileOfCubesTest {

    @Test
    void findNb() {
        BuildAPileOfCubes buildAPileOfCubes = new BuildAPileOfCubes();
        Assertions.assertEquals(2, buildAPileOfCubes.findNb(9));
        Assertions.assertEquals(-1, buildAPileOfCubes.findNb(11));
    }
}