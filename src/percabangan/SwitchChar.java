package percabangan;

public class SwitchChar {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak ?\"");
                System.out.println("Dosen : \"Masih syukur bapak kasih B\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian ?\"");
                System.out.println("Mhs   : \"Hihihihi....\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah ?\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs   : \"Kabur....\"");
                break;
        }
    }
}
