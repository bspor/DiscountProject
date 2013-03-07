package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class ConsoleOutputStrategy implements OutputStrategy {
    @Override
    public void outPut(String outPut) {
        System.out.println(outPut);
    }
}
