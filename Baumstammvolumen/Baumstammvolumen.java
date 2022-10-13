package Baumstammvolumen;

class Baumstammvolumen {

    public static void main(String[] args) {

        int length = 15; // 10;
        int diameter = 32; // 30;

        double volume = (Math.PI / 4) * Math.pow(diameter, 2) * length / 10000;

        System.out.println(volume);

        
    }

}
