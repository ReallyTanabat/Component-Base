
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://service/", "helloResponse");
    private final static QName _CalCircumference_QNAME = new QName("http://service/", "calCircumference");
    private final static QName _CalArea_QNAME = new QName("http://service/", "calArea");
    private final static QName _CalCircumferenceResponse_QNAME = new QName("http://service/", "calCircumferenceResponse");
    private final static QName _Hello_QNAME = new QName("http://service/", "hello");
    private final static QName _CalAreaResponse_QNAME = new QName("http://service/", "calAreaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalCircumference }
     * 
     */
    public CalCircumference createCalCircumference() {
        return new CalCircumference();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CalAreaResponse }
     * 
     */
    public CalAreaResponse createCalAreaResponse() {
        return new CalAreaResponse();
    }

    /**
     * Create an instance of {@link CalArea }
     * 
     */
    public CalArea createCalArea() {
        return new CalArea();
    }

    /**
     * Create an instance of {@link CalCircumferenceResponse }
     * 
     */
    public CalCircumferenceResponse createCalCircumferenceResponse() {
        return new CalCircumferenceResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calCircumference")
    public JAXBElement<CalCircumference> createCalCircumference(CalCircumference value) {
        return new JAXBElement<CalCircumference>(_CalCircumference_QNAME, CalCircumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalArea }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calArea")
    public JAXBElement<CalArea> createCalArea(CalArea value) {
        return new JAXBElement<CalArea>(_CalArea_QNAME, CalArea.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalCircumferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calCircumferenceResponse")
    public JAXBElement<CalCircumferenceResponse> createCalCircumferenceResponse(CalCircumferenceResponse value) {
        return new JAXBElement<CalCircumferenceResponse>(_CalCircumferenceResponse_QNAME, CalCircumferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalAreaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "calAreaResponse")
    public JAXBElement<CalAreaResponse> createCalAreaResponse(CalAreaResponse value) {
        return new JAXBElement<CalAreaResponse>(_CalAreaResponse_QNAME, CalAreaResponse.class, null, value);
    }

}
