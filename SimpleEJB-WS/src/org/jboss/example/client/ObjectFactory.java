
package org.jboss.example.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jboss.example.client package. 
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

    private final static QName _SayGoodByeResponse_QNAME = new QName("http://webservices.samples.jboss.org/", "sayGoodByeResponse");
    private final static QName _BasicException_QNAME = new QName("http://webservices.samples.jboss.org/", "BasicException");
    private final static QName _MultipleArgs_QNAME = new QName("http://webservices.samples.jboss.org/", "multipleArgs");
    private final static QName _MultipleArgsResponse_QNAME = new QName("http://webservices.samples.jboss.org/", "multipleArgsResponse");
    private final static QName _SayGoodBye_QNAME = new QName("http://webservices.samples.jboss.org/", "sayGoodBye");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.example.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultipleArgs }
     * 
     */
    public MultipleArgs createMultipleArgs() {
        return new MultipleArgs();
    }

    /**
     * Create an instance of {@link MultipleArgsResponse }
     * 
     */
    public MultipleArgsResponse createMultipleArgsResponse() {
        return new MultipleArgsResponse();
    }

    /**
     * Create an instance of {@link SomeRestrictedObject }
     * 
     */
    public SomeRestrictedObject createSomeRestrictedObject() {
        return new SomeRestrictedObject();
    }

    /**
     * Create an instance of {@link BasicException }
     * 
     */
    public BasicException createBasicException() {
        return new BasicException();
    }

    /**
     * Create an instance of {@link SayGoodByeResponse }
     * 
     */
    public SayGoodByeResponse createSayGoodByeResponse() {
        return new SayGoodByeResponse();
    }

    /**
     * Create an instance of {@link SayGoodBye }
     * 
     */
    public SayGoodBye createSayGoodBye() {
        return new SayGoodBye();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodByeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.jboss.org/", name = "sayGoodByeResponse")
    public JAXBElement<SayGoodByeResponse> createSayGoodByeResponse(SayGoodByeResponse value) {
        return new JAXBElement<SayGoodByeResponse>(_SayGoodByeResponse_QNAME, SayGoodByeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.jboss.org/", name = "BasicException")
    public JAXBElement<BasicException> createBasicException(BasicException value) {
        return new JAXBElement<BasicException>(_BasicException_QNAME, BasicException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleArgs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.jboss.org/", name = "multipleArgs")
    public JAXBElement<MultipleArgs> createMultipleArgs(MultipleArgs value) {
        return new JAXBElement<MultipleArgs>(_MultipleArgs_QNAME, MultipleArgs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleArgsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.jboss.org/", name = "multipleArgsResponse")
    public JAXBElement<MultipleArgsResponse> createMultipleArgsResponse(MultipleArgsResponse value) {
        return new JAXBElement<MultipleArgsResponse>(_MultipleArgsResponse_QNAME, MultipleArgsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodBye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.samples.jboss.org/", name = "sayGoodBye")
    public JAXBElement<SayGoodBye> createSayGoodBye(SayGoodBye value) {
        return new JAXBElement<SayGoodBye>(_SayGoodBye_QNAME, SayGoodBye.class, null, value);
    }

}
