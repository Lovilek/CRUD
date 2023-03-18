package com.company;

public class ERP {
    Club[] memory = new Club[1000];
    int sizeOfMemory = 0;

    public void addPlayer(Club a) {
        a.isDeleted = false;
        memory[sizeOfMemory] = a;

        sizeOfMemory++;

    }

    public void DeletePlayerById(int index, Club c) {
        if (index < sizeOfMemory) {
            for (int i = 0; i < sizeOfMemory; i++) {
                if (i == index) {
                    c.isDeleted = true;
                    memory[i] = c;
                }
            }
        }
    }

    public void printPlayers() {
        for (int i = 0; i < sizeOfMemory; i++) {
            if (memory[i].isDeleted == false) {
                System.out.println(memory[i].getClubData());
            } else if (memory[i].isDeleted == true && memory[i].isSolid == false) {
                System.out.println("Этот игрок удален, ID: " + (i + 1));
            } else if (memory[i].isSolid == true && memory[i].isDeleted == true) {
                System.out.println(memory[i].getClubData() + "ID: " + (i + 1));
            }
        }
    }

    public void printNotDeletedPlayers() {
        for (int i = 0; i < sizeOfMemory; i++) {
            if (memory[i].isDeleted == false && memory[i].isSolid == false) {
                System.out.println(memory[i].getClubData());
            }
        }
    }


    public void printPlayerById(int index) {
        if (index < sizeOfMemory) {
            if (memory[index].isDeleted == false) {
                System.out.println(memory[index].getClubData());
            } else if (memory[index].isDeleted == true && memory[index].isSolid == false) {
                System.out.println("Этот игрок удален, ID: " + (index + 1));
            } else if (memory[index].isDeleted == true && memory[index].isSolid == true) {
                System.out.println("Этот игрок продан, ID: " + (index + 1));
            }
        }
    }

    public void editPlayerByID(int index, Club b) {
        if (index < sizeOfMemory) {
            for (int i = 0; i < sizeOfMemory; i++) {
                if (index == i) {
                    memory[i] = b;

                }
            }
        }
    }

    public void SellPlayer(int index, Club f) {
        if (index < sizeOfMemory) {
            for (int i = 0; i < sizeOfMemory; i++) {
                if (i == index) {
                    f.isDeleted = true;
                    f.isSolid = true;
                    memory[i] = f;
                }
            }
        }
    }

}
