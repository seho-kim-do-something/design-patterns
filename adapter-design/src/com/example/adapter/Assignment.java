package com.example.adapter;

public class Assignment {
    private Pen pen;

    public void setPilotPen(Pen pen) {
        this.pen = pen;
    }

    public void doAssignment() {
        pen.write();
    }
}
