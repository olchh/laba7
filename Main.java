package com.company;

public class Main {
    static class Animal{
        String name;
        String food;
        String location;

        Animal (String name,String food,String location){
            this.name = name;
            this.food=food;
            this.location=location;
        }
        public void makeNoise(){
            System.out.println("шумитб");

        }
        public void eat(){
            System.out.println("кушоетб");
        }
        public void sleep(){
            System.out.println("спитб");
        }
        public void displayInfo(){
            System.out.println("location: " + location);
            System.out.println("food: " + food);
        }
    }

    static class Dog extends Animal{
        private String dopdog = "тоже азарует, как и кит, только еще и тявкает";
        Dog(String Name,String food,String location) {
            super(Name, food, location);
        }
        @Override
        public void eat() {
            System.out.println("собакен кушоетб " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("собакен тявкает ");
        }

        @Override
        public void sleep() {
            System.out.println("собакен спитб");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("мнение: " + dopdog);
        }
    }


    static class Cat extends Animal{
        private String dopcat = "лысый, могу показать фото :з";
        Cat(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("кит кушоет " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("кит азарует ");
        }

        @Override
        public void sleep() {
            System.out.println("кит втыкает ");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("описание: " + dopcat);
        }
    }
    static class Fish extends Animal{
        private String dopfish = "просят покушать очень много раз за день";
        Fish(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("рыбов кушоетб " + food);
        }

        @Override
        public void makeNoise() {
            System.out.println("рыбов бульбулькает");
        }

        @Override
        public void sleep() {
            System.out.println("рыбов спитб");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("осуждение " + dopfish);
        }
    }

    static class Veterinarian{

        void treatAnimal(Animal animal) {
            System.out.print(" food :" + animal.food);
            System.out.println("\n location: " + animal.location);
            System.out.println( animal.name + " на приеме у ветеринара");
        }
    }


    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal cat = new Cat("балбес(мама так называет)", "гематогенку, но много низя", "на подушечке");
        Animal dog = new Dog("мотя","подик", "в падике");
        Animal fish = new Fish ("пиратик","корм", "аквариум");
        cat.displayInfo();
        vet.treatAnimal(cat);
        dog.displayInfo();
        vet.treatAnimal(dog);
        fish.displayInfo();
        vet.treatAnimal(fish);

    }
}
