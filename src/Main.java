public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friends = 19;
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        var massaOdin = 78.2;
        var massaDva = 82.7;
        var totalWeight = massaOdin + massaDva;
        System.out.println("масса двух бойцов " + totalWeight + "кг");
        var weightOne = 78.2;
        var weightTwo = 82.7;
        var raznica = weightTwo - weightOne;
        System.out.println("разница бойцов " + raznica + "кг!");
        var differense = (weightOne + weightTwo) % raznica;
        System.out.println("остаток " + differense + "кг!");

        var time = 640;
        var watch = 8;
        var people = time / watch;
        System.out.println("всего работников в компании " + people + " человек!");
        var staff = 80;
        var sotrudniki = 94;
        var vsesotrud = staff + sotrudniki;
        System.out.println(vsesotrud + " сотрудников");
        var totalStaff = 174;
        var totalTime = time / totalStaff;
        System.out.println("всего часов " + totalTime);
        System.out.println("Если в компании работает " + totalStaff + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");

    }
}