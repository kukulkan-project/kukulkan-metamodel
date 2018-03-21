package mx.infotec.dads.kukulkan.metamodel.util;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * LocalDateTimeSerializer
 * 
 * @author Daniel Cortes Pichardo
 *
 */
public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
    @Override
    public void serialize(LocalDateTime time, JsonGenerator jsonGenerator, SerializerProvider sProvider)
            throws IOException {
        // saving in iso 8601
        jsonGenerator.writeString(time.toString());
    }
}