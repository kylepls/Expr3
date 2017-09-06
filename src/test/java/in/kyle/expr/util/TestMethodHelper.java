package in.kyle.expr.util;

import org.junit.Test;

import in.kyle.api.verify.Verify;

public class TestMethodHelper {
    
    @Test
    public void testUtilityClass() {
        Verify.that(MethodHelper.class).isUtilityClass();
    }
    
    @Test
    public void testNoMethod() {
        Verify.that(() -> MethodHelper.getMethod(TestMethodHelper.class, "asd"))
              .throwsException(RuntimeException.class)
              .causeIs(NoSuchMethodException.class);
    }
}
