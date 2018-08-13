package mx.infotec.dads.kukulkan.metamodel.conventions;

import java.io.Serializable;

public interface PhysicalName extends Serializable {

    String getUpperCamelCase();

    String getUpperCamelCasePlural();

    String getLowerCamelCase();

    String getLowerCamelCasePlural();

    String getKebabCase();

    String getKebabCasePlural();

    String getSnakeCase();

    String getSnakeCasePlural();
}
