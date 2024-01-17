package Klausur_12_07_2021.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XYZ_Test {

    private XYZ xyz;

    private List<String> erwartet;
    List<String> resultFromM;
    int lengthOfResultFromM;

    @BeforeEach
    void setUp() {
        xyz = new XYZ();
        erwartet = List.of("viel", "Erfolg", "Ich", "Ihnen");
        resultFromM = xyz.m("Ich wünsche Ihnen viel Erfolg");
        lengthOfResultFromM = resultFromM.size();
    }

    @Test
    void testM() {
        assertEquals(lengthOfResultFromM, 4);
        assertEquals(erwartet, resultFromM);
    }

}
