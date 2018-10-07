package com.learn.Non_Spring_Works;




import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


/**
 * @author vdokku
 */
public class Dirver {


    private static Loopable loop;

    public static void main(String[] args) throws Exception {
        while (true) {
            Thread.sleep(1000);
            compile();
            load();
            loop.call();
        }
    }

    private static void load() throws Exception {
        DynamicClassLoader dcl = new DynamicClassLoader(
                "target/classes",
                "com.learn.Non_Spring_Works.impl");
        Class clazz = dcl.loadClass("com.learn.Non_Spring_Works.impl.Loop");
        loop = (Loopable) clazz.getDeclaredConstructor().newInstance();
    }

    private static void compile() {
        // Create loop object by compiling at runtime.
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, System.out, System.err, "-d", "target/classes",
                "src/main/java/com/learn/Non_Spring_Works/Loopable.java",
                "src/main/java/com/learn/Non_Spring_Works/impl/Loop.java");
    }
}
