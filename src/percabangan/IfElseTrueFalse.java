package percabangan;

public class IfElseTrueFalse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 60000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if(uangDiDompet>totalBelanja) {
            double kembalian = uangDiDompet - totalBelanja;
            System.out.println("Uang Cukup, Kembalian : " + kembalian);
        }else{
            System.out.println("Uang pas.. weeeew");
        }
    }
}
