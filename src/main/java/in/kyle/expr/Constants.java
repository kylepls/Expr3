package in.kyle.expr;

import lombok.Getter;

public enum Constants {
    
    PI(Math.PI, "pi", "π"),
    E(Math.E, "e");
    
    @Getter
    private final double value;
    @Getter
    private final String[] names;
    
    Constants(double value, String... names) {
        this.value = value;
        this.names = names;
    }
}
