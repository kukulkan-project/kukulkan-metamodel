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

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Class KukulkanConfigurationProperties.
 *
 * @author Daniel Cortes Pichardo
 * @version 1.0.0
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = "kukulkan", ignoreUnknownFields = false)
public class KukulkanConfigurationProperties {
    
    /** The data. */
    private final Data data = new Data();
    
    /** The config. */
    private final Config config = new Config();

    /**
     * Gets the data.
     *
     * @return the data
     */
    public Data getData() {
        return data;
    }

    /**
     * Gets the config.
     *
     * @return the config
     */
    public Config getConfig() {
        return config;
    }

    /**
     * The Class Data.
     */
    public static class Data {

        /** The mysql. */
        private final Mysql mysql = new Mysql();

        /**
         * The Class Mysql.
         */
        public static class Mysql {
            
            /** The uri. */
            private String uri;
            
            /** The user. */
            private String user;
            
            /** The password. */
            private String password;

            /**
             * Gets the uri.
             *
             * @return the uri
             */
            public String getUri() {
                return uri;
            }

            /**
             * Sets the uri.
             *
             * @param uri the new uri
             */
            public void setUri(String uri) {
                this.uri = uri;
            }

            /**
             * Gets the user.
             *
             * @return the user
             */
            public String getUser() {
                return user;
            }

            /**
             * Sets the user.
             *
             * @param user the new user
             */
            public void setUser(String user) {
                this.user = user;
            }

            /**
             * Gets the password.
             *
             * @return the password
             */
            public String getPassword() {
                return password;
            }

            /**
             * Sets the password.
             *
             * @param password the new password
             */
            public void setPassword(String password) {
                this.password = password;
            }
        }

        /**
         * Gets the mysql.
         *
         * @return the mysql
         */
        public Mysql getMysql() {
            return mysql;
        }
    }

    /**
     * The Class Config.
     */
    public static class Config {

        /** The inputdir. */
        private String inputdir;
        
        /** The outputdir. */
        private String outputdir;
        
        /** The documenturl. */
        private String documenturl;
        
        /** The external apps. */
        private ExternalApps externalApps;

        /**
         * The Class ExternalApps.
         */
        public static class ExternalApps {
            
            /** The modeler. */
            private String modeler;
            
            /** The presentation. */
            private String presentation;
            
            /** The slides. */
            private String slides;

            /**
             * Gets the modeler.
             *
             * @return the modeler
             */
            public String getModeler() {
                return modeler;
            }

            /**
             * Sets the modeler.
             *
             * @param modeler the new modeler
             */
            public void setModeler(String modeler) {
                this.modeler = modeler;
            }

            /**
             * Gets the presentation.
             *
             * @return the presentation
             */
            public String getPresentation() {
                return presentation;
            }

            /**
             * Sets the presentation.
             *
             * @param presentation the new presentation
             */
            public void setPresentation(String presentation) {
                this.presentation = presentation;
            }

            /**
             * Gets the slides.
             *
             * @return the slides
             */
            public String getSlides() {
                return slides;
            }

            /**
             * Sets the slides.
             *
             * @param slides the new slides
             */
            public void setSlides(String slides) {
                this.slides = slides;
            }
        }

        /**
         * Gets the inputdir.
         *
         * @return the inputdir
         */
        public String getInputdir() {
            return inputdir;
        }

        /**
         * Sets the inputdir.
         *
         * @param inputdir the new inputdir
         */
        public void setInputdir(String inputdir) {
            this.inputdir = inputdir;
        }

        /**
         * Gets the outputdir.
         *
         * @return the outputdir
         */
        public String getOutputdir() {
            return outputdir;
        }

        /**
         * Sets the outputdir.
         *
         * @param outputdir the new outputdir
         */
        public void setOutputdir(String outputdir) {
            this.outputdir = outputdir;
        }

        /**
         * Gets the documenturl.
         *
         * @return the documenturl
         */
        public String getDocumenturl() {
            return documenturl;
        }

        /**
         * Sets the documenturl.
         *
         * @param documenturl the new documenturl
         */
        public void setDocumenturl(String documenturl) {
            this.documenturl = documenturl;
        }

        /**
         * Gets the external apps.
         *
         * @return the external apps
         */
        public ExternalApps getExternalApps() {
            return externalApps;
        }

        /**
         * Sets the external apps.
         *
         * @param externalApps the new external apps
         */
        public void setExternalApps(ExternalApps externalApps) {
            this.externalApps = externalApps;
        }
    }
}
