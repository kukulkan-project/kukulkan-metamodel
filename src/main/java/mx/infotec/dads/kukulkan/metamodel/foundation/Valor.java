/*
 *  
 * The MIT License (MIT)
 * Copyright (c) 2016 Daniel Cortes Pichardo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package mx.infotec.dads.kukulkan.metamodel.foundation;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Valor.
 */
public class Valor {

    /** The clave. */
    String clave;

    /** The nombre. */
    String nombre;

    /**
     * Instantiates a new valor.
     *
     * @param clave
     *            the clave
     * @param nombre
     *            the nombre
     */
    public Valor(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    /**
     * Gets the clave.
     *
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the clave.
     *
     * @param clave
     *            the new clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre
     *            the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the default.
     *
     * @return the default
     */
    public static List<Valor> getDefault() {
        List<Valor> valores = new ArrayList<>();
        valores.add(new Valor("pd", "Prudencia"));
        valores.add(new Valor("js", "Justicia"));
        valores.add(new Valor("fr", "Fortaleza"));
        valores.add(new Valor("tm", "Templanza"));
        return valores;
    }
}
