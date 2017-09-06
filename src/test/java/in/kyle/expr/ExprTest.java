package in.kyle.expr;

import org.junit.Before;
import org.junit.Test;

import in.kyle.api.verify.Verify;

public class ExprTest {
    
    private Expr expr;
    
    @Before
    public void setup() {
        expr = new Expr();
    }
    
    @Test
    public void testNoImpl() {
        Verify.that(() -> expr.eval("q(1)")).throwsException(RuntimeException.class);
    }
    
    @Test
    public void testFunctionException() throws NoSuchMethodException {
        expr.registerFunction(ExprTest.class.getDeclaredMethod("bad"));
        Verify.that(() -> expr.eval("bad()")).throwsException(RuntimeException.class);
    }
    
    static double bad() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
