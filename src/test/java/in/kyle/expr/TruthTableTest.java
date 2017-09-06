package in.kyle.expr;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import in.kyle.api.verify.Verify;
import lombok.Data;

/**
 * Created by Kyle on 6/1/2017.
 */
@RunWith(Parameterized.class)
@Data
public class TruthTableTest {
    
    private final String subject;
    private final String equation;
    private final double result;
    
    private Expr expr;
    
    @Before
    public void setUp() throws Exception {
        expr = new Expr();
    }
    
    @Test
    public void test() {
        System.out.println("Equation: " + equation);
        double value = expr.eval(equation);
        Verify.that(value).isEqual(result);
    }
    
    @Parameterized.Parameters(name = "{0}-{index}-[{1}]")
    public static Collection<Object[]> data() throws FileNotFoundException {
        Collection<String> resources = ResourceList.getResources(Pattern.compile(".*\\.exp"));
        List<Object[]> tests = new ArrayList<>();
        for (String resource : resources) {
            tests.addAll(getTests(resource));
        }
        return tests;
    }
    
    private static Collection<Object[]> getTests(String resource) throws FileNotFoundException {
        System.out.println("Get test: " + resource);
        List<Object[]> tests = new ArrayList<>();
        File file = new File(resource);
        String subject = file.getName().substring(0, file.getName().indexOf("."));
        InputStream in = new FileInputStream(resource);
        Scanner scanner = new Scanner(in);
        while (scanner.hasNextLine()) {
            String expression = scanner.nextLine();
            if (expression.startsWith("#") || expression.isEmpty()) {
                continue;
            }
            System.out.println("Line " + expression);
            Verify.that(expression).contains("=");
            int index = expression.lastIndexOf("=");
            String eval = expression.substring(0, index);
            String result = expression.substring(index + 1);
            tests.add(new Object[]{subject, eval, Double.parseDouble(result)});
        }
        return tests;
    }
}
