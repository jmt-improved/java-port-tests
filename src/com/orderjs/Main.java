package com.orderjs;

import main.java.jmt.gui.jsimgraph.JGraphMod.arrows.*;
import main.java.jmt.gui.jsimgraph.JGraphMod.arrows.JmtEdgesMatrix.JmtEdge;

public class Main {

    public static void main(String[] args) {
        /*JmtComponentsMatrix matrix1 = new JmtComponentsMatrix();
        JmtEdgesMatrix lines1 = new JmtEdgesMatrix();

        JmtMatrixStationCell cell1 = new JmtMatrixStationCell(new JmtMatrixCoordinate(0, 0));
        JmtMatrixStationCell cell2 = new JmtMatrixStationCell(new JmtMatrixCoordinate(1, 0));
        JmtMatrixStationCell cell3 = new JmtMatrixStationCell(new JmtMatrixCoordinate(3, 0));
        JmtMatrixStationCell cell4 = new JmtMatrixStationCell(new JmtMatrixCoordinate(0, 1));
        JmtMatrixStationCell cell5 = new JmtMatrixStationCell(new JmtMatrixCoordinate(1, 1));
        JmtMatrixStationCell cell6 = new JmtMatrixStationCell(new JmtMatrixCoordinate(3, 1));

        matrix1.addMatrixCell(cell1);
        matrix1.addMatrixCell(cell2);
        matrix1.addMatrixCell(cell3);
        matrix1.addMatrixCell(cell4);
        matrix1.addMatrixCell(cell5);
        matrix1.addMatrixCell(cell6);

        lines1.put(new JmtMatrixCoordinate(4, 0), new JmtMatrixCoordinate(0, 2));
        lines1.put(new JmtMatrixCoordinate(3, 2), new JmtMatrixCoordinate(1, 2));

        new JmtRoutingNew(matrix1, lines1);*/
        JmtComponentsMatrix matrix1 = new JmtComponentsMatrix();
        JmtEdgesMatrix lines1 = new JmtEdgesMatrix();

        JmtMatrixStationCell cell1 = new JmtMatrixStationCell(new JmtMatrixCoordinate(0, 0));
        JmtMatrixStationCell cell2 = new JmtMatrixStationCell(new JmtMatrixCoordinate(1, 0));
        JmtMatrixStationCell cell3 = new JmtMatrixStationCell(new JmtMatrixCoordinate(3, 0));
        JmtMatrixStationCell cell4 = new JmtMatrixStationCell(new JmtMatrixCoordinate(0, 1));
        JmtMatrixStationCell cell5 = new JmtMatrixStationCell(new JmtMatrixCoordinate(1, 1));
        JmtMatrixStationCell cell6 = new JmtMatrixStationCell(new JmtMatrixCoordinate(3, 1));

        JmtMatrixStationCell cell7 = new JmtMatrixStationCell(new JmtMatrixCoordinate(5, 0));
        JmtMatrixStationCell cell8 = new JmtMatrixStationCell(new JmtMatrixCoordinate(0, 8));
        JmtMatrixStationCell cell9 = new JmtMatrixStationCell(new JmtMatrixCoordinate(3, 3));
        JmtMatrixStationCell cell10 = new JmtMatrixStationCell(new JmtMatrixCoordinate(4, 0));
        JmtMatrixStationCell cell11 = new JmtMatrixStationCell(new JmtMatrixCoordinate(14, 10));


        matrix1.addMatrixCell(cell1);
        matrix1.addMatrixCell(cell2);
        matrix1.addMatrixCell(cell3);
        matrix1.addMatrixCell(cell4);
        matrix1.addMatrixCell(cell5);
        matrix1.addMatrixCell(cell6);

        matrix1.addMatrixCell(cell7);
        matrix1.addMatrixCell(cell8);
        matrix1.addMatrixCell(cell9);
        matrix1.addMatrixCell(cell10);
        matrix1.addMatrixCell(cell11);


        //lines1.put(new JmtMatrixCoordinate(4, 0), new JmtMatrixCoordinate(0, 2));
        lines1.put(new JmtMatrixCoordinate(3, 2), new JmtMatrixCoordinate(1, 2));

        lines1.put(new JmtMatrixCoordinate(5, 1), new JmtMatrixCoordinate(0, 7));
        lines1.put(new JmtMatrixCoordinate(1, 8), new JmtMatrixCoordinate(3, 4));


        new JmtRoutingNew(matrix1, lines1);

    }
}
