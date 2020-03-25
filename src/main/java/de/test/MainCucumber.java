package de.test;

import io.cucumber.core.cli.Main;

public class MainCucumber {
  public static void main(String[] args) throws Throwable {
    String[] optionArguments = { "src/main/resources/" };
    Main.main(optionArguments);
  }
}
