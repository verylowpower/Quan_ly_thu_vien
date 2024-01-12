package chucnang;
import java.awt.*;
import java.awt.print.*;

public class ComponentPrinter implements Printable {
    private Component componentToPrint;
    public ComponentPrinter(Component component) {
        this.componentToPrint = component;
    }
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return Printable.NO_SUCH_PAGE;
        }
        // Chinh bien cua component de vua voi trang in
        Dimension componentSize = componentToPrint.getSize();
        double pageWidth = pf.getImageableWidth();
        double pageHeight = pf.getImageableHeight();
        double scaleX = pageWidth / componentSize.width;
        double scaleY = pageHeight / componentSize.height;
        double scaleFactor = Math.min(scaleX, scaleY);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        g2d.scale(scaleFactor, scaleFactor);
        // In component ra trang in
        componentToPrint.paint(g2d);
        return Printable.PAGE_EXISTS;
    }
    public void printComponent() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                System.out.println("In that bai: " + ex.getMessage());
            }
        }
    }
}
