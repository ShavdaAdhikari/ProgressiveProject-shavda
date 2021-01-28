package propertiesConfig;

    import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.InputStream;
	import java.io.OutputStream;
	import java.util.Properties;






	public class PropertiesFile {
		
		
			
			static Properties prop=new Properties();
			
			//get system project path
			static String projectPath=System.getProperty("user.dir");
			
			
			public static void main(String[] args) {
				
				
				//get current properties
				getProperties();
				
				 //set custom properties
				
				setProperties();
				// get updated properties
				
				//getProperties();
				
				}

		
			public static void getProperties() {
				
				
				try {
					
					InputStream input=new FileInputStream(projectPath+ "/src/main/java/propertiesConfig/config.properties");
				
				prop.load(input);
				
				
				
				String browser=prop.getProperty("browser");
				String name=prop.getProperty("name");
				System.out.println(browser+ " is invoked");
				System.out.println(name+" is my name");
				
				PropertiesConfigBrowserClass.BrowserName=browser;
				}
				catch(Exception e) {
					e.getStackTrace();
				}
				
			
			}

		//set all the configuration for the properties file
			public static void setProperties() {
				
				try{
					
				//create a object of output stream to write to the config file
					OutputStream output=new FileOutputStream(projectPath+ "/src/main/java/propertiesConfig/config.properties");
					
					prop.setProperty("browser","firefox");
					prop.setProperty("result", "pass");
					
					
					
					prop.store(output, "googleHomePageTest");
					
					
				}catch(Exception e) {
					e.getStackTrace();
				}
			
				
			}
			
			
			
			}

		


