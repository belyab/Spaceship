package tic_tac_toe;

import java.util.Scanner;

public class applicationManage {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Spaceship argo =new Spaceship("Argo",10);
        Spaceship normandy = new Spaceship("Normand",10);

        System.out.println(argo);
        System.out.println(normandy);
        argo.takeDmg(10);
        System.out.println(argo);
    }
}
