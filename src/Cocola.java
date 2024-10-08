public class Cocola implements ColdDrinks {

    @Override
    public void performAction() {
        System.out.println("Type Cocola is heals you day.");
    }
    @Override
    public int getAttribute() {
        return 300;
    }
    @Override
    public String getType() {
        return "Cocola";
    }
    @Override
    public void haltAction() {
        System.out.println("Type3 action halted.");
    }
    public String getDetailCocola() {
        return "DetailCocola of Type Cocola";
    }
}