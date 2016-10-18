package ir.hri.view;

import ir.hri.bl.Handler;
import ir.hri.bl.HandlerA;

public class App {
    public static void main(String[] args) {
        Handler start = null;
        for (int i = 5; i > 0; i--) {
            System.out.println("Handler " + i + " deals up to a limit of " + i * 1000);
            start = new HandlerA(i, start);
        }
        int[] a = {50, 2000, 1500, 10000, 175, 500};
        for (int i : a) {
            System.out.println(start.HandleRequest(i));
        }
    }
}
