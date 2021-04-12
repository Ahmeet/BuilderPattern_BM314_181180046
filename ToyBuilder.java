/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class ToyBuilder{
    private String name;
    private String colour;
    private String specialTalent;


    private int height;
    private int weight;
    private int numberOfEyes;
    private int numberOfHands;
    private int numberOfHeads;
    private int NumberOfLegs;
    private int pieces;

    private boolean isPlush;
    private boolean hasHat;
    private boolean hasGlasses;
    private boolean isSpeaking;
    private boolean isMoving;
    private boolean hasHair;
    private boolean isOKForUnderThreeYears;

    public static ToyBuilder toyBuilder() {
        return new ToyBuilder();
    }

    public static ToyBuilder toyCarBuilder() {
        ToyBuilder toyBuilder = new ToyBuilder();
        toyBuilder.isMoving = true;
        toyBuilder.isPlush = false;
        toyBuilder.isOKForUnderThreeYears = false;
        return toyBuilder;
    }

    public Toy Build() {
        Toy toy = new Toy();

        toy.setName(name);
        toy.setColour(colour);
        toy.setSpecialTalent(specialTalent);

        toy.setHeight(height);
        toy.setWeight(weight);
        toy.setNumberOfEyes(numberOfEyes);
        toy.setNumberOfHands(numberOfHands);
        toy.setNumberOfHeads(numberOfHeads);
        toy.setNumberOfLegs(NumberOfLegs);
        toy.setPieces(pieces);
        toy.setPlush(isPlush);
        toy.setHasHat(hasHat);
        toy.setHasGlasses(hasGlasses);
        toy.setSpeaking(isSpeaking);
        toy.setMoving(isMoving);
        toy.setHasHair(hasHair);
        toy.setOKForUnderThreeYears(isOKForUnderThreeYears);

        return toy;


    }

    public ToyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ToyBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public ToyBuilder setSpecialTalent(String specialTalent) {
        this.specialTalent = specialTalent;
        return this;
    }

    public ToyBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public ToyBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public ToyBuilder setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
        return this;
    }

    public ToyBuilder setNumberOfHands(int numberOfHands) {
        this.numberOfHands = numberOfHands;
        return this;
    }

    public ToyBuilder setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
        return this;
    }

    public ToyBuilder setNumberOfLegs(int NumberOfLegs) {
        this.NumberOfLegs = NumberOfLegs;
        return this;
    }

    public ToyBuilder setPieces(int pieces) {
        this.pieces = pieces;
        return this;
    }

    public ToyBuilder setPlush(boolean plush) {
        isPlush = plush;
        return this;
    }

    public ToyBuilder setHasHat(boolean hasHat) {
        this.hasHat = hasHat;
        return this;
    }

    public ToyBuilder setHasGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
        return this;
    }

    public ToyBuilder setSpeaking(boolean speaking) {
        isSpeaking = speaking;
        return this;
    }

    public ToyBuilder setMoving(boolean moving) {
        isMoving = moving;
        return this;
    }

    public ToyBuilder setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
        return this;
    }

    public ToyBuilder setOKForUnderThreeYears(boolean OKForUnderThreeYears) {
        isOKForUnderThreeYears = OKForUnderThreeYears;
        return this;
    }
}
