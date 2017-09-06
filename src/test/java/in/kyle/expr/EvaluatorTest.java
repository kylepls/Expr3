package in.kyle.expr;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

import in.kyle.api.verify.Verify;

public class EvaluatorTest {
    
    private Evaluator evaluator;
    
    @Before
    public void setup() {
        evaluator = new Evaluator();
    }
    
    @Test
    public void testGetUnknownVariable() {
        Verify.that(() -> evaluator.getVariableValue("q")).throwsException(RuntimeException.class);
    }
    
    @Test
    public void testRegisterInvalidFunction_Param() {
        Verify.that(() -> {
            Method badFunction = EvaluatorTest.class.getDeclaredMethod("badFunction", Object.class);
            evaluator.registerFunction("q", badFunction);
        }).throwsException(IllegalArgumentException.class);
    }
    
    @Test
    public void testRegisterInvalidFunction_Return() {
        Verify.that(() -> {
            Method badFunction = EvaluatorTest.class.getDeclaredMethod("badFunction", double.class);
            evaluator.registerFunction("q", badFunction);
        }).throwsException(IllegalArgumentException.class);
    }
    
    static double badFunction(Object o) {
        return 0;
    }
    
    static Object badFunction(double o) {
        return null;
    }
    
}
