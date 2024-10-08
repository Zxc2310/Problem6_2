public class Main {
    public static void main(String[] args) {
        ColdDrinks[] CD = new ColdDrinks[3];
        CD[0] = new Fanta();
        CD[1] = new Stoney();
        CD[2] = new Cocola();

        for (ColdDrinks CLDK : CD) {
            CLDK.performAction();
            System.out.println("Attribute: " + CLDK.getAttribute());
            System.out.println("Type: " + CLDK.getType());
            CLDK.haltAction();

            if (CLDK instanceof Fanta) {
                System.out.println(((Fanta) CLDK).getDetailFanta());
            } else if (CLDK instanceof Stoney) {
                System.out.println(((Stoney) CLDK).getDetailStoney());
            } else if (CLDK instanceof Cocola) {
                System.out.println(((Cocola) CLDK).getDetailCocola());
            }
        }
    }
}
