import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//Test Class inside test folder
public class MyMathTest {

    List<String> todos= Arrays.asList("AWS", "Amazon", "GCP", "Others");

    @BeforeEach
    void beforeEach(){
        System.out.println("Execute before each test case");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Execute Before All at the very beginning");
    }


    @AfterEach
    void afterEach(){
        System.out.println("Execute after each test case");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Execute After All at the very beginning");
    }





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
