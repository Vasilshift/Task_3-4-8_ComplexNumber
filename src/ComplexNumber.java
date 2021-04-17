public class ComplexNumber {
        private double re;
        private double im;
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        if (Double.compare(that.re, re) != 0) return false;
        return Double.compare(that.im, im) == 0;
    }
//    @Override
//    public int hashCode() {
//        //int result = a == null ? 0 : b.hashCode();
//        return hashCode();
//    }


        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

}

