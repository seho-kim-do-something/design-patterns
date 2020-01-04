package com.example.adapter;

import com.example.ext.PilotPen;

public class PenAdapter implements Pen {
    private PilotPen pilotPen = new PilotPen();

    @Override
    public void write() {
        pilotPen.write();
    }
}
