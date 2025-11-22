package week05.lecture.test1;

public class Dog extends Animal{
    public void setDogName(String n) {
        // Can access name because it is protected.
        name = n;
    }

    public void printDogName() {
        // Can call the protected method as well.
        showName();
    }
}
