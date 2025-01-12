package org.example;

import java.util.function.Function;

public class TestFunctionCallback {
    static <Arg ,Return>Return applyFunction(Arg arg, Function<Arg, Return> function) {
        return function.apply(arg);
    }
}
