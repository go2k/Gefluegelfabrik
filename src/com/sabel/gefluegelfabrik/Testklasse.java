package com.sabel.gefluegelfabrik;

import com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel.Gefluegelfabrik;
import com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel.Vogel;

public class Testklasse {

    public static void main(String[] args) {

        Gefluegelfabrik gefluegelfabrik = new Gefluegelfabrik();

        Gefluegel gefluegel = gefluegelfabrik.erzeugeGefluegel("Vogel");
        if (gefluegel != null) {
            gefluegel.fliegen();
        }

        gefluegel = gefluegelfabrik.erzeugeGefluegel("Ente");
        if (gefluegel != null) {
            gefluegel.fliegen();
        }

        gefluegel = Gefluegelfabrik.erzeugeGefluegel2("Vogel");
        if (gefluegel != null) {
            gefluegel.fliegen();
        }

        // gefluegel = new Vogel(); Da Testklasse nicht im gleichen Paket wie der Vogel, keine Objekterzeugeung möglich
    }




}
