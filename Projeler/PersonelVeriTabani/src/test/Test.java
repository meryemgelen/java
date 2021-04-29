package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException {
	Properties ayarlar = new Properties();
	InputStream i = Test.class.getClassLoader().getResourceAsStream("ayarlar.properties");
	ayarlar.load(i);
	System.out.println(ayarlar.get("adi"));
    }

}
