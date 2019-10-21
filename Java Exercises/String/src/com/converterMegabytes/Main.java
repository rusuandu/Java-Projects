package com.converterMegabytes;

public class Main {

    public static void main(String[] args) {
	    StringBuffer sbf = new StringBuffer("Andrei");
	    sbf.append(" Rusu");
	    sbf.replace(0,6, "Vasile");
	    sbf.delete(8,10);

	    //diffrence between string and strigbuffer/builder: string is immutable and stringbuffer it is
        // diffrence between string buffer and string builder: using the sbf when create a apllication with multiple threads
        // and sbd when create a application with a single thread

        System.out.println(sbf);
    }
}
