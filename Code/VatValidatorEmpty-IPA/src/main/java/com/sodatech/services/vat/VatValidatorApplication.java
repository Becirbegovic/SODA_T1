package com.sodatech.services.vat;

import com.sodatech.services.vat.client.VatServiceClientImpl;
import com.sodatech.services.vat.generated.CheckVatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

@Configuration
@SpringBootApplication
@EnableCaching
@EnableAspectJAutoProxy
@ServletComponentScan
//@ComponentScan(value = "com.sodatech.services.vat")
@Slf4j
public class VatValidatorApplication {
    /**
     * Spring boot application's main method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        final ApplicationContext ctx = SpringApplication.run(VatValidatorApplication.class, args);
        if (null == ctx) {
            final IllegalStateException e = new IllegalStateException("Vat Validator application application not initialized. This should never happened.");
            LOGGER.error(e.getMessage(), e);
            throw new IllegalStateException(e);
        }
    }

/*
    @Bean
    CommandLineRunner lookup(VatServiceClientImpl quoteClient){
        return args -> {
            String countryId = "DE";
            String vatId = "325114412";

            if (args.length > 0){
                countryId = args[0];
                vatId = args[1];
            }
            CheckVatResponse response = quoteClient.validateVatUsingSoapService(vatId,countryId);
            System.err.println(response.isValid());
        };
    }
*/
    /**
     * Sets a pid for this application.
     *
     * @throws IOException If the pid file could not be written to the file system.
     */
    @PostConstruct
    private void processPid() throws IOException {
        final File file = new File("application.pid");
        new ApplicationPid().write(file);
        file.deleteOnExit();
    }
}
