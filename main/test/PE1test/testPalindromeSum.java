package PE1test;
import com.stackroute.PE1.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testPalindromeSum {
    PalindromeSum ps=new PalindromeSum();
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
    }

    @Test
    public void testPalindromeSum() {
        String queryString = "select winner,team1,team2 from ipl.csv where season > 2014";
        ps.inarray(454);
        assertTrue("tjnjd",ps.ispalindrome());
    }

}
