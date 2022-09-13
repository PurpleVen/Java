class PetClass {
    private int PetID;
    private String PetName;
    private int PetAge;
    private String PetType;

    public PetClass(int ID, String Name, int age, String Type)
    {
        PetID = ID;
        PetName = Name;
        PetAge = age;
        PetType = Type;
    }
    public void Pet_info()
    {
        System.out.println("Pet ID = " + PetID + "\nPet Name = " + PetName + "\nPet Age = " + PetAge + "\nPet Type = " + PetType);
    }
}

class MainPetClass{
    public static void main(String args[]){
        PetClass Dog = new PetClass(1,"Momo", 5, "Dog");
        System.out.println("---Details Of Dog---");
        Dog.Pet_info();
        PetClass Cat = new PetClass(2, "Snowfie", 7, "Cat");
        System.out.println("\n---Details Of Cat---");
        Cat.Pet_info();
    }
}

