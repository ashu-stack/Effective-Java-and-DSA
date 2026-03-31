package Strings;

public class StringPerformance {
    public static void main(String[] args) {
        long start, end;
        start = System.currentTimeMillis();
        String s = "Java";
        for(int i=0; i<100000; i++){
            s += "program";
        }
        end = System.currentTimeMillis();
        System.out.println("Total time : " + (end-start) + " ms");

        StringBuilder builder = new StringBuilder("Java");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.append("program");
        }
        end = System.currentTimeMillis();
        System.out.println("Total time in builder: " + (end-start) + " ms" );

        StringBuffer buffer = new StringBuffer("Java");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append("program");
        }

        end = System.currentTimeMillis();
        System.out.println("Total time in buffer: " + (end-start) + " ms" );



    }
}
