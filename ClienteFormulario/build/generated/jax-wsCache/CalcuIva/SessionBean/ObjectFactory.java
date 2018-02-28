
package SessionBean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the SessionBean package. 
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

    private final static QName _CalcuIvaResponse_QNAME = new QName("http://SessionBean/", "calcuIvaResponse");
    private final static QName _CalcuIva_QNAME = new QName("http://SessionBean/", "calcuIva");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: SessionBean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcuIvaResponse }
     * 
     */
    public CalcuIvaResponse createCalcuIvaResponse() {
        return new CalcuIvaResponse();
    }

    /**
     * Create an instance of {@link CalcuIva_Type }
     * 
     */
    public CalcuIva_Type createCalcuIva_Type() {
        return new CalcuIva_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcuIvaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SessionBean/", name = "calcuIvaResponse")
    public JAXBElement<CalcuIvaResponse> createCalcuIvaResponse(CalcuIvaResponse value) {
        return new JAXBElement<CalcuIvaResponse>(_CalcuIvaResponse_QNAME, CalcuIvaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcuIva_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://SessionBean/", name = "calcuIva")
    public JAXBElement<CalcuIva_Type> createCalcuIva(CalcuIva_Type value) {
        return new JAXBElement<CalcuIva_Type>(_CalcuIva_QNAME, CalcuIva_Type.class, null, value);
    }

}
