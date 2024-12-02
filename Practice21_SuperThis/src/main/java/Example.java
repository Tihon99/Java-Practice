public class Example {
    int a;
    int b;
    int c;
    int z;

    public Example() {
        this.z = 1;
    }

    public Example(int a) {
        this();
        this.a = a;
    }

    public Example(int a, int b) {
        this(a);
        this.b = b;
    }

    public Example(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }
}
