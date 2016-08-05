package nantel.java.ffnex_parser.model.exceptions;

public class FNNEXFileParsingException extends RuntimeException {

    public FNNEXFileParsingException(String fileName, Throwable cause) {
        super("An unexpected error occured while parsing file '" + fileName + "'.", cause);
    }

    public FNNEXFileParsingException(Throwable cause) {
        super(cause);
    }
}
