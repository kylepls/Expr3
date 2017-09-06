package in.kyle.expr.functions;

import org.junit.Test;

import in.kyle.api.verify.Verify;

public class BasicFunctionsTest {
    @Test
    public void testUtilityClass() {
        Verify.that(BasicFunctions.class).isUtilityClass();
    }
}
