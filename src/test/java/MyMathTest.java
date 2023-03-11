import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyMathTest {

    @Test
    void MathTest(){
//        fail("Test not implemented yet!");
        MyMath myMath=new MyMath();
        int res=myMath.getSum(new int[]{1,2,3,4});
        System.out.println(res);

        int expected=10;

        assertEquals(expected,res);
    }

    @Test
    void Test1(){
        MyMath myMath=new MyMath();
        int res=myMath.getSum(new int[]{});
        System.out.println(res);

        int expected=0;

        assertEquals(expected,res);
    }
}
