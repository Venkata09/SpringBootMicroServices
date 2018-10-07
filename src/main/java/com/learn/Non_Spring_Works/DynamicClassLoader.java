package com.learn.Non_Spring_Works;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * @author vdokku
 */
public class DynamicClassLoader extends ClassLoader {

    private String packageName;
    private String root;

    public DynamicClassLoader(String root, String packageName) {
        this.packageName = packageName;
        this.root = root;
    }

    @Override
    public Class<?> loadClass(String name) {
        Class clazz;
        if (!name.startsWith(packageName)) {
            // Load system classes.
            try {
                clazz = findSystemClass(name);
            } catch (ClassNotFoundException e) {
                throw new IllegalArgumentException("System class not found: " + name);
            }
        } else {
            // Load dynamic classes.
            String filename = name.replace('.', File.separatorChar) + ".class";
            byte[] bytecode = load(filename);
            clazz = defineClass(name, bytecode, 0, bytecode.length);
            if (clazz == null) {
                throw new IllegalArgumentException("Class not found: " + name);
            }
        }

        return clazz;
    }

    private byte[] load(String filename) {
        File f = new File(root, filename);
        long size = f.length();
        byte buffer[] = new byte[(int) size];

        try (FileInputStream fis = new FileInputStream(f)) {
            DataInputStream dis = new DataInputStream(fis);
            dis.readFully(buffer);
            dis.close();
        } catch (IOException e) {
            throw new IllegalArgumentException("File not found: " + filename);
        }

        return buffer;
    }
}
