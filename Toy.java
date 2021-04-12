/**
 * @author Ahmet Furkan KARATAŞ
 * 181180046
 */
public class Toy {
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

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", specialTalent='" + specialTalent + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfHands=" + numberOfHands +
                ", numberOfHeads=" + numberOfHeads +
                ", NumberOfLegs=" + NumberOfLegs +
                ", pieces=" + pieces +
                ", isPlush=" + isPlush +
                ", hasHat=" + hasHat +
                ", hasGlasses=" + hasGlasses +
                ", isSpeaking=" + isSpeaking +
                ", isMoving=" + isMoving +
                ", hasHair=" + hasHair +
                ", isOKForUnderThreeYears=" + isOKForUnderThreeYears +
                '}';
    }

    private boolean hasGlasses;
    private boolean isSpeaking;
    private boolean isMoving;
    private boolean hasHair;
    private boolean isOKForUnderThreeYears;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSpecialTalent() {
        return specialTalent;
    }

    public void setSpecialTalent(String specialTalent) {
        this.specialTalent = specialTalent;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfHands() {
        return numberOfHands;
    }

    public void setNumberOfHands(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public int getNumberOfLegs() {
        return NumberOfLegs;
    }

    public void setNumberOfLegs(int NumberOfLegs) {
        this.NumberOfLegs = NumberOfLegs;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public boolean isPlush() {
        return isPlush;
    }

    public void setPlush(boolean plush) {
        isPlush = plush;
    }

    public boolean isHasHat() {
        return hasHat;
    }

    public void setHasHat(boolean hasHat) {
        this.hasHat = hasHat;
    }

    public boolean isHasGlasses() {
        return hasGlasses;
    }

    public void setHasGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public boolean isSpeaking() {
        return isSpeaking;
    }

    public void setSpeaking(boolean speaking) {
        isSpeaking = speaking;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean isOKForUnderThreeYears() {
        return isOKForUnderThreeYears;
    }

    public void setOKForUnderThreeYears(boolean OKForUnderThreeYears) {
        isOKForUnderThreeYears = OKForUnderThreeYears;
    }
}
