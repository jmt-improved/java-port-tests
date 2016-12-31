package main.java.jmt.gui.jsimgraph.JGraphMod.arrows;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by raffaele on 12/19/16.
 */
public class JmtEdgesMatrix {
    public class JmtEdge {
        final JmtMatrixCoordinate startingPoint;
        final JmtMatrixCoordinate endingPoint;

        public JmtMatrixCoordinate getStartingPoint() {
            return startingPoint;
        }

        public JmtMatrixCoordinate getEndingPoint() {
            return endingPoint;
        }

        public boolean hasRightDirection() {
            return startingPoint.getX() < endingPoint.getX();
        }

        public JmtEdge(JmtMatrixCoordinate startPoint, JmtMatrixCoordinate endPoint) {
            this.startingPoint = startPoint;
            this.endingPoint = endPoint;
        }

    }

    private List<JmtEdge> edges;

    public JmtEdgesMatrix() {
        edges = new LinkedList<>();
    }

    public List<JmtEdge> getEdges() { return edges; }

    public JmtMatrixCoordinate getStartingPointOfEdge(int edge) {
        return edges.get(edge).getStartingPoint();
    }

    public JmtMatrixCoordinate getEndingPointOfEdge(int edge) {
        return edges.get(edge).getEndingPoint();
    }

    public JmtEdge get(int edge) {
        return edges.get(edge);
    }

    public void put(JmtMatrixCoordinate startPoint, JmtMatrixCoordinate endPoint) {
        edges.add(new JmtEdge(startPoint, endPoint));
    }

}
