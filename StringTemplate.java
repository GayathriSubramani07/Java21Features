/*

 Java 21 — String Templates (Preview Feature)
----------------------------------------------------------
 Introduced in: Java 21 (Preview)
Enables embedding expressions directly inside strings.
Run this file using:
    java --enable-preview --source 21 StringTemplateDemo.java

*/

public class StringTemplateDemo {

    // Before Java 21 - Old String concatenation
    public static void beforeJava21(String name, int mark1, int mark2) {
        int total = mark1 + mark2;
        String report = "Student: " + name + 
                        "\nTotal Marks: " + total + 
                        "\nAverage: " + (total / 2.0);
        System.out.println(report);
    }

    //Java 21 Version - Using String Templates (Preview)
    public static void java21Version(String name, int mark1, int mark2) {
        int total = mark1 + mark2;

        // ✅ Works in Java 21 (STR only)
        String strReport = STR."Student: \{name}  Total Marks: \{total}  Average: \{total / 2.0}";

        System.out.println("---- STR Output ----");
        System.out.println(strReport);

        /*
          The below FMT and RAW examples are available only in Java 22+ Preview,
            so keep them commented if using JDK 21.
        
        String fmtReport = FMT."""
            Student: %s
            Total Marks: %d
            Average: %.2f
        """.formatted(name, total, total / 2.0);

        String rawReport = RAW."""
            Student: \{name}
            Total Marks: \{total}
            Average: \{total / 2.0}
        """;
        */
    }

    public static void main(String[] args) {
        System.out.println("---- Before Java 21 ----");
        beforeJava21("Gayathri", 80, 90);

        System.out.println("---- Java 21 (Preview Feature) ----");
        java21Version("Gayathri", 80, 90);
    }
}
