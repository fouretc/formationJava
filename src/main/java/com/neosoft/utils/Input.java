package com.neosoft.utils;

import java.util.Scanner;

public class Input {
    public String inputString ()
    {
        String saisie = "";
        Scanner scan = new Scanner(System.in);
        boolean scanOK = false;
        while (!scanOK) {
            try {
                saisie = scan.nextLine();
                scanOK = true;
            } catch (Exception e) {
                System.err.println("Saisie non valide !");
                scan.nextLine();
            }
        }
        return saisie;
    }

    public Integer inputInteger ()
    {
        Integer saisie = null;
        Scanner scan = new Scanner(System.in);
        boolean scanOK = false;
        while (!scanOK) {
            try {
                saisie = scan.nextInt();
                scanOK = true;
            } catch (Exception e) {
                System.err.println("Saisie non valide !");
                scan.nextLine();
            }
        }
        return saisie;
    }
}
