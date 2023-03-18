package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ERP e = new ERP();
        Scanner scn = new Scanner(System.in);
        int number;
        System.out.println("СОЗДАЙТЕ КЛУБ");
        ClubCreate c = new ClubCreate();
        System.out.println("Введите страну клуба");
        c.country = scn.next();
        System.out.println("Введите название клуба");
        c.nameClub = scn.next();
        c.printClub();
        while (true) {
            System.out.println("НАЖМИТЕ [1] ЧТОБЫ ДОБАВИТЬ ИГРОКА В КЛУБ");
            System.out.println("НАЖМИТЕ [2] ЧТОБЫ ВЫВЕСТИ ВСЕХ ИГРОКОВ");
            System.out.println("НАЖМИТЕ [3] ЧТОБЫ ВЫВЕСТИ ИГРОКА ПО ID");
            System.out.println("НАЖМИТЕ [4] ЧТОБЫ ИЗМЕНИТЬ ИГРОКА ПО ID");
            System.out.println("НАЖМИТЕ [5] ЧТОБЫ УДАЛИТЬ ИГРОКА ПО ID");
            System.out.println("НАЖМИТЕ [6] ЧТОБЫ ВЫВЕСТИ НЕ УДАЛЕННЫХ И НЕ ПРОДАННЫХ ИГРОКОВ");
            System.out.println("НАЖМИТЕ [7] ЧТОБЫ ПРОДАТЬ ИГРОКА");
            System.out.println("НАЖМИТЕ [0] ЧТОБЫ ВЫЙТИ ИЗ ПРОГРАММЫ");
            System.out.println(" ");
            number = scn.nextInt();
            if (number == 1) {

                Player p = new Player();
                e.addPlayer(p);

                System.out.println("Введите ID игрока по порядку ");
                p.id = scn.nextInt();
                System.out.println("Введите имя игрока");
                p.name = scn.next();
                System.out.println("Введите фамилию игрока");
                p.surname = scn.next();
                System.out.println("Введите позицию игрока");
                p.position = scn.next();
                System.out.println("Введите номер игрока");
                p.number = scn.nextInt();
            } else if (number == 2) {
                c.printClub();
                e.printPlayers();
                System.out.println(" ");
            } else if (number == 3) {
                System.out.println("Введите ID игрока");
                number = scn.nextInt();
                e.printPlayerById(number - 1);
                System.out.println(" ");

            } else if (number == 4) {
                Player p1 = new Player();
                System.out.println("Введите ID игрока которого хотите заменить");
                number = scn.nextInt();
                e.editPlayerByID(number - 1, p1);
                System.out.println("Введите имя игрока");
                p1.name = scn.next();
                System.out.println("Введите фамилию игрока");
                p1.surname = scn.next();
                System.out.println("Введите позицию игрока");
                p1.position = scn.next();
                System.out.println("Введите номер игрока");
                p1.number = scn.nextInt();
                p1.id = number;
            } else if (number == 5) {
                Player p2 = new Player();
                System.out.println("Введите ID игрока которого хотите удалить");
                number = scn.nextInt();
                e.DeletePlayerById(number - 1, p2);
            } else if (number == 6) {
                c.printClub();
                e.printNotDeletedPlayers();
                System.out.println(" ");
            } else if (number == 7) {
                System.out.println("Введите имя покупателя");
                Sell a = new Sell();
                a.customer = scn.next();

                System.out.println("Введите цену игрока");
                a.price = scn.nextInt();
                System.out.println("Введите ID игрока которого хотите продать");
                number = scn.nextInt();
                e.SellPlayer(number - 1, a);
            } else if (number == 0) {
                break;
            }
        }
    }
}
