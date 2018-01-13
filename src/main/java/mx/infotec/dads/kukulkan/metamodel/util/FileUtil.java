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

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static mx.infotec.dads.kukulkan.metamodel.util.Validator.requiredNotEmpty;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.infotec.dads.kukulkan.metamodel.foundation.DomainModel;
import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratedElement;
import mx.infotec.dads.kukulkan.metamodel.foundation.GeneratorContext;

/**
 * The FileUtil Class is used for common File operations.
 *
 * @author Daniel Cortes Pichardo
 */
public class FileUtil {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

    /**
     * Instantiates a new file util.
     */
    private FileUtil() {
    }

    /**
     * Closes this stream and releases any system resources associated with it.
     * If the stream is already closed then invoking this method has no effect.
     * 
     * <p>
     * As noted in {@link AutoCloseable#close()}, cases where the close may fail
     * require careful attention. It is strongly advised to relinquish the
     * underlying resources and to internally <em>mark</em> the
     * {@code Closeable} as closed, prior to throwing the {@code IOException}.
     *
     * @param resource
     *            the resource
     */
    public static void close(Closeable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (IOException ioException) {
                LOGGER.error("The resource actually exist: ", ioException);
            }
        }
    }

    /**
     * Builds the real File Path
     *
     * @param proyectoId
     *            the proyecto id
     * @param resourcePath
     *            the path
     * @param relativeFilePath
     *            the file path
     * @param outPutDir
     *            the out put dir
     * @return the path
     */
    public static Path buildRealFilePath(Path outPutDir, String proyectoId, BasePathEnum resourcePath, String packaging,
            String layerName, String fileName) {
        return Paths.get(outPutDir.toString(), proyectoId, resourcePath.getPath(), convertPackageToPath(packaging),
                layerName, fileName);
    }

    public static String convertPackageToPath(String basePackage) {
        return basePackage.replace('.', '/');
    }

    /**
     * Builds the real File Path
     *
     * @param proyectoId
     *            the proyecto id
     * @param resourcePath
     *            the path
     * @param relativeFilePath
     *            the file path
     * @param outPutDir
     *            the out put dir
     * @return the path
     */
    public static Path buildRealFilePath(Path outPutDir, String proyectoId, BasePathEnum resourcePath,
            String fileName) {
        return Paths.get(outPutDir.toString(), proyectoId, resourcePath.getPath(), fileName);
    }

    /**
     * Creates the parents file if not exist.
     *
     * @param path
     *            the path
     * @return true, if successful
     */
    public static boolean createParentsFileIfNotExist(Path path) {
        if (!path.toFile().exists()) {
            return createDirectories(path.getParent());
        } else {
            return false;
        }
    }

    /**
     * Creates the file if not exist.
     *
     * @param file
     *            the file
     * @return true, if successful
     */
    public static boolean createFileIfNotExist(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            LOGGER.error("FileUtil.createFileIfNotExist: ", e);
            return false;
        }
    }

    /**
     * Creates the directories.
     *
     * @param path
     *            the path
     * @return true, if successful
     */
    public static boolean createDirectories(Path path) {
        try {
            Files.createDirectories(path.getParent());
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Save to file.
     *
     * @param ge
     *            the ge
     * @return true, if successful
     */
    public static boolean saveToFile(GeneratedElement ge) {
        return saveToFile(ge.getRealPath(), ge.getContent());
    }

    /**
     * Save to file.
     *
     * @param pathToSave
     *            the path to save
     * @param content
     *            the content
     * @return true, if successful
     */
    public static boolean saveToFile(Path pathToSave, String content) {
        createDirectories(pathToSave);
        LOGGER.info("saveFile to: {}", pathToSave);
        try (final BufferedWriter out = Files.newBufferedWriter(pathToSave, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            out.write(content);
            return true;
        } catch (IOException ioe) {
            LOGGER.error("FileUtil.createFileIfNotExist: ", ioe);
            return false;
        }
    }

    /**
     * Save to file.
     *
     * @param genCtx
     *            the gen ctx
     * @return true, if successful
     */
    public static boolean saveToFile(GeneratorContext genCtx) {
        saveDataModelElements(genCtx);
        saveReadmeToFile(genCtx);
        return true;
    }

    /**
     * Save readme to file.
     *
     * @param genCtx
     *            the gen ctx
     */
    public static void saveReadmeToFile(GeneratorContext genCtx) {
        requiredNotEmpty(genCtx.get(DomainModel.class)).getGeneratedElements().forEach(FileUtil::saveToFile);
    }

    /**
     * Save data model elements.
     *
     * @param genCtx
     *            the gen ctx
     */
    public static void saveDataModelElements(GeneratorContext genCtx) {
        requiredNotEmpty(genCtx.get(DomainModel.class)).getDomainModelGroup().forEach(dmg -> dmg
                .getDomainModelElements().forEach(dme -> dme.getGeneratedElements().forEach(FileUtil::saveToFile)));
    }

    /**
     * Creates the zip.
     *
     * @param path
     *            the path
     * @param compressedName
     *            the compressed name
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void createZip(Path path, String compressedName) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File(path.getParent().toFile(), compressedName + ".zip"));
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = path.toFile();
        zipFile(fileToZip, fileToZip.getName(), zipOut);
        zipOut.close();
        fos.close();
    }

    /**
     * Zip file.
     *
     * @param fileToZip
     *            the file to zip
     * @param fileName
     *            the file name
     * @param zipOut
     *            the zip out
     */
    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }

        try (FileInputStream fis = new FileInputStream(fileToZip)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
        } catch (IOException e) {
            LOGGER.error("FileUtil.zipFile: ", e);
        }

    }

    /**
     * Replace in file.
     *
     * @param path
     *            the path
     * @param targetText
     *            the target text
     * @param newText
     *            the new text
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void replaceInFile(Path path, String targetText, String newText) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        String content = new String(Files.readAllBytes(path), charset);
        content = content.replaceAll(targetText, newText);
        Files.write(path, content.getBytes(charset));
    }

    /**
     * Copy.
     *
     * @param from
     *            the from
     * @param to
     *            the to
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void copy(Path from, Path to) throws IOException {
        createDirectories(to);
        Files.copy(from, to, REPLACE_EXISTING);
    }

    /**
     * Copy from jar.
     *
     * @param templatePath
     *            the template path
     * @param to
     *            the to
     * @return true, if successful
     */
    public static boolean copyFromJar(String templatePath, Path to) {
        LOGGER.info("saveFile to: {}", to);
        URL loadedResource = FileUtil.class.getClassLoader().getResource(templatePath);
        try (InputStream inputStream = loadedResource.openStream()) {
            Files.createDirectories(to.getParent());
            Files.copy(inputStream, to, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            LOGGER.error("Copy Resource Error", e);
            return false;
        }
    }
}
