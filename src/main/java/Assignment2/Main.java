package Assignment2;

import java.util.Scanner;

public class Main {




public static void  main(String  args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("give dimensions: height length");
    Dimension dimension = new Dimension(scanner.nextInt(),scanner.nextInt());
    String input;
    while (true) {
        System.out.println("Give filling: * - #");
        input = scanner.next();
        if(input.equals("*") || input.equals("-") || input.equals("#")) break;
    }
    Filling filling = new Filling(input);
    Sign aSign = new Sign(dimension,filling,"AAA");
    Sign bSign = new Sign(dimension,filling,"BBB");
    while (true) {
        System.out.println("Give New filling: * - #");
        input = scanner.next();
        if(input.equals("*") || input.equals("-") || input.equals("#")) break;
    }
    Filling filling2 = new Filling(input);
    Sign cSign = new Sign(dimension,filling2,"CCC");

    System.out.println("Tassa kohtaa luodut kyltit:");
    print(aSign.getDimension().getLength(),aSign.getDimension().getHeight(), aSign.getFilling().getFilling(), aSign.getText());
    print(bSign.getDimension().getLength(),bSign.getDimension().getHeight(), bSign.getFilling().getFilling(), bSign.getText());
    print(cSign.getDimension().getLength(),cSign.getDimension().getHeight(), cSign.getFilling().getFilling(), cSign.getText());

    System.out.println("Muutetaan AAA-kyltin tayteeksi Asteriski (linkitys katkeaa).\n" +
            "Muutetaan tayte1 tyypiksi Vaavaviiva.");
    aSign.setFilling(new Filling("*"));
    filling.setFilling("-");
    System.out.println("Tässä kohtaa luodut kyltit:");
    print(aSign.getDimension().getLength(),aSign.getDimension().getHeight(), aSign.getFilling().getFilling(), aSign.getText());
    print(bSign.getDimension().getLength(),bSign.getDimension().getHeight(), bSign.getFilling().getFilling(), bSign.getText());
    print(cSign.getDimension().getLength(),cSign.getDimension().getHeight(), cSign.getFilling().getFilling(), cSign.getText());

    System.out.println("Muutetaan CCC-kyltin leveys=20, korkeus=1 (linkitys katkeaa).\n" +
            "Muutetaan leveys1=30, korkeus1=5");
    cSign.setDimension(new Dimension(1,20));
    dimension.setLength(30);
    dimension.setHeight(5);
System.out.println("Tassa kohtaa luodut kyltit:");
    print(aSign.getDimension().getLength(),aSign.getDimension().getHeight(), aSign.getFilling().getFilling(), aSign.getText());
    print(bSign.getDimension().getLength(),bSign.getDimension().getHeight(), bSign.getFilling().getFilling(), bSign.getText());
    print(cSign.getDimension().getLength(),cSign.getDimension().getHeight(), cSign.getFilling().getFilling(), cSign.getText());

}











    static void print(final int l, final int k, final String m, final String t) {
        final int k2 = (k-1)/2;
        final int l2 = (l-t.length()-2)/2;
        String r = "";
        for(int i=0;i<l;i++) r += m;
        for(int i=0;i<k2;i++) System.out.println(r);
        for(int i=0;i<l2;i++) System.out.print(m);
        System.out.print(" " + t + " ");
        for(int i=0;i<l-l2-t.length()-2;i++) System.out.print(m);
        System.out.println();
        for(int i=0;i<k-k2-1;i++) System.out.println(r);
    }
}
