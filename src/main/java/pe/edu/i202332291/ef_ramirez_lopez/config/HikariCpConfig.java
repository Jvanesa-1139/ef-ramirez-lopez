package pe.edu.i202332291.ef_ramirez_lopez.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HikariCpConfig {

    @Value("${DB_WORLD_URL}")
    private String dbFabricUrl;
    @Value("${DB_WORLD_USER}")
    private String dbFabricUser;
    @Value("${DB_WORLD_PASS}")
    private String dbFabricPass;
    @Value("${DB_WORLD_DRIVER}")
    private String dbFabricDriver;

    @Bean
    public HikariDataSource hikariDataSource() {

        HikariConfig config = new HikariConfig();

        /**
         * Configurar propiedad de conexion a BD
         */
        config.setJdbcUrl(dbFabricUrl);
        config.setUsername(dbFabricUser);
        config.setPassword(dbFabricPass);
        config.setDriverClassName(dbFabricDriver);

        System.out.println("DB_WORLD_URL: " + dbFabricUrl);
        System.out.println("DB_WORLD_USER: " + dbFabricUser);
        System.out.println("DB_WORLD_PASS: " + dbFabricPass);
        System.out.println("DB_WORLD_DRIVER: " + dbFabricDriver);

        /**
         * Configurar propiedades del pool de HikariCP
         * - MaximumPoolSize: Máximo # de conexiones del pool.
         * - MinimumIdle: Mínimo # de conexiones inactivas del pool.
         * - IdleTimeout: Tiempo máximo de espera para
         *      eliminar una conexión inactiva.
         * - ConnectionTimeout: Tiempo máximo de espera
         *
         *      para conectarse a la BD.
         */
        config.setMaximumPoolSize(20);
        config.setMinimumIdle(5);
        config.setIdleTimeout(300000);
        config.setConnectionTimeout(30000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);

    }


}

