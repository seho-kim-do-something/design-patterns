package com.example.adapter;

import com.example.ext.PilotPen;

public class School {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        Assignment asg = new Assignment();
        asg.setPilotPen(pen);
        asg.doAssignment();
    }
}
