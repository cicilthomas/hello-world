package com.cicilthomas.aws.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {	

		private static ApplicationContext applicationContext;
		
		/**
		 * Returns appliation context if exists else a new application context
		 * is created and is returned.
		 * @return
		 */
		public static synchronized ApplicationContext getApplicationContext() {
			if ( applicationContext == null ){
				applicationContext = SpringApplication.run(Application.class);
			}
			return applicationContext;
		}		
		
		/**
		 * Checks whether the context already exists in the container.
		 * @return
		 */
		public static String testApplicationContext() {			
			return ( applicationContext == null )?"Context created":"Context reused"; 
		}
		
}
