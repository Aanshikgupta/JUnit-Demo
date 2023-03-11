import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//Test Class inside test folder
public class MyMathTest {

    List<String> todos= Arrays.asList("AWS", "Amazon", "GCP", "Others");

    //Annotation important for test
    @Test
    void calculateSum_FourMemberArray(){
//        fail("Test not implemented yet!");
        MyMath myMath=new MyMath();
        int res=myMath.getSum(new int[]{1,2,3,4});
        System.out.println(res);
        int expected=10;

        //check if the condition satisfies
        assertEquals(expected,res);
    }

    //many test for same case
    @Test
    void calculateSum_ZeroMemberArray(){
        MyMath myMath=new MyMath();
        int res=myMath.getSum(new int[]{});
        System.out.println(res);
        int expected=0;
        assertEquals(expected,res);
    }

    @Test
    void todosTest(){
        assertEquals(true,todos.contains("AWS"));
        assertTrue(todos.contains("AWS"), "Error Message if false");
    }
}
