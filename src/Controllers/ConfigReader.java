
package Controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    /**
     * <pre>
     * "props" de tipo Properties es un obj que almacena las claves y valores del archivo .properties.
     * Es final porque solo se asigna una vez.
     * </pre>
     */
    private static final Properties props = new Properties();
    
    /**
     * <pre>
     * El bloque static{} SOLO SE EJECUTARÁ LA PRIMERA VEZ QUE ENTRES A LA CLASE
     * con la JVM (Java Virtual Machine). El contenido del bloque no se volverá a ejecutar más.
     * Lo guardado en variables se conserva en memoria.
     * </pre>
     */
    static{
        try(InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")){
            if (input == null){
                throw new RuntimeException("No se ha encontrado el archivo config.properties");
            }
            props.load(input);
            
        }catch(IOException e){
            throw new RuntimeException("Error al leer el archivo config.properties");
        }
    }
    
    public static String get(String key){
        return props.getProperty(key);
    }
}

