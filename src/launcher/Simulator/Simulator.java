package launcher.Simulator;

import java.io.*;
import launcher.Errors.*;

public class Simulator
{
    public static void main(String[] args) throws Exception {
        // If Got more or less than 1 args throw and exit
        if (args.length != 1)
            throw new UsageException("Usage Error, ");
        try {
            BufferedReader a = new BufferedReader(new FileReader(args[0]));


        }  catch (IOException fileException) {
            System.out.println("Cannot Read File specified");
        } catch (Exception exception) {
            System.out.println(exception.getLocalizedMessage());
        }
    };
};