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
package mx.infotec.dads.kukulkan.metamodel.util;

import java.time.*;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * The Class JSR310DateConverters.
 */
public final class JSR310DateConverters {

    /**
     * Instantiates a new JSR 310 date converters.
     */
    private JSR310DateConverters() {
    }

    /**
     * The Class LocalDateToDateConverter.
     */
    public static class LocalDateToDateConverter implements Converter<LocalDate, Date> {

        /** The Constant INSTANCE. */
        public static final LocalDateToDateConverter INSTANCE = new LocalDateToDateConverter();

        /**
         * Instantiates a new local date to date converter.
         */
        private LocalDateToDateConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public Date convert(LocalDate source) {
            return source == null ? null : Date.from(source.atStartOfDay(ZoneId.systemDefault()).toInstant());
        }
    }

    /**
     * The Class DateToLocalDateConverter.
     */
    public static class DateToLocalDateConverter implements Converter<Date, LocalDate> {

        /** The Constant INSTANCE. */
        public static final DateToLocalDateConverter INSTANCE = new DateToLocalDateConverter();

        /**
         * Instantiates a new date to local date converter.
         */
        private DateToLocalDateConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public LocalDate convert(Date source) {
            return source == null ? null : ZonedDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault())
                .toLocalDate();
        }
    }

    /**
     * The Class ZonedDateTimeToDateConverter.
     */
    public static class ZonedDateTimeToDateConverter implements Converter<ZonedDateTime, Date> {

        /** The Constant INSTANCE. */
        public static final ZonedDateTimeToDateConverter INSTANCE = new ZonedDateTimeToDateConverter();

        /**
         * Instantiates a new zoned date time to date converter.
         */
        private ZonedDateTimeToDateConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public Date convert(ZonedDateTime source) {
            return source == null ? null : Date.from(source.toInstant());
        }
    }

    /**
     * The Class DateToZonedDateTimeConverter.
     */
    public static class DateToZonedDateTimeConverter implements Converter<Date, ZonedDateTime> {

        /** The Constant INSTANCE. */
        public static final DateToZonedDateTimeConverter INSTANCE = new DateToZonedDateTimeConverter();

        /**
         * Instantiates a new date to zoned date time converter.
         */
        private DateToZonedDateTimeConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public ZonedDateTime convert(Date source) {
            return source == null ? null : ZonedDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault());
        }
    }

    /**
     * The Class LocalDateTimeToDateConverter.
     */
    public static class LocalDateTimeToDateConverter implements Converter<LocalDateTime, Date> {

        /** The Constant INSTANCE. */
        public static final LocalDateTimeToDateConverter INSTANCE = new LocalDateTimeToDateConverter();

        /**
         * Instantiates a new local date time to date converter.
         */
        private LocalDateTimeToDateConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public Date convert(LocalDateTime source) {
            return source == null ? null : Date.from(source.atZone(ZoneId.systemDefault()).toInstant());
        }
    }

    /**
     * The Class DateToLocalDateTimeConverter.
     */
    public static class DateToLocalDateTimeConverter implements Converter<Date, LocalDateTime> {

        /** The Constant INSTANCE. */
        public static final DateToLocalDateTimeConverter INSTANCE = new DateToLocalDateTimeConverter();

        /**
         * Instantiates a new date to local date time converter.
         */
        private DateToLocalDateTimeConverter() {
        }

        /* (non-Javadoc)
         * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
         */
        @Override
        public LocalDateTime convert(Date source) {
            return source == null ? null : LocalDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault());
        }
    }
}