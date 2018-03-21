package mx.infotec.dads.kukulkan.metamodel.util;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * LocalDateTimeDeserializer
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
    @Override
    public LocalDateTime deserialize(JsonParser parser, DeserializationContext dsContext) throws IOException {
        // restoring in iso 8601
        return LocalDateTime.parse(parser.getText());
    }
}