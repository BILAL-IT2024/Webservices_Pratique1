package org.example;

import proxy.BanqueService;
import proxy.Banquews_0029;
import proxy.ListComtes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        BanqueService stub=new Banquews_0029().getBanqueServicePort();
        //stub.convert(100);
        System.out.println( stub.convert(100));

        System.out.println( stub.getCompte(1));

        System.out.println(stub.listComtes());



    }
}