public class Stoney implements ColdDrinks {
    @Override
    public void performAction() {
        System.out.println("Type Stoney is action at Workshops.");
    }
    @Override
    public int getAttribute() {
        return 200;
    }
    @Override
    public String getType() {
        return "Stoney";
    }
    @Override
    public void haltAction() {
        System.out.println("Type3 action halted.");
    }
    public String getDetailStoney() {
        return "DetailStoney of Type Stoney";
    }
}
