package org.example.templatemethod.beveragetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserInputUtil {
  public static String getUserInput(String message) {
    String answer = null;
    System.out.print(message + " (y/n)? ");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    try {
      answer = input.readLine();
    } catch (IOException e) {
      System.err.println("IO error trying to read your answer");
    }

    if (answer == null) {
      return "n";
    }
    return answer;
  }
}
