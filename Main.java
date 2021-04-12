/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class Main {

    public static void main(String[] args) {
        Toy toy = ToyBuilder.toyBuilder()
                .setName("Pinokyo")
                .setColour("Brown")
                .setSpecialTalent("elongating nose")
                .setHeight(50)
                .setWeight(1)
                .setPlush(false)
                .Build();

        Toy car = ToyBuilder.toyCarBuilder()
                .setName("Flash McQueen")
                .setColour("Red")
                .setSpecialTalent("fast as lightning")
                .Build();


        printToy(toy);
        printToy(car);

    }


    private static void printToy(Toy toy) {
        System.out.println("\n"+toy+"\n");
    }
}
