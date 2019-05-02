package PE1test;
import com.stackroute.PE1.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testNumPattern {
    NumPattern np=new NumPattern();
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
    public void testpattern() {
        int a[]={1,2,2,3,3,3,4,4,4,4};
        assertArrayEquals("Refacot the code",a,np.pattern(4));
    }

}

