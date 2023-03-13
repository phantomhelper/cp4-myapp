package pl.cp4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void println(String text){
        System.out.println(text);
    }
    public static void println(){
        System.out.println("");
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jakub", "Michal", "Agnieszka", "Ola", "Kasia");


        Greeter greeter = new Greeter();
        greeter.greet("Jakub"); // -> Hello Jakub

        List<String> ladies = new ArrayList<String>();

        for (String name: names){
            if (name.endsWith("a")){
                ladies.add(name);
            }
        }

        for (String ladyName: ladies){
            greeter.greet(ladyName);
        }

        println("-----------------------");

        names.stream()
                .filter(name -> name.endsWith("a"))
                .filter((name -> name.startsWith("K")))
                .map(String::toUpperCase)
                .forEach(greeter::greet);

    }
}
