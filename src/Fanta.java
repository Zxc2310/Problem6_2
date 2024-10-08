class Fanta implements ColdDrinks {

    @Override
    public void performAction() {
        System.out.println("Type Fanta is performing an action.");
    }
    @Override
    public int getAttribute() {
        return 100;
    }
    @Override
    public String getType() {
        return "Fanta";
    }
    @Override
    public void haltAction() {
        System.out.println("Type3 action halted.");
    }
    public String getDetailFanta() {
        return "DetailFanta of Type Fanta";
    }
}
