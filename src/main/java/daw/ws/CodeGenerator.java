package daw.ws;
import org.apache.cxf.tools.wsdlto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CodeGenerator {

	public static void main(String[] args) {
		 final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);

		 System.setProperty("javax.xml.accessExternalSchema", "all");
		WSDLToJava.main(new String[]{
				"-server",
				"-d", "src/main/java",
				"src/main/resources/SimpleService.wsdl"

	});
		System.out.println("Done! ;)");
	}
}
