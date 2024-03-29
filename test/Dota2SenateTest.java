import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Dota2SenateTest {

    Dota2Senate dota2Senate;

    @Before
    public void setup(){
        dota2Senate = new Dota2Senate();
    }

    @Test
    public void predictPartyVictory_SingleParty_PartyWinsAutomatically(){
        String voting = "R";

        String actual = dota2Senate.predictPartyVictory(voting);

        assertEquals("Radiant", actual);
    }

    @Test
    public void predictPartyVictory_SinglePartyMultipleVotes_PartyWinsAutomatically(){
        String voting = "RRRRRR";

        String actual = dota2Senate.predictPartyVictory(voting);

        assertEquals("Radiant", actual);
    }

    @Test
    public void predictPartyVictory_AlternateEvenVotes_FirstPartyWinsAutomatically(){
        String voting = "RDRDRD";

        String actual = dota2Senate.predictPartyVictory(voting);

        assertEquals("Radiant", actual);
    }

    @Test
    public void predictPartyVictory_ComplexVotes_TheCorrectPartyWins(){
        String voting = "RRDDDD";

        String actual = dota2Senate.predictPartyVictory(voting);

        assertEquals("Dire", actual);
    }

    @Test
    public void predictPartyVictory_AnotherComplexVotes_TheCorrectPartyWins(){
        String voting = "RRDDD";

        String actual = dota2Senate.predictPartyVictory(voting);

        assertEquals("Radiant", actual);
    }
}