public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog-3.5;
        System.out.println(dog);
        cat = cat-1.6;
        System.out.println(cat);
        paper = paper-7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println("frog "+frog);
        frog = frog+10;
        System.out.println("frog " + frog);
        frog = frog/3.5;
        System.out.println("frog " + frog);
        frog = frog+4;
        System.out.println("frog " + frog);
        var weightFirstBoxer = 78.2;
        System.out.println("Масса первого боксера " + weightFirstBoxer + " кг ");
        var weightSecondBoxer = 82.7;
        System.out.println("Масса второго боксера "+weightSecondBoxer+" кг ");
        var totalWeight = weightFirstBoxer+weightSecondBoxer;
        System.out.println("Общая масса бойцов "+totalWeight+"кг");
        var weightDifference = weightFirstBoxer-weightSecondBoxer;
        System.out.println("Разница между бойцами "+weightDifference+" кг ");
        var remains = weightSecondBoxer%weightFirstBoxer;
        System.out.println("Остаток от деления между двумя весами "+remains+" кг ");
        var generalWorkingTime= 640;
        var workingTime  = 8;
        var staff = generalWorkingTime / workingTime;
        System.out.println("Всего работников в компании - " + staff + " человек ");
        var newStaff = staff+94;
        var newGeneralWorkingTime = newStaff*8;
        System.out.println("Если в компании работает " + newStaff +" человек, то всего " + newGeneralWorkingTime + " часов работы может быть поделено между сотрудниками");










    }
}