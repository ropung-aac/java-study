package com.example.javastudy.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

public class AvailableCharsetsMain {

  public static void main(String[] args) {
    SortedMap<String, Charset> charsets = Charset.availableCharsets();
    for (String charsetName : charsets.keySet()) {
      System.out.println("Charset Name: " + charsetName);

//      System.out.println("Charset: " + charset);
//      System.out.println("Aliases: " + charset.aliases());

    }
    System.out.println("======");
    Charset charset1 = Charset.forName("MS949");
    System.out.println(charset1);
    Charset charset2 = Charset.forName("UTF-8");
    System.out.println(charset2);

    Charset utf8 = StandardCharsets.UTF_8;
    System.out.println("utf8 = " + utf8);

    // 시스템의 기본 Charset 조회
    Charset defaultCharset = Charset.defaultCharset();
    System.out.println("defaultCharset = " + defaultCharset);
  }

}
