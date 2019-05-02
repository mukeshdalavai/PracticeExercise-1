/*package PE2test;
import PE2.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPalindromeRev {

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        PalindromeRev pr=new PalindromeRev();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        PalindromeRev=null;
    }

    @Test
    public void testpalindromereverse() {
       String queryString = "malayalam";
        assertEquals("testGetBaseQuery(),Retrieval of Base Query failed. BaseQuery contains from the beginning of the query till the where clause",
                "malayalam", pr.palindromereverse(queryString););
    }
}
*/