package best_practices;

public class  QuadrilateralBuilder {
     private int height = 10;
     private int width = 10;
     private String colour = "black";

     public QuadrilateralBuilder() {
     }

     public Quadrilateral buildQuadrilateral() {
         return new Quadrilateral(height, width, colour);
     }

     public QuadrilateralBuilder addHeight(int height) {
         this.height = height;
         return this;
     }

     public QuadrilateralBuilder addWidth(int width) {
         this.width = width;
         return this;
     }

     public QuadrilateralBuilder addColour(String colour) {
         this.colour = colour;
         return this;
     }

    }
