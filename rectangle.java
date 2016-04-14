
public class rectangle {
	
	 private double width;
     private double height;
     private double area;
     
     public rectangle(double width, double height) {
             this.width = width;
             this.height = height;
             area = width * height;
     }
     
     public void setWidth(double w) {
             width = w;
             setArea(width, height);
     }
     
     public void setHeight(double h) {
             height = h;
             setArea(width, height);
     }
     
     private void setArea(double w, double h) {
             this.area = w * h;
     }
     
     public double getWidth() {
             return width;
     }
     
     public double getHeight() {
             return height;
     }
     
     public double getArea() {
             return area;
     }

	

}
