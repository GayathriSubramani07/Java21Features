/* Java 21 — Preview Feature Example: Unnamed Class & main()
----------------------------------------------------------
 Introduced in: Java 21 (Preview Feature)
 Enables writing Java programs without a class definition
 To compile and run, preview features must be enabled.
Commands to Use:

1️⃣ Compile (optional, only needed if you want .class file):
    javac --enable-preview --release 21 Demo.java

2️⃣ Run compiled class:
    java --enable-preview Demo

3️⃣ OR run directly without compiling (recommended for learning):
    java --enable-preview --source 21 Demo.java

💡 Notes:
- The --enable-preview flag turns ON preview features.
- The --release 21 or --source 21 tells Java to use Java 21 syntax.
----------------------------------------------------------
*/

void main() {
    System.out.println("Hello from Java 21 Preview!");
}


// PS E:\Vs workspace> javac Demo.java
// Demo.java:1: error: unnamed classes are a preview feature and are disabled by default.
// void main(){
// ^
//   (use --enable-preview to enable unnamed classes)
// 1 error
// PS E:\Vs workspace> javac --enable-preview --release 21 Demo.java
// >> 
// Note: Demo.java uses preview features of Java SE 21.
// Note: Recompile with -Xlint:preview for details.
// PS E:\Vs workspace> java --enable-preview Demo
// >>
// Hello
