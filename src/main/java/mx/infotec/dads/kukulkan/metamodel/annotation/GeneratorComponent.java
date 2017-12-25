package mx.infotec.dads.kukulkan.metamodel.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.stereotype.Component;

/**
 * Generator annotation, used to identify a generator component
 * 
 * @author Daniel Cortes Pichardo
 *
 */
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface GeneratorComponent {

}
