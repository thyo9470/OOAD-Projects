public class Elephant extends Pachyderm {

    Elephant(){
        super(false, "vegetation", "savannah", true, "Emily", 4, 2);
    }

    /**
     *  Constructor with only Animal parameters
     * @param awake:boolean - Is the animal awake?
     * @param diet:String - What does the animal eat?
     * @param habitat:String - Where does the animal live?
     * @param hungry:boolean - Is the animal hungry?
     * @param name:String - The name of the animal
     * @param numLegs:int - How many legs does the animal have?
     */
    Elephant(boolean awake, String diet, String habitat, boolean hungry, String name, int numLegs){
        super(awake, diet, habitat, hungry, name, numLegs);
    }

    /**
     *  Constructor with Animal and Pachyderm parameters
     * @param awake:boolean - Is the animal awake?
     * @param diet:String - What does the animal eat?
     * @param habitat:String - Where does the animal live?
     * @param hungry:boolean - Is the animal hungry?
     * @param name:String - The name of the animal
     * @param numLegs:int - How many legs does the animal have?
     *
     * @param numTusks:int - How many tusks does the animal possess?
     */
    Elephant(boolean awake, String diet, String habitat, boolean hungry, String name, int numLegs, int numTusks){
        super(awake, diet, habitat, hungry, name, numLegs, numTusks);
    }

    /**
     * override make noise for elephant noises
     */
    @Override
    public void makeNoise() { System.out.println(name + " the Elephant: Phoo-waompph"); }
}
