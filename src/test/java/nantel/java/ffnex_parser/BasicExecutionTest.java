package nantel.java.ffnex_parser;


import nantel.java.ffnex_parser.model.entities.FFNEXFile;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class BasicExecutionTest {

    private static final int LANNION_NATATION_CLUB_ID = 1160;

    @Test
    public void executeSuccess(){
        try {
            // Read a file from the project resource folder
            File xml1 = new File(BasicExecutionTest.class.getClassLoader().getResource("interclubs2015-ffnex.xml").getFile());
            File xml2 = new File(BasicExecutionTest.class.getClassLoader().getResource("combine2-ffnex.xml").getFile());

            FFNEXParser.parseFile(xml1);
            FFNEXParser.parseFile(xml2);
            Assert.assertTrue(true);
            //TODO: Add more tests to check the content
        } catch (Exception e) {
            // Should not happen
            Assert.assertFalse(true);
        }
    }

    @Test
    public void executeSuccessRestrictContent(){
        try {
            // Read a file from the project resource folder
            File xml = new File(BasicExecutionTest.class.getClassLoader().getResource("interclubs2015-ffnex.xml").getFile());

            FFNEXFile parsingResult = FFNEXParser.parseFile(xml);
            Assert.assertTrue(true);
            FFNEXFile restrictedResult = FFNEXParser.restrictContent(parsingResult, LANNION_NATATION_CLUB_ID);
            Assert.assertNotEquals(parsingResult, restrictedResult);
            //TODO: add more tests to check the restricted result
        } catch (Exception e) {
            // Should not happen
            Assert.assertFalse(true);
        }
    }

    @Test
    public void executeFailureFileNotFFNEX(){
        try {
            // Read a file from the project resource folder
            File xml1 = new File(BasicExecutionTest.class.getClassLoader().getResource("fake-xml.xml").getFile());

            FFNEXParser.parseFile(xml1);
            Assert.assertFalse(true);
        } catch (Exception e) {
            // Should not happen
            Assert.assertTrue(true);
        }
    }

}
