package Baumstammvolumen;
public class Baumstammvolumen_3_5 {
  
  public static void main(String[] args) {
    
    // Länge in Meter (m)
    byte length = 15;  // 8 bit , Wertebereich -128 ... 127
    
    // Das Hyperion genannte Exemplar eines Küstenmammutbaums (Sequoia sempervirens)
    // im Redwood-Nationalpark in Kalifornien gilt mit kanpp 116 m (115,85 Meter) Wuchshöhe
    // (Vermessung 2017) als derzeit höchster bekannter Baum der Erde (Stand 2019).
    
    // Durchmesser in Zentimeter (cm)
    short diameter = 32;  // 16 bit , Wertebereich -32.768 ... 32.767

    // Nach den offiziellen Angaben hat der „Baum von Tule“ (Mexiko) bei einer Höhe
    // von 41,85 m ein Gewicht von 636 Tonnen. In Bodennähe beträgt sein Umfang 46 Meter.
    // Das bedeutet einen Durchmesser von fast 15 m = 1.500 cm.
    
    // Baumstammvolumen (in Festmeter) berechnen
    double volume = (double)( (Math.PI/4 * Math.pow(diameter, 2)) * length/10000 );
    
    System.out.println("Das Volumen eines Baumstamms mit einer Länge von " + length +" m"); 
    System.out.println("und einem Durchmesser von " + diameter + " cm"); 
    System.out.println("beträgt " + volume + " Festmeter."); 
    
  } // end of main

} // end of class Baumstammvolumen3
