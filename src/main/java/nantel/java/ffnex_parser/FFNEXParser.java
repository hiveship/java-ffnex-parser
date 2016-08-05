package nantel.java.ffnex_parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rits.cloning.Cloner;
import nantel.java.ffnex_parser.model.entities.Club;
import nantel.java.ffnex_parser.model.entities.FFNEXFile;
import nantel.java.ffnex_parser.model.entities.Result;
import nantel.java.ffnex_parser.model.entities.Swimmer;
import nantel.java.ffnex_parser.model.exceptions.FNNEXFileParsingException;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class FFNEXParser {

    /**
     * Jackson 2 XML Object Mapper
     */
    private static ObjectMapper MAPPER = new XmlMapper();

    /**
     * Unmarshall an FFNEX XML file
     *
     * @param xml Java file object containing the source XML to process
     * @return a complete FFNEXFile entity
     * @throws FNNEXFileParsingException
     */
    public static FFNEXFile parseFile(File xml) throws FNNEXFileParsingException {
        try {
            return MAPPER.readValue(xml, FFNEXFile.class);
        } catch (IOException e) {
            throw new FNNEXFileParsingException(xml.getName(), e);
        }
    }

    /**
     * Restrict the content of a FFNEXFile to a specific club ID (clubs, swimmers and results)
     *
     * @param origin The original FFNEXFile entity from which you want to restrict content.
     * @param clubId ID of your club.
     * @return A clone of your input FFNEXFile entity with only information linked to your specified club.
     */
    public static FFNEXFile restrictContent(final FFNEXFile origin, final int clubId) {
        Cloner cloner = new Cloner();
        FFNEXFile restricted = cloner.deepClone(origin);

        // Remove the other clubs
        List<Club> clubs = restricted.getMeets().get(0).getClubs();
        for (Iterator<Club> iterator = clubs.iterator(); iterator.hasNext(); ) { // Need an iterator because we are going to remove data from the list
            Club club = iterator.next();
            if (club.getId() != clubId) {
                iterator.remove();
            }
        }

        // Remove the other swimmers
        List<Swimmer> swimmers = restricted.getMeets().get(0).getSwimmers();
        for (Iterator<Swimmer> iterator = swimmers.iterator(); iterator.hasNext(); ) {
            Swimmer swimmer = iterator.next();
            if (swimmer.getClubId() != clubId) {
                iterator.remove();
            }
        }

        // Remove the other results
        List<Result> results = restricted.getMeets().get(0).getResults();
        for (Iterator<Result> iterator = results.iterator(); iterator.hasNext(); ) {
            Result result = iterator.next();
            if (!(result.getClubId() == clubId)) {
                iterator.remove();
            }
        }

        return restricted;
    }
}
