public class Main {
    public static void main(String[] args) throws Exception {
        // Pet
        Pet dog = new Pet("Sparky", 5, "Seattle", "dog");
        System.out.println("Pet's name is " + dog.getName());
        dog.setAge(6);
        System.out.println("Pet's age is " + dog.getAge());

        // MusicNote 
        MusicNote firstNote = new MusicNote(48, 96, 1000);
        System.out.println("The note value is " + firstNote.getNoteValue());
        System.out.println("The note name is " + firstNote.noteString());
        if (firstNote.isLoud()) {
            System.out.println("The note is loud!");
        }

        // Calculator
        Calculator calculator = new Calculator();
        System.out.println("2 + 2 = " + calculator.add(2, 2));
        System.out.println("8^5 = " + calculator.square(8, 5));

        // MagicCalculator
        MagicCalculator magic = new MagicCalculator();
        System.out.println("Magic Calculator still can subtract 5 from 10: " + magic.subtract(10, 5));
        System.out.println("The factorial of 10 is " + magic.factorial(10));
    }
}
