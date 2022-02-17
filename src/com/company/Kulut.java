package com.company;

import java.util.Scanner;


public class Kulut {
    public String nimi;
    public double vuokra;
    public double ruoka;
    public double vaatteet;
    public double huvitukset;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Anna nimesi: ");
        Kulut user = new Kulut(input.nextLine());

        System.out.println("Anna vuorkasi määrä: ");
        double rent = Double.parseDouble(input.nextLine());
        System.out.println("Anna ruokaostoksiesi määrä: ");
        double food = Double.parseDouble(input.nextLine());
        System.out.println("Anna vaateostoksiesi määrä: ");
        double clothes = Double.parseDouble(input.nextLine());
        System.out.println("Anna huvituksille jäävä määrä: ");
        double recreational = Double.parseDouble(input.nextLine());

        user.setVuokra(rent);
        user.setRuoka(food);
        user.setVaatteet(clothes);
        user.setHuvitukset(recreational);

        tulostus(user);
    }

    public static void tulostus(Kulut user) {
        System.out.println("Hei " + user.getNimi() + " menojesi yhteissumma on: " + kokonaisuus(user));
        System.out.println("Vuokraan menee: " + user.getVuokra());
        System.out.println("Ruokaan menee: " + user.getRuoka());
        System.out.println("Vaatteisiin menee: " + user.getVaatteet());
        System.out.println("Huvituksiin menee: " + user.getHuvitukset());
    }


    public static double kokonaisuus(Kulut user) {
        return user.getVuokra() + user.getRuoka() + user.getVaatteet() + user.getHuvitukset();
    }

    public Kulut(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getVuokra() {
        return vuokra;
    }

    public void setVuokra(double vuokra) {
        this.vuokra = vuokra;
    }

    public double getRuoka() {
        return ruoka;
    }

    public void setRuoka(double ruoka) {
        this.ruoka = ruoka;
    }

    public double getVaatteet() {
        return vaatteet;
    }

    public void setVaatteet(double vaatteet) {
        this.vaatteet = vaatteet;
    }

    public double getHuvitukset() {
        return huvitukset;
    }

    public void setHuvitukset(double huvitukset) {
        this.huvitukset = huvitukset;
    }
}