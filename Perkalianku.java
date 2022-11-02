public class Perkalianku {
    void Perkalian(int a, int b){
        System.out.println(a*b);
    }
    void Perkalian(double a, double b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Perkalianku objek= new Perkalianku();
        objek.Perkalian(25, 43);
        objek.Perkalian(34.56,23.7);
    }
}


