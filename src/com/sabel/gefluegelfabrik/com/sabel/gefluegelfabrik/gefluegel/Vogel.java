package com.sabel.gefluegelfabrik.com.sabel.gefluegelfabrik.gefluegel;

import com.sabel.gefluegelfabrik.Gefluegel;

public class Vogel implements Gefluegel {

    //paketsicher ohne zugriffsmodifizierer (public private protectet)
    // nur klassen im gleichen paket dürfen darauf zugreifen
    Vogel() {

    }

    @Override
    public void fliegen() {
        System.out.println("Piep Piep");
    }
}
