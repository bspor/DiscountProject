package bjs.discountstrategy;

/**
 * Make my output 
 * @author bspor
 */
public class IOService {
    private InputStrategy in;
    private OutputStrategy out;

    public IOService(InputStrategy in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }

    public void outPut() {
        out.outPut(in.toString());
    }
}
