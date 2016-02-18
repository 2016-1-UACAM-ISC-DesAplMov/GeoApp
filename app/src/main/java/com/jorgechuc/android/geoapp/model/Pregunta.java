package com.jorgechuc.android.geoapp.model;

/**
 * Created by Jorge on 17/02/2016.
 */
public class Pregunta {
    private int mIdResTexto;
    private boolean mVerdadera;

    public Pregunta(int idResTexto, boolean verdadera) {
        mIdResTexto = idResTexto;
        mVerdadera = verdadera;
    }

    public int getIdResTexto() {
        return mIdResTexto;
    }

    public void setIdResTexto(int idResTexto) {
        mIdResTexto = idResTexto;
    }

    public boolean isVerdadera() {
        return mVerdadera;
    }

    public void setVerdadera(boolean verdadera) {
        mVerdadera = verdadera;
    }
}
