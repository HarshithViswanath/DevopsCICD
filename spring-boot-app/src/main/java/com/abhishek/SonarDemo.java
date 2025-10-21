package com.abhishek;

public class SonarDemo {

    // Unused variable → code smell
    private String unusedField = "unused";

    // Hardcoded password → security hotspot
    private static final String PASSWORD = "admin123";

    public void riskyDivision() {
        try {
            int result = 10 / 0; // will throw exception
        } catch (Exception e) {
            // empty catch → code smell
        }
    }

    public void duplicateMethod1(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public void duplicateMethod2(int x, int y) { // duplicate code → code smell
        int sum = x + y;
        System.out.println(sum);
    }

    public void nullPointerExample(String input) {
        System.out.println(input.length()); // potential NPE → bug
    }
}
