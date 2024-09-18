public class Main {
    public static void main(String[] args) {
        double dog=8;
        var cat =3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
dog=dog+4;
cat=cat+4;
paper = paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog =dog-3.5;
        cat=cat-1.6;
        paper = paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
         friend=(friend+2)/7;
        System.out.println(friend);
      var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var mas1=78.2;
        var mas2 = 82.7;
        var masObch=mas1+mas2;
        var razn=mas2-mas1;
        System.out.println(masObch);
        System.out.println(razn);
        var masOst=mas2%mas1;
        System.out.println(masOst);
        var obsch=640;
        var norm=8;
        var kSotr=obsch/norm;
        System.out.println("Всего работников в компании - "+kSotr+" человек");
        var newKSotr=kSotr+94;
        var newObsch=newKSotr*norm;
        System.out.println("Если в компании работает "+newKSotr+" то всего "+newObsch+
                " часов может быть поделено между сотрудниками");
    }
}