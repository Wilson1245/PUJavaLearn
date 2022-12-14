public class Main3 {
    public static void main(String[] args) {
        DVD dvd = new DVD(10,20);
    }
}

class CD {
    int r;

    CD() {

    }
    CD(int r) {
        this.r = r;
    }
}

class DVD extends CD {
    int c;
    DVD(int r, int c) {
//        super(r);
//        this.c = c;

//        super.r = r;
//        this.c = c;

        this(c);
        super.r = r;
    }
    DVD(int c){
//        super();
        this.c = c;
    }
}