package ie.alancasey.utils;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by alan on 18/06/17.
 */
public class DataRetrieverTest {

    private DataRetriever dataRetriever;

    @Before
    public void setup(){
        this.dataRetriever = new DataRetriever();
    }

//    @Test
    public void test() throws Exception {
        GeneratePlayerInsertStatements generatePlayerInsertStatements = new GeneratePlayerInsertStatements();
        generatePlayerInsertStatements.writeSqlStatementsToFile();
//        dataRetriever.getDataFromHtml();
    }
}
