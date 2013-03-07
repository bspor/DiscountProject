package bjs.discountstrategy;

/**
 * Make my output 
 * @author bspor
 */
public class IOService {
    //The interface for this is not implemented yet
    private StringBuilder in;
    private OutputStrategy out;

    public IOService(StringBuilder in, OutputStrategy out) {
        this.in = in;
        this.out = out;
    }

    public void outPut() {
        out.outPut(in.toString());
    }
}
