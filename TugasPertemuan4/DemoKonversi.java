package com.TugasPertemuan4;

public class DemoKonversi {
    public static void main(String[] args) {
        
    
    KonversiSuhu KS1 = new KonversiSuhu();
    KonversiSuhu2 KS2 = new KonversiSuhu2();

    int CtF = KonversiSuhu.CelciusToFarenheit(90);
    System.out.println( "90 Celcius = " + CtF + " Farenheit");

    int CtR = KonversiSuhu.CelciusToReamur(180);
    System.out.println("180 Celcius = " + CtR + " Reamur");

        int FtR = KonversiSuhu2.FarenheitToReamur(CtF);
        System.out.println(CtF + " Farenheit = " + FtR +" Reamur");


    }

    
    
}
