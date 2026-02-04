package org.example.idatt2003;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
       System.out.println(new ReplaceTextCommand("target", "replace").execute("target target hello"));
       System.out.println(new ReplaceFirstTextCommand("target", "replace").execute("target target hello"));
       System.out.println(new WrapTextCommand("S", "P").execute("target target hello"));
       System.out.println(new CapitalizeTextCommand().execute("target target hello"));
    }
}
