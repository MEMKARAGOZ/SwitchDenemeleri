public class DenemeSwitch {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Dersten geçtiniz. Notunuz PEKİYİ");
                break;
            case 'B':
                System.out.println("Dersten geçtiniz. Notunuz İYİ");
                break;
            case 'C':
                System.out.println("Dersten geçtiniz. Notunuz ORTA");
                break;
            case 'D':
                System.out.println("Dersten geçtiniz. Notunuz ZAYIF");
                break;
            case 'F':
                System.out.println("Üzgünüm dersi Geçemediniz");
                break;
            default:
                System.out.println("Geçersiz not girildi. Tekrar deneyiniz");
        }

    }tchDenemeleri
}
