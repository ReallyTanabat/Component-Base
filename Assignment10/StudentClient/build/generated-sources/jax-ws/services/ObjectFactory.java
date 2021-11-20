
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _DeleteStudent_QNAME = new QName("http://services/", "deleteStudent");
    private final static QName _FindStudentById_QNAME = new QName("http://services/", "findStudentById");
    private final static QName _InsertStudent_QNAME = new QName("http://services/", "insertStudent");
    private final static QName _InsertStudentResponse_QNAME = new QName("http://services/", "insertStudentResponse");
    private final static QName _UpdateStudent_QNAME = new QName("http://services/", "updateStudent");
    private final static QName _FindStudentByIdResponse_QNAME = new QName("http://services/", "findStudentByIdResponse");
    private final static QName _DeleteStudentResponse_QNAME = new QName("http://services/", "deleteStudentResponse");
    private final static QName _Student_QNAME = new QName("http://services/", "student");
    private final static QName _UpdateStudentResponse_QNAME = new QName("http://services/", "updateStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertStudentResponse }
     * 
     */
    public InsertStudentResponse createInsertStudentResponse() {
        return new InsertStudentResponse();
    }

    /**
     * Create an instance of {@link InsertStudent }
     * 
     */
    public InsertStudent createInsertStudent() {
        return new InsertStudent();
    }

    /**
     * Create an instance of {@link DeleteStudentResponse }
     * 
     */
    public DeleteStudentResponse createDeleteStudentResponse() {
        return new DeleteStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     * 
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link FindStudentByIdResponse }
     * 
     */
    public FindStudentByIdResponse createFindStudentByIdResponse() {
        return new FindStudentByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteStudent }
     * 
     */
    public DeleteStudent createDeleteStudent() {
        return new DeleteStudent();
    }

    /**
     * Create an instance of {@link FindStudentById }
     * 
     */
    public FindStudentById createFindStudentById() {
        return new FindStudentById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteStudent")
    public JAXBElement<DeleteStudent> createDeleteStudent(DeleteStudent value) {
        return new JAXBElement<DeleteStudent>(_DeleteStudent_QNAME, DeleteStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentById")
    public JAXBElement<FindStudentById> createFindStudentById(FindStudentById value) {
        return new JAXBElement<FindStudentById>(_FindStudentById_QNAME, FindStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudent")
    public JAXBElement<InsertStudent> createInsertStudent(InsertStudent value) {
        return new JAXBElement<InsertStudent>(_InsertStudent_QNAME, InsertStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertStudentResponse")
    public JAXBElement<InsertStudentResponse> createInsertStudentResponse(InsertStudentResponse value) {
        return new JAXBElement<InsertStudentResponse>(_InsertStudentResponse_QNAME, InsertStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIdResponse")
    public JAXBElement<FindStudentByIdResponse> createFindStudentByIdResponse(FindStudentByIdResponse value) {
        return new JAXBElement<FindStudentByIdResponse>(_FindStudentByIdResponse_QNAME, FindStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteStudentResponse")
    public JAXBElement<DeleteStudentResponse> createDeleteStudentResponse(DeleteStudentResponse value) {
        return new JAXBElement<DeleteStudentResponse>(_DeleteStudentResponse_QNAME, DeleteStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

}
