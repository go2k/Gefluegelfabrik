package com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel;

import com.sabel.gefluegelfabrik.Gefluegel;
import com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel.Ente;
import com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel.Vogel;

public class Gefluegelfabrik {

    public Gefluegelfabrik() {

    }

    public Gefluegel erzeugeGefluegel(String art) {

        switch (art) {
            case "Vogel":
                return new Vogel();

            case "Ente":
                return new Ente();

            default:
                return null;
        }

    }

    public static Gefluegel erzeugeGefluegel2(String art) {

        switch (art) {
            case "Vogel":
                return new Vogel();

            case "Ente":
                return new Ente();

            default:
                return null;
        }

    }

}
