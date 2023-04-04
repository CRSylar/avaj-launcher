package launcher.Simulator;

import java.io.*;
import java.util.Arrays;

import launcher.Errors.*;
import launcher.Errors.RuntimeException;
import launcher.FileHandler.MyReader;

public class Simulator
{
    public static void main(String[] args) throws Exception {
        // If Got more or less than 1 args throw and exit
        if (args.length != 1)
            throw new UsageException("Usage Error, ");
        try {
            MyReader reader = new MyReader(args[0]);
            String[] firstRow = reader.getRow();
            if (firstRow == null) throw new UsageException("Empty File! ");
            System.out.println(firstRow[0]);

        }  catch (IOException fileException) {
            System.out.println(fileException.getMessage());
        }
    };
};