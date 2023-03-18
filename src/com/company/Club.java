package com.company;

public abstract class Club {
    boolean isDeleted;
    boolean isSolid;

    public Club() {
    }

    ;

    public Club(boolean isDeleted, boolean isSolid) {
        this.isDeleted = false;
        this.isSolid = false;
    }

    abstract String getClubData();
}
