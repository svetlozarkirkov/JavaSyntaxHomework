import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.ext.awt.geom.Polyline2D;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
import org.xml.sax.SAXException;

public class Problem10_PaintHouseAsSVG {
	
	public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
		Scanner input = new Scanner(System.in);
//		int nPoints = input.nextInt();
//		ArrayList<ArrayList<Double>> points = new ArrayList<ArrayList<Double>>();
//		for(int i = 0; i < nPoints; i++){
//			ArrayList<Double> temp = new ArrayList<Double>();
//			temp.add(input.nextDouble());
//			temp.add(input.nextDouble());
//			points.add(temp);
//		}
		
		// Create an SVG document.
	    DOMImplementation impl = SVGDOMImplementation.getDOMImplementation();
	    String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
	    SVGDocument doc = (SVGDocument) impl.createDocument(svgNS, "svg", null);

	    // Create a converter for this document.
	    
	    SVGGraphics2D g = new SVGGraphics2D(doc);
	    Element root = doc.getDocumentElement();
	    // Do some drawing.
//	    for (ArrayList currentPoint: points){
//	    	drawPoint(g,doc,root,currentPoint.indexOf(0),currentPoint.indexOf(1));
//	    }
	    //Shape circle = new Ellipse2D.Double(20, 30, 10, 10);
	    Shape boxOne = new Rectangle2D.Double(200,250,150,150);
	    Shape boxFour = new Rectangle2D.Double(200,250,150,150);
	    Shape boxTwo = new Rectangle2D.Double(130,90,30,55);
	    Shape boxThree = new Rectangle2D.Double(130,90,30,55);
	    
	    Polygon triangle = new Polygon();
	    triangle.addPoint(50, 90);
	    triangle.addPoint(105,25);
	    triangle.addPoint(160, 90);
	    g.setPaint(Color.LIGHT_GRAY);
	    g.fill(boxTwo);
	    g.fill(boxFour);
	    g.fill(triangle);
	    g.setPaint(Color.BLUE);
	    g.draw(boxOne);
	    g.draw(boxThree);
	    g.draw(triangle);
	    Shape coordinateOne = new Line2D.Double(20,70,190,70);
	    g.setStroke(new BasicStroke(
	    	      1f, 
	    	      BasicStroke.CAP_ROUND, 
	    	      BasicStroke.JOIN_ROUND, 
	    	      1f, 
	    	      new float[] {2f}, 
	    	      0f));
	    g.draw(new Line2D.Double(20,50,190,50));
	    g.setStroke(new BasicStroke(
	    	      1f, 
	    	      BasicStroke.CAP_ROUND, 
	    	      BasicStroke.JOIN_ROUND, 
	    	      1f, 
	    	      new float[] {2f}, 
	    	      0f));
	    
	    g.setPaint(Color.black);
	    g.draw(coordinateOne);
	    Graphics2D g2 = (Graphics2D) g; 
	    g.setSVGCanvasSize(new Dimension(800, 800));
	    g.getRoot(root);
	    
	    // Populate the document root with the generated SVG content.
	    

	    // Display the document.
	    JSVGCanvas canvas = new JSVGCanvas();
	    JFrame f = new JFrame();
	    
	    f.getContentPane().add(canvas);
	    canvas.setSVGDocument(doc);
	    f.pack();
	    f.setVisible(true);
		
		input.close();
	}
}