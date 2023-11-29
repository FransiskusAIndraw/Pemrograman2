package Soal1;
public class Paint {
        private final double coverage;
        public Paint(double c) {
            coverage = c;
        }
        public double amount(Shape s) {
            System.out.println("Computing amount for " + s);
            double shapeArea = s.area();
            return shapeArea / coverage;
        }
    }
