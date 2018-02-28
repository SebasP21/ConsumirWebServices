
package SessionBeanSuma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SessionBeanSuma package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcuSuma_QNAME = new QName("http://SessionBean/", "calcuSuma");
    private final static QName _CalcuSumaResponse_QNAME = new QName("http://SessionBean/", "calcuSumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SessionBeanSuma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcuSuma_Type }
     * 
     */
    public CalcuSuma_Type createCalcuSuma_Type() {
        return new CalcuSuma_Type();
    }

    /**
     * Create an instance of {@link CalcuSumaResponse }
     * 
     */
    public CalcuSumaResponse createCalcuSumaResponse() {
        return new CalcuSumaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcuSuma_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SessionBean/", name = "calcuSuma")
    public JAXBElement<CalcuSuma_Type> createCalcuSuma(CalcuSuma_Type value) {
        return new JAXBElement<CalcuSuma_Type>(_CalcuSuma_QNAME, CalcuSuma_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcuSumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SessionBean/", name = "calcuSumaResponse")
    public JAXBElement<CalcuSumaResponse> createCalcuSumaResponse(CalcuSumaResponse value) {
        return new JAXBElement<CalcuSumaResponse>(_CalcuSumaResponse_QNAME, CalcuSumaResponse.class, null, value);
    }

}
