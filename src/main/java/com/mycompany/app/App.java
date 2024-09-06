package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(
                    "Error: No arguments supplied. Expected arguments: 1. See -help for a list of avaliable commands.");
        } else if (args.length > 1) {
            System.out.println(
                    "Error: More arguments than expected. Expected arguments: 1. See -help for a list of avaliable commands.");
        } else if (args[0].equals("-all")) {
            Conways.main(args);
            Fibonacci.main(args);
            MySinh.main(args);
            MyStats.main(args);
        } else if (args[0].equals("-conways")) {
            Conways.main(args);
        } else if (args[0].equals("-fibonacci")) {
            Fibonacci.main(args);
        } else if (args[0].equals("-mysinh")) {
            MySinh.main(args);
        } else if (args[0].equals("-mystats")) {
            MyStats.main(args);
        } else if (args[0].equals("-help")) {
            System.out.println(
                    "Commands:\n -conways - Runs conways\n -fibonacci - Runs fibonacci\n -mysinh - Runs MySinh\n -mystats - Runs MyStats\n -all - Runs All files\n -help - Displays this information");
        } else {
            System.out.println(
                    "Error: Command " +
                            args[0] +
                            " not recognized. Try -help to see avaliable commands.");
        }
    }
}
