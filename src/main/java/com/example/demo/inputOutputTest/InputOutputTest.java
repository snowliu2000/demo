package com.example.demo.inputOutputTest;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lsl
 * @version [1.0.0, 2019/6/29,18:05]
 */
public class InputOutputTest {

    public static void main(String[] args) throws IOException {
        String str = "abc";
        InputStream inputStream = IOUtils.toInputStream(str, "utf-8");
        FileOutputStream fileOutputStream = new FileOutputStream(new File("d:/88snow.html"));
        IOUtils.copy(inputStream,fileOutputStream);
        inputStream.close();
        fileOutputStream.close();
    }
}
